import compiler.ExpressionVisitor

sealed class Expression {
    abstract fun <T> visit(visitor: ExpressionVisitor<T>): T
}

data class LiteralExpression(val value: Any): Expression() {
    override fun <T> visit(visitor: ExpressionVisitor<T>): T {
        return visitor.visitLiteral(this)
    }

}

data class BinaryOperator(val left: Expression, val right: Expression, val operator: String) : Expression() {
    override fun <T> visit(visitor: ExpressionVisitor<T>): T {
        return visitor.visitBinaryOperator(this)
    }
}

data class UnaryOperator(val expr: Expression, val operator: String) : Expression() {
    override fun <T> visit(visitor: ExpressionVisitor<T>): T {
        return visitor.visitUnaryOperator(this)
    }
}

data class FunctionCall(val funcName: String, val args: List<Expression>) : Expression() {
    override fun <T> visit(visitor: ExpressionVisitor<T>): T {
        return visitor.visitFunctionCall(this)
    }
}

data class IfExpr(val condition: Expression, val thenBlock: Expression?, val elseBlock: Expression?) : Expression() {
    override fun <T> visit(visitor: ExpressionVisitor<T>): T {
        return visitor.visitIfExpr(this)
    }
}

data class MacroUseExpr(val macro: Macro, val args: List<Expression>) : Expression() {
    override fun <T> visit(visitor: ExpressionVisitor<T>): T {
        return visitor.visitMacroUseExpr(this)
    }
}

data class MacroArgExpr(val name: String) : Expression() {
    override fun <T> visit(visitor: ExpressionVisitor<T>): T {
        return visitor.visitMacroArgUse(this)
    }
}