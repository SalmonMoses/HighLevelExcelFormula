import exceptions.*
import me.salmonmoses.hlef.HlefBaseVisitor
import me.salmonmoses.hlef.HlefParser

class HlefVisitor : HlefBaseVisitor<Expression?>() {
    var scope = Scope(null)
    var currentMacroScope: MacroDeclarationScope? = null

    override fun visitIfExpr(ctx: HlefParser.IfExprContext?): Expression {
        val condition = visitExpr(ctx?.cond)!!
        val thenBlock = visitBlock(ctx?.thenBlock)
        var elseBlock: Expression? = null
        if (ctx?.elseBlock != null) {
            elseBlock = visitBlock(ctx.elseBlock)
        }
        if (ctx?.elifCond?.size == 0) {
            return IfExpr(condition, thenBlock, elseBlock)
        }

        var lastExpr: Expression? = elseBlock
        for (i in (ctx?.elifCond?.size ?: 1) - 1 downTo 0) {
            val elifCond = visitExpr(ctx?.elifCond!![i])!!
            val elifBlock = visitBlock(ctx.elifExpr[i])
            lastExpr = IfExpr(elifCond, elifBlock, lastExpr)
        }
        return IfExpr(condition, thenBlock, lastExpr)
    }

    override fun visitGrouping(ctx: HlefParser.GroupingContext?): Expression {
        return visitExpr(ctx?.expr())!!
    }

    override fun visitFactor(ctx: HlefParser.FactorContext?): Expression {
        val left = visitUnary(ctx?.left)!!
        var expression: Expression = left
        for (i in 0 until (ctx?.op?.size ?: 0)) {
            val op = ctx?.op!![i].text
            val right = visitUnary(ctx.right!![i])!!
            expression = BinaryOperator(expression, right, op)
        }

        return expression
    }

    override fun visitTerm(ctx: HlefParser.TermContext?): Expression {
        val left = visitFactor(ctx?.left)
        var expression: Expression = left
        for (i in 0 until (ctx?.op?.size ?: 0)) {
            val op = ctx?.op!![i].text
            val right = visitFactor(ctx.right!![i])
            expression = BinaryOperator(expression, right, op)
        }

        return expression
    }

    override fun visitComparison(ctx: HlefParser.ComparisonContext?): Expression {
        val left = visitTerm(ctx?.left)
        var expression: Expression = left
        for (i in 0 until (ctx?.op?.size ?: 0)) {
            val op = ctx?.op!![i].text
            val right = visitTerm(ctx.right!![i])
            expression = BinaryOperator(expression, right, op)
        }

        return expression
    }

    override fun visitEquality(ctx: HlefParser.EqualityContext?): Expression {
        val left = visitComparison(ctx?.left)
        var expression: Expression = left
        for (i in 0 until (ctx?.op?.size ?: 0)) {
            val op = ctx?.op!![i].text
            val right = visitComparison(ctx.right!![i])
            expression = BinaryOperator(expression, right, op)
        }

        return expression
    }

    override fun visitLogicAnd(ctx: HlefParser.LogicAndContext?): Expression {
        val left = visitEquality(ctx?.left)
        if ((ctx?.right?.size ?: 0) != 0) {
            val op = "AND"
            val right = ctx?.right?.map { visitEquality(it) }!!

            return FunctionCall(op, listOf(left) + right)
        } else {
            return left
        }
    }

    override fun visitLogicOr(ctx: HlefParser.LogicOrContext?): Expression {
        val left = visitLogicAnd(ctx?.left)
        if ((ctx?.right?.size ?: 0) != 0) {
            val op = "OR"
            val right = ctx?.right?.map { visitLogicAnd(it) }!!

            return FunctionCall(op, listOf(left) + right)
        } else {
            return left
        }
    }

    override fun visitBlock(ctx: HlefParser.BlockContext?): Expression {
        scope = scope.branch()
        for (decl in (ctx?.decl() ?: listOf())) {
            visitDecl(decl)
        }
        val expr = visitExpr(ctx?.expr())!!
        scope = scope.parent!!
        return expr
    }

