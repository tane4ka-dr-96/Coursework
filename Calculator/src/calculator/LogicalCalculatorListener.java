package calculator;
// Generated from LogicalCalculator.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogicalCalculatorParser}.
 */
public interface LogicalCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(LogicalCalculatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(LogicalCalculatorParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LogicalCalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LogicalCalculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#equivalence}.
	 * @param ctx the parse tree
	 */
	void enterEquivalence(LogicalCalculatorParser.EquivalenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#equivalence}.
	 * @param ctx the parse tree
	 */
	void exitEquivalence(LogicalCalculatorParser.EquivalenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#implication}.
	 * @param ctx the parse tree
	 */
	void enterImplication(LogicalCalculatorParser.ImplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#implication}.
	 * @param ctx the parse tree
	 */
	void exitImplication(LogicalCalculatorParser.ImplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(LogicalCalculatorParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(LogicalCalculatorParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#dizjunction}.
	 * @param ctx the parse tree
	 */
	void enterDizjunction(LogicalCalculatorParser.DizjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#dizjunction}.
	 * @param ctx the parse tree
	 */
	void exitDizjunction(LogicalCalculatorParser.DizjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(LogicalCalculatorParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(LogicalCalculatorParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#pierce}.
	 * @param ctx the parse tree
	 */
	void enterPierce(LogicalCalculatorParser.PierceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#pierce}.
	 * @param ctx the parse tree
	 */
	void exitPierce(LogicalCalculatorParser.PierceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#schaeffer}.
	 * @param ctx the parse tree
	 */
	void enterSchaeffer(LogicalCalculatorParser.SchaefferContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#schaeffer}.
	 * @param ctx the parse tree
	 */
	void exitSchaeffer(LogicalCalculatorParser.SchaefferContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(LogicalCalculatorParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(LogicalCalculatorParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#ckob}.
	 * @param ctx the parse tree
	 */
	void enterCkob(LogicalCalculatorParser.CkobContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#ckob}.
	 * @param ctx the parse tree
	 */
	void exitCkob(LogicalCalculatorParser.CkobContext ctx);
}