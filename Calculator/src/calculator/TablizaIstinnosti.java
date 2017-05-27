package calculator;

import java.awt.BorderLayout;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class TablizaIstinnosti extends JFrame {

    public JTable trianglematrixtable;

    TablizaIstinnosti(JTextArea display) {
        super("Таблица истинности");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());
        TablizaIstinnostiModel model = new TablizaIstinnostiModel(display);
        trianglematrixtable = new JTable(model);
        getContentPane().add(trianglematrixtable);
        setVisible(true);
    }

    /*  public void and(int a, int b) {
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
