package calculator;

import javax.swing.JTextArea;

public class TablizaIstinnosti {

    JTextArea display = new JTextArea();

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
    }

}

