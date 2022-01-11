// Generated from F:/Labs/HLEF/src/main/resources/antlr\Hlef.g4 by ANTLR 4.9.2
package me.salmonmoses.hlef;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HlefParser}.
 */
public interface HlefListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HlefParser#argName}.
	 * @param ctx the parse tree
	 */
	void enterArgName(HlefParser.ArgNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#argName}.
	 * @param ctx the parse tree
	 */
	void exitArgName(HlefParser.ArgNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#macroUseName}.
	 * @param ctx the parse tree
	 */
	void enterMacroUseName(HlefParser.MacroUseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#macroUseName}.
	 * @param ctx the parse tree
	 */
	void exitMacroUseName(HlefParser.MacroUseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#argUse}.
	 * @param ctx the parse tree
	 */
	void enterArgUse(HlefParser.ArgUseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#argUse}.
	 * @param ctx the parse tree
	 */
	void exitArgUse(HlefParser.ArgUseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#rangeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRangeLiteral(HlefParser.RangeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#rangeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRangeLiteral(HlefParser.RangeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#grouping}.
	 * @param ctx the parse tree
	 */
	void enterGrouping(HlefParser.GroupingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#grouping}.
	 * @param ctx the parse tree
	 */
	void exitGrouping(HlefParser.GroupingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(HlefParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(HlefParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#macroUse}.
	 * @param ctx the parse tree
	 */
	void enterMacroUse(HlefParser.MacroUseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#macroUse}.
	 * @param ctx the parse tree
	 */
	void exitMacroUse(HlefParser.MacroUseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(HlefParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(HlefParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArguments(HlefParser.FunctionArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArguments(HlefParser.FunctionArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(HlefParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(HlefParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(HlefParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(HlefParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(HlefParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(HlefParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(HlefParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(HlefParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(HlefParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(HlefParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#logicAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicAnd(HlefParser.LogicAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#logicAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicAnd(HlefParser.LogicAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#logicOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicOr(HlefParser.LogicOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#logicOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicOr(HlefParser.LogicOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#errorHandler}.
	 * @param ctx the parse tree
	 */
	void enterErrorHandler(HlefParser.ErrorHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#errorHandler}.
	 * @param ctx the parse tree
	 */
	void exitErrorHandler(HlefParser.ErrorHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#argumentsDecl}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsDecl(HlefParser.ArgumentsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#argumentsDecl}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsDecl(HlefParser.ArgumentsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(HlefParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(HlefParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HlefParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HlefParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(HlefParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(HlefParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HlefParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HlefParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlefParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(HlefParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlefParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(HlefParser.FormulaContext ctx);
}