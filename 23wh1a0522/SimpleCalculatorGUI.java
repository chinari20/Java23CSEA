package javaprojectslab;

import java.awt.*;
import java.awt.event.*;

public class Calc extends Frame implements ActionListener {
    TextField input1, input2, result;
    Button add, subtract, multiply, divide, clear;

    public Calc() {
        setTitle("Simple Calculator");
        setSize(500, 700);
        setLayout(new FlowLayout());
        input1 = new TextField(10);
        input2 = new TextField(10);
        result = new TextField(10);
        result.setEditable(false);

        add = new Button("+");
        subtract = new Button("-");
        multiply = new Button("*");
        divide = new Button("/");
        clear = new Button("C");
        add(new Label("Input 1:"));
        add(input1);
        add(new Label("Input 2:"));
        add(input2);
        add(new Label(" "));
        add(new Label("Result:"));
        add(result);
        add(new Label("  "));
        add(add);
        add(subtract);
        add(multiply);
        add(divide);
        add(clear);
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        clear.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double num1, num2, res = 0;
        try {
            num1 = Double.parseDouble(input1.getText());
            num2 = Double.parseDouble(input2.getText());
        } catch (NumberFormatException ex) {
            result.setText("Error");
            return;
        }
        if (e.getSource() == add) {
            res = num1 + num2;
        } else if (e.getSource() == subtract) {
            res = num1 - num2;
        } else if (e.getSource() == multiply) {
            res = num1 * num2;
        } else if (e.getSource() == divide) {
            if (num2 != 0) {
                res = num1 / num2;
            } else {
                result.setText("Div by 0");
                return;
            }
        } else if (e.getSource() == clear) {
            input1.setText("0");
            input2.setText("0");
            result.setText("0");
            return;
        }
        result.setText(String.valueOf(res));
    }
    public static void main(String[] args) {
        new Calc();
    }
}
