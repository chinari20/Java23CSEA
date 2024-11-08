package labpackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField display;
  
    private String currentInput = "";
    private double num1 = 0, num2 = 0, result = 0;
    private char operator = ' ';

    public SimpleCalculator() {
        // Set up the JFrame
        setTitle("Simple Calculator");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a display area
        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 14));
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);  // Align the input text to the right
        add(display, BorderLayout.NORTH);

        // Create panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2,5,5));

        // Define the button labels
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        // Create buttons and add them to the panel
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            panel.add(button);
        }

        // Add the panel to the frame
        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) == 'C') {
            // Clear the display
            currentInput = "";
            display.setText(currentInput);
        } else if (command.charAt(0) == '=') {
            // Perform calculation when "=" is pressed
            num2 = Double.parseDouble(currentInput);
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        display.setText("Error");
                        return;
                    }
                    break;
            }
            display.setText(String.valueOf(result));
            currentInput = String.valueOf(result);  // Store result for further operations
        } else if (command.charAt(0) == '+' || command.charAt(0) == '-' ||
                command.charAt(0) == '*' || command.charAt(0) == '/') {
            // Store the operator and the first number
            if (!currentInput.isEmpty()) {
                num1 = Double.parseDouble(currentInput);
                currentInput = "";
            }
            operator = command.charAt(0);
        } else {
            // Add digit to the current input
            currentInput += command;
            display.setText(currentInput);
        }
    }

    public static void main(String[] args) {
        // Launch the calculator
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator calculator = new SimpleCalculator();
            calculator.setVisible(true);
        });
    }
}
