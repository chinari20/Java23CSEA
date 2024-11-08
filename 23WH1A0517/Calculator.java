import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class A extends JFrame implements ActionListener {
    public JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    public JTextField tf1;
    public JPanel p;
    public String v = "";  // For storing current input
    public String v1 = "0";  // For storing previous input (e.g., before an operator is pressed)
    public String op = "";  // For storing current operator

    public A() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        
        // Setting up the panel and text field
        p = new JPanel(new FlowLayout());
        tf1 = new JTextField(10);
        p.add(tf1);
        add(p);

        // Setting up the layout and buttons
        setLayout(new GridLayout(5, 4));

        b1 = new JButton("1");
        b1.addActionListener(this);
        add(b1);
        b2 = new JButton("2");
        b2.addActionListener(this);
        add(b2);
        b3 = new JButton("3");
        b3.addActionListener(this);
        add(b3);
        b4 = new JButton("4");
        b4.addActionListener(this);
        add(b4);
        b5 = new JButton("5");
        b5.addActionListener(this);
        add(b5);
        b6 = new JButton("6");
        b6.addActionListener(this);
        add(b6);
        b7 = new JButton("7");
        b7.addActionListener(this);
        add(b7);
        b8 = new JButton("8");
        b8.addActionListener(this);
        add(b8);
        b9 = new JButton("9");
        b9.addActionListener(this);
        add(b9);
        b10 = new JButton("0");
        b10.addActionListener(this);
        add(b10);
        
        b11 = new JButton("+");
        b11.addActionListener(this);
        add(b11);
        b12 = new JButton("-");
        b12.addActionListener(this);
        add(b12);
        b13 = new JButton("*");
        b13.addActionListener(this);
        add(b13);
        b14 = new JButton("/");
        b14.addActionListener(this);
        add(b14);
        b15 = new JButton("=");
        b15.addActionListener(this);
        add(b15);
        b16 = new JButton("%");
        b16.addActionListener(this);
        add(b16);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String b = e.getActionCommand();

        switch (b) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0":
                v = v + b;  // Append the number to the current input
                tf1.setText(v);
                break;

            case "+":
            case "-":
            case "*":
            case "/":
            case "%":
                op = b;  // Store the operator
                v1 = tf1.getText();  // Store the previous value
                v = "";  // Reset the current input
                break;

            case "=":
                try {
                    long num1 = Long.parseLong(v1);
                    long num2 = Long.parseLong(v.isEmpty() ? "0" : v); // Default to 0 if input is empty

                    long result = 0;
                    switch (op) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 == 0) {
                                JOptionPane.showMessageDialog(this, "Cannot divide by zero");
                                return;
                            }
                            result = num1 / num2;
                            break;
                        case "%":
                            result = num1 % num2;
                            break;
                    }
                    tf1.setText(String.valueOf(result));  // Display the result
                    v = String.valueOf(result);  // Update the input value to the result
                    v1 = "0";  // Reset the previous value
                    op = "";  // Reset the operator
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input");
                }
                break;
        }
    }

    public static void main(String[] args) {
        new A();
    }
}
