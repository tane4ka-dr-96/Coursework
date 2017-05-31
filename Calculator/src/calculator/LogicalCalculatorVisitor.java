package calculator;
// Generated from C:\Users\intel\LogicalCalculator.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogicalCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogicalCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogicalCalculatorParser#equivalence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivalence(@NotNull LogicalCalculatorParser.EquivalenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogicalCalculatorParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull LogicalCalculatorParser.NotContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogicalCalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull LogicalCalculatorParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogicalCalculatorParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(@NotNull LogicalCalculatorParser.ConjunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogicalCalculatorParser#ckob}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCkob(@NotNull LogicalCalculatorParser.CkobContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogicalCalculatorParser#implication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplication(@NotNull LogicalCalculatorParser.ImplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogicalCalculatorParser#schaeffer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchaeffer(@NotNull LogicalCalculatorParser.SchaefferContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogicalCalculatorParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull LogicalCalculatorParser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogicalCalculatorParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull LogicalCalculatorParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogicalCalculatorParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(@NotNull LogicalCalculatorParser.SumContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogicalCalculatorParser#pierce}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPierce(@NotNull LogicalCalculatorParser.PierceContext ctx);

	/**
	 * Visit a parse tree produced by {@link LogicalCalculatorParser#dizjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDizjunction(@NotNull LogicalCalculatorParser.DizjunctionContext ctx);
}