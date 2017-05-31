package calculator;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ConsolLogListener implements LogicalCalculatorListener {

    @Override
    public void visitErrorNode(ErrorNode node) {
        System.out.println("visitErrorNode");
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        System.out.println("visitTerminal\t\t\t" + node);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        System.out.println("exitEveryRule");
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("enterEveryRule");
    }

    @Override
    public void exitCkob(LogicalCalculatorParser.CkobContext ctx) {
         System.out.println("exitCkob");
    }

    @Override
    public void enterCkob(LogicalCalculatorParser.CkobContext ctx) {
         System.out.println("enterCkob");
    }

    @Override
    public void exitNot(LogicalCalculatorParser.NotContext ctx) {
         System.out.println("exitNot");
    }

    @Override
    public void enterNot(LogicalCalculatorParser.NotContext ctx) {
         System.out.println("enterNot");
    }

    @Override
    public void exitSchaeffer(LogicalCalculatorParser.SchaefferContext ctx) {
         System.out.println("exitSchaeffer");
    }

    @Override
    public void enterSchaeffer(LogicalCalculatorParser.SchaefferContext ctx) {
         System.out.println("enterSchaeffer");
    }

    @Override
    public void exitPierce(LogicalCalculatorParser.PierceContext ctx) {
         System.out.println("exitPierce");
    }

    @Override
    public void enterPierce(LogicalCalculatorParser.PierceContext ctx) {
         System.out.println("enterPierce");
    }

    @Override
    public void exitConjunction(LogicalCalculatorParser.ConjunctionContext ctx) {
         System.out.println("exitConjunction!!!!!!!!!!!!");
    }

    @Override
    public void enterConjunction(LogicalCalculatorParser.ConjunctionContext ctx) {
         System.out.println("enterConjunction!!!!!!!!!!!");
    }

    @Override
    public void exitSum(LogicalCalculatorParser.SumContext ctx) {
         System.out.println("exitSum");
    }

    @Override
    public void enterSum(LogicalCalculatorParser.SumContext ctx) {
         System.out.println("enterSum");
    }

    @Override
    public void exitImplication(LogicalCalculatorParser.ImplicationContext ctx) {
         System.out.println("exitImplication");
    }

    @Override
    public void enterImplication(LogicalCalculatorParser.ImplicationContext ctx) {
         System.out.println("enterImplication");
    }

    @Override
    public void exitEquivalence(LogicalCalculatorParser.EquivalenceContext ctx) {
         System.out.println("exitEquivalence");
    }

    @Override
    public void enterEquivalence(LogicalCalculatorParser.EquivalenceContext ctx) {
        System.out.println("enterEquivalence");
    }

    @Override
    public void exitExpression(LogicalCalculatorParser.ExpressionContext ctx) {
         System.out.println("exitExpression");
    }

    @Override
    public void enterExpression(LogicalCalculatorParser.ExpressionContext ctx) {
         System.out.println("enterExpression");
    }

    @Override
    public void exitStart(LogicalCalculatorParser.StartContext ctx) {
         System.out.println("exitStart");
    }

    @Override
    public void enterStart(LogicalCalculatorParser.StartContext ctx) {
         System.out.println("enterStart");
    }

    @Override
    public void exitDizjunction(LogicalCalculatorParser.DizjunctionContext ctx) {
         System.out.println("exitDizjunction!!!!!!!!!!!!!!");
    }

    @Override
    public void enterDizjunction(LogicalCalculatorParser.DizjunctionContext ctx) {
         System.out.println("enterDizjunction!!!!!!!!!!!!!!");
    }

    @Override
    public void enterVar(LogicalCalculatorParser.VarContext ctx) {
        System.out.println("enterVar" + ctx.getText());
    }

    @Override
    public void exitVar(LogicalCalculatorParser.VarContext ctx) {
        System.out.println("exitVar\t\t\t" + ctx.getText());
    }

}