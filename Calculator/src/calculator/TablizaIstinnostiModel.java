package calculator;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TablizaIstinnostiModel extends DefaultTableModel {

    public List<Object> elements;
    public TablizaIstinnostiModel(JTextArea display) {
        ANTRL(display.getText());
    }

    private void ANTRL(String text) {
        LogicalCalculatorParser parser = new LogicalCalculatorParser(new CommonTokenStream(new LogicalCalculatorLexer(new ANTLRInputStream(text))));
        ParseTree tree = parser.start();
        if (tree != null) {
           ParseTreeWalker.DEFAULT.walk(new Listener(), tree);
        }

    }
    
    public void parse(ParseTree node) {
        System.out.println(node.getPayload());
//        System.out.println(node.toStringTree());
        for(int i =0; i<node.getChildCount(); i++) {
            parse(node.getChild(i));
        }
    }
}
