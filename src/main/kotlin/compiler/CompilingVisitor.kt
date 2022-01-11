package compiler

import BinaryOperator
import Expression
import FunctionCall
import IfExpr
import LiteralExpression
import MacroArgExpr
import MacroUseExpr
import UnaryOperator

class CompilingVisitor : ExpressionVisitor<String> {
    private var currentScope: MacroScope? = null

    fun compile(expr: Expression): String {
        val compiledExpression = expr.visit(this)
        return "=$compiledExpression"
    }

    override fun visitBinaryOperator(expr: BinaryOperator): String {
        val left = expr.left.visit(this)
        val right = expr.right.visit(this)
        return "$left ${expr.operator} $right"
    }

    override fun visitUnaryOperator(expr: UnaryOperator): String {
        val value = expr.expr.visit(this)
        return "${expr.operator}$value"
    }

    override fun visitFunctionCall(expr: FunctionCall): String {
        val args = expr.args.map { it.visit(this) }.joinToString("; ")
        return "${expr.funcName.uppercase()}($args)"
    }

    override fun visitIfExpr(expr: IfExpr): String {
        val condition = expr.condition.visit(this)
        val thenBlock = expr.thenBlock?.visit(this) ?: ""
        val elseBlock = expr.elseBlock?.visit(this) ?: ""
        return "IF($condition; $thenBlock; $elseBlock)"
    }

    override fun visitLiteral(expr: LiteralExpression): String {
        return expr.value.toString()
    }

    override fun visitMacroUseExpr(expr: MacroUseExpr): String {
        val scope = expr.macro.args.zip(expr.args).toMap()
        currentScope = MacroScope(scope)
        val compiledInlinedExpr = expr.macro.expr.visit(this)
        currentScope = null
        return compiledInlinedExpr
    }

    override fun visitMacroArgUse(expr: MacroArgExpr): String {
        if (currentScope == null) {
            return ""
        }
        return currentScope?.resolve(expr.name)?.visit(this) ?: ""
    }
}