// Generated from F:/Labs/HLEF/src/main/resources/antlr\Hlef.g4 by ANTLR 4.9.2
package me.salmonmoses.hlef;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HlefParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HlefVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HlefParser#argName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgName(HlefParser.ArgNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#macroUseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroUseName(HlefParser.MacroUseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#argUse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgUse(HlefParser.ArgUseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#rangeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeLiteral(HlefParser.RangeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#grouping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping(HlefParser.GroupingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(HlefParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#macroUse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroUse(HlefParser.MacroUseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(HlefParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#functionArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArguments(HlefParser.FunctionArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(HlefParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(HlefParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(HlefParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(HlefParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(HlefParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#logicAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAnd(HlefParser.LogicAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#logicOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOr(HlefParser.LogicOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#errorHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorHandler(HlefParser.ErrorHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#argumentsDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsDecl(HlefParser.ArgumentsDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(HlefParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(HlefParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(HlefParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HlefParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlefParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(HlefParser.FormulaContext ctx);
}