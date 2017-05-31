package calculator;
// Generated from C:\Users\intel\LogicalCalculator.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogicalCalculatorParser}.
 */
public interface LogicalCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#equivalence}.
	 * @param ctx the parse tree
	 */
	void enterEquivalence(@NotNull LogicalCalculatorParser.EquivalenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#equivalence}.
	 * @param ctx the parse tree
	 */
	void exitEquivalence(@NotNull LogicalCalculatorParser.EquivalenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull LogicalCalculatorParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull LogicalCalculatorParser.NotContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull LogicalCalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull LogicalCalculatorParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(@NotNull LogicalCalculatorParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(@NotNull LogicalCalculatorParser.ConjunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#ckob}.
	 * @param ctx the parse tree
	 */
	void enterCkob(@NotNull LogicalCalculatorParser.CkobContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#ckob}.
	 * @param ctx the parse tree
	 */
	void exitCkob(@NotNull LogicalCalculatorParser.CkobContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#implication}.
	 * @param ctx the parse tree
	 */
	void enterImplication(@NotNull LogicalCalculatorParser.ImplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#implication}.
	 * @param ctx the parse tree
	 */
	void exitImplication(@NotNull LogicalCalculatorParser.ImplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#schaeffer}.
	 * @param ctx the parse tree
	 */
	void enterSchaeffer(@NotNull LogicalCalculatorParser.SchaefferContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#schaeffer}.
	 * @param ctx the parse tree
	 */
	void exitSchaeffer(@NotNull LogicalCalculatorParser.SchaefferContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull LogicalCalculatorParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull LogicalCalculatorParser.VarContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull LogicalCalculatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull LogicalCalculatorParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(@NotNull LogicalCalculatorParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(@NotNull LogicalCalculatorParser.SumContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#pierce}.
	 * @param ctx the parse tree
	 */
	void enterPierce(@NotNull LogicalCalculatorParser.PierceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#pierce}.
	 * @param ctx the parse tree
	 */
	void exitPierce(@NotNull LogicalCalculatorParser.PierceContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogicalCalculatorParser#dizjunction}.
	 * @param ctx the parse tree
	 */
	void enterDizjunction(@NotNull LogicalCalculatorParser.DizjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicalCalculatorParser#dizjunction}.
	 * @param ctx the parse tree
	 */
	void exitDizjunction(@NotNull LogicalCalculatorParser.DizjunctionContext ctx);
}