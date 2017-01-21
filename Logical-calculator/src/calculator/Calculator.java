package calculator;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Calculator extends JFrame {

    public Calculator() {

        super("Калькулятор логических выражений");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        getContentPane().setLayout(new BorderLayout());
        JMenuBar menuBar = new JMenuBar();
        JMenu menuMain = new JMenu("Меню");
        menuBar.add(menuMain);

        JMenuItem myMenuItem = new JMenuItem("Составить таблицу истинности");
        myMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JMenuItem myMenuItem1 = new JMenuItem("Упростить функцию");
        myMenuItem1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        JMenuItem myMenuItem2 = new JMenuItem("Решить выражение");
        myMenuItem2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JMenuItem myMenuItem3 = new JMenuItem("Выход");
        myMenuItem3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuMain.add(myMenuItem);
        menuMain.add(myMenuItem1);
        menuMain.add(myMenuItem2);
        menuMain.add(myMenuItem3);

        setJMenuBar(menuBar);
        JTextArea display = new JTextArea();
        JPanel buttonPanel = new JPanel(new GridLayout(8, 5));
        JButton button0 = new JButton("(");
        JButton button1 = new JButton(")");
        JButton button2 = new JButton("¬");
        JButton button3 = new JButton("C");
        JButton button4 = new JButton("CE");
        JButton button5 = new JButton("∨");
        JButton button6 = new JButton("∧");
        JButton button7 = new JButton("~");
        JButton button8 = new JButton("→");
        JButton button9 = new JButton("↓");
        JButton button10 = new JButton("⊕");
        JButton button11 = new JButton("|");
        JButton button12 = new JButton("0");
        JButton button13 = new JButton("1");
        JButton button14 = new JButton("A");
        JButton button15 = new JButton("B");
        JButton button16 = new JButton("C");
        JButton button17 = new JButton("D");
        JButton button18 = new JButton("E");
        JButton button19 = new JButton("F");
        JButton button20 = new JButton("G");
        JButton button21 = new JButton("H");
        JButton button22 = new JButton("I");
        JButton button23 = new JButton("J");
        JButton button24 = new JButton("K");
        JButton button25 = new JButton("L");
        JButton button26 = new JButton("M");
        JButton button27 = new JButton("N");
        JButton button28 = new JButton("O");
        JButton button29 = new JButton("P");
        JButton button30 = new JButton("Q");
        JButton button31 = new JButton("R");
        JButton button32 = new JButton("S");
        JButton button33 = new JButton("T");
        JButton button34 = new JButton("U");
        JButton button35 = new JButton("V");
        JButton button36 = new JButton("W");
        JButton button37 = new JButton("X");
        JButton button38 = new JButton("Y");
        JButton button39 = new JButton("Z");

        setBounds(300, 300, 700, 400);
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.add(button0);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(button10);
        buttonPanel.add(button11);
        buttonPanel.add(button12);
        buttonPanel.add(button13);
        buttonPanel.add(button14);
        buttonPanel.add(button15);
        buttonPanel.add(button16);
        buttonPanel.add(button17);
        buttonPanel.add(button18);
        buttonPanel.add(button19);
        buttonPanel.add(button20);
        buttonPanel.add(button21);
        buttonPanel.add(button22);
        buttonPanel.add(button23);
        buttonPanel.add(button24);
        buttonPanel.add(button25);
        buttonPanel.add(button26);
        buttonPanel.add(button27);
        buttonPanel.add(button28);
        buttonPanel.add(button29);
        buttonPanel.add(button30);
        buttonPanel.add(button31);
        buttonPanel.add(button32);
        buttonPanel.add(button33);
        buttonPanel.add(button34);
        buttonPanel.add(button35);
        buttonPanel.add(button36);
        buttonPanel.add(button37);
        buttonPanel.add(button38);
        buttonPanel.add(button39);

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "(");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + ")");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "¬");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = display.getText();
                display.setText(temp.substring(temp.length()));
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = display.getText();
                display.setText(temp.substring(0, temp.length() - 1));
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "∨");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "∧");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "~");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "→");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "↓");
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "⊕");
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "|");
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "0");
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "1");
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "A");
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "B");
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "C");
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "D");
            }
        });
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "E");
            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "F");
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "G");
            }
        });
        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "H");
            }
        });
        button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "I");
            }
        });
        button23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "J");
            }
        });
        button24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "K");
            }
        });
        button25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "L");
            }
        });
        button26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "M");
            }
        });
        button27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "N");
            }
        });
        button28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "O");
            }
        });
        button29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "P");
            }
        });
        button30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "Q");
            }
        });
        button31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "R");
            }
        });
        button32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "S");
            }
        });
        button33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "T");
            }
        });
        button34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "U");
            }
        });
        button35.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "V");
            }
        });
        button36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "W");
            }
        });
        button37.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "X");
            }
        });
        button38.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "Y");
            }
        });
        button39.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "Z");
            }
        });

        setVisible(true);

    }

    public static void main(String[] args) {
        Calculator my = new Calculator();
    }
}