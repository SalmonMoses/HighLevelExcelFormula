package compiler

import BinaryOperator
import FunctionCall
import IfExpr
import LiteralExpression
import MacroArgExpr
import MacroUseExpr
import UnaryOperator

interface ExpressionVisitor<T> {
    fun visitLiteral(expr: LiteralExpression): T
    fun visitBinaryOperator(expr: BinaryOperator): T
    fun visitUnaryOperator(expr: UnaryOperator): T
    fun visitFunctionCall(expr: FunctionCall): T
    fun visitIfExpr(expr: IfExpr): T
    fun visitMacroUseExpr(expr: MacroUseExpr): T
    fun visitMacroArgUse(expr: MacroArgExpr): T
}