    override fun visitPrimary(ctx: HlefParser.PrimaryContext?): Expression? {
        return if (ctx?.TRUE() != null) {
            LiteralExpression("TRUE")
        } else if (ctx?.FALSE() != null) {
            LiteralExpression("FALSE")
        } else if (ctx?.NUMBER() != null) {
            LiteralExpression(ctx.NUMBER()?.text?.toDouble() ?: 0)
        } else if (ctx?.rangeLiteral() != null) {
            LiteralExpression(ctx.rangeLiteral().text)
        } else if (ctx?.STRING() != null) {
            LiteralExpression(ctx.STRING().text)
        } else if (ctx?.argUse() != null) {
            visitArgUse(ctx.argUse())
        } else {
            LiteralExpression("")
        }
    }

    override fun visitCall(ctx: HlefParser.CallContext?): Expression {
        val funcName = ctx?.ID()?.text ?: ""
        val args = ctx?.args?.args?.mapNotNull { visitExpr(it) } ?: listOf()
        return FunctionCall(funcName, args)
    }

    override fun visitUnary(ctx: HlefParser.UnaryContext?): Expression? {
        if (ctx == null) {
            throw NullExpressionException(null)
        }

        if (ctx.call() != null) {
            return visitCall(ctx.call())
        } else if (ctx.primary() != null) {
            return visitPrimary(ctx.primary())
        } else if (ctx.macroUse() != null) {
            return visitMacroUse(ctx.macroUse())
        }

        val right = visitUnary(ctx.unary())!!
        if (ctx.NOT() != null) {
            return FunctionCall("NOT", listOf(right))
        } else if (ctx.MINUS() != null) {
            return UnaryOperator(right, "-")
        }

        throw NullExpressionException(ctx)
    }

    override fun visitFormula(ctx: HlefParser.FormulaContext?): Expression? {
        for (decl in ctx?.decl()!!) {
            visitDecl(decl)
        }
        return visitExpr(ctx.expr())
    }

    override fun visitErrorHandler(ctx: HlefParser.ErrorHandlerContext?): Expression {
        val expr = visitLogicOr(ctx?.expression)
        return if (ctx?.handler != null) {
            val handler = visitExpr(ctx.handler)!!
            FunctionCall("IFERROR", listOf(expr, handler))
        } else {
            expr
        }
    }

    override fun visitMacroUse(ctx: HlefParser.MacroUseContext?): Expression? {
        val macroName = ctx?.macroUseName()?.ID()?.text ?: return null
        val macro = scope.resolve(macroName) ?: throw UndefinedMacroException(macroName)
        val args = mutableListOf<Expression>()
        if(ctx.args != null) {
            for (arg in ctx.args?.args!!) {
                args += visitExpr(arg)!!
            }
        }
        if (args.size < macro.arity) {
            throw NotEnoughArgumentsException(macroName, macro.arity, args.size)
        }
        if (args.size > macro.arity) {
            throw TooManyArgumentsException(macroName, macro.arity, args.size)
        }
        return MacroUseExpr(macro, args)
    }

    override fun visitArgUse(ctx: HlefParser.ArgUseContext?): Expression? {
        if (currentMacroScope == null) {
            throw ArgOutsideMacroException()
        }
        val argName = ctx?.argName()?.text!!
        if (argName !in currentMacroScope!!) {
            throw UndefinedMacroArgException(argName)
        }
        return MacroArgExpr(argName)
    }

    override fun visitDecl(ctx: HlefParser.DeclContext?): Expression? {
        val name = ctx?.name?.ID()?.text ?: ""
        val args = mutableListOf<String>()
        if (ctx?.argumentsDecl() != null) {
            for (arg in ctx.argumentsDecl().argName()!!) {
                args += arg.text
            }
        }
        currentMacroScope = MacroDeclarationScope(args)
        val expr = visitExpr(ctx?.body)!!
        currentMacroScope = null
        val macro = Macro(expr, args, scope)
        scope.registerMacro(name, macro)
        return null
    }
}