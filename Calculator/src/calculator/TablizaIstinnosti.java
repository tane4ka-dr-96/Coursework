package calculator;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class TablizaIstinnosti extends JFrame {

    public JTable trianglematrixtable;
    public JLayeredPane lPanel;
    public VariablesExtractorListener vel = new VariablesExtractorListener();
    
  
    TablizaIstinnosti(JTextArea display) {
        super("Таблица истинности");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(400, 400);
        lPanel = getLayeredPane();
        Object[][] date = {
            {0,0,0,1},
            {0,0,1,1},
            {0,1,0,1},
            {0,1,1,1},
            {1,0,0,0},
            {1,0,1,0},
            {1,1,0,0},
            {1,1,1,1},
        };
        Object[] name = {"A","B","F","A->B\u02C4F"};
        JTable table = new JTable(date,name);
        JScrollPane scrlp = new JScrollPane(table); 
        table.setFillsViewportHeight(true); 
        lPanel.setLayout(new BorderLayout()); 
        lPanel.add(table.getTableHeader(), BorderLayout.PAGE_START); 
        lPanel.add(table, BorderLayout.CENTER);
        setVisible(true);
    }
/*
      public void and(int a, int b) {
        if (a == 1 && b == 1) {
            display.setText(display.getText() + "1");
        } else {
            display.setText(display.getText() + "0");
        }
    }

    public void or(int a, int b) {
        if (a == 1 || b == 1 || a == 1 && b == 1) {
            display.setText(display.getText() + "1");
        } else {
            display.setText(display.getText() + "0");
        }
    }

    public void implication(int a, int b) {
        if (a == 1 && b == 0) {
            display.setText(display.getText() + "0");
        } else {
            display.setText(display.getText() + "1");
        }
    }

    public void equivalence(int a, int b) {
        if (a == 1 && b == 1 || a == 0 && b == 0) {
            display.setText(display.getText() + "1");
        } else {
            display.setText(display.getText() + "0");
        }
    }

    public void barcodeSchaeffer(int a, int b) {
        if (a == 1 && b == 1) {
            display.setText(display.getText() + "0");
        } else {
            display.setText(display.getText() + "1");
        }
    }

    public void pierceArrow(int a, int b) {
        if (a == 0 && b == 0) {
            display.setText(display.getText() + "1");
        } else {
            display.setText(display.getText() + "0");
        }
    }

    public void sumModulo(int a, int b) {
        if (a == 1 && b == 0 || a == 0 && b == 1) {
            display.setText(display.getText() + "1");
        } else {
            display.setText(display.getText() + "0");
        }
    }

    public void no(int a) {
        if (a == 1) {
            display.setText(display.getText() + "0");
        } else {
            display.setText(display.getText() + "1");
        }
    }*/
}
