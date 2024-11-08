package javaawt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialCalculator {
    
    // Method to compute factorial of a number
    public static long computeFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        // Create the main JFrame
        JFrame frame = new JFrame("Factorial Calculator");
        frame.setSize(400, 200);  // Set the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the app on close

        // Create the components
        JLabel inputLabel = new JLabel("Enter a number: ");
        JTextField inputField = new JTextField(15);  // Text field for input
        JLabel outputLabel = new JLabel("Factorial: ");
        JTextField outputField = new JTextField(15);  // Text field for output (read-only)
        JButton computeButton = new JButton("Compute");  // Button to compute factorial

        // Set the output field as non-editable
        outputField.setEditable(false);

        // Create a panel to organize the layout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        // Add the components to the panel
        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(computeButton);
        panel.add(outputLabel);
        panel.add(outputField);

        // Add the panel to the frame
        frame.add(panel);

        // Add action listener for the compute button
        computeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the number entered by the user
                    int number = Integer.parseInt(inputField.getText());

                    // Ensure the number is non-negative
                    if (number < 0) {
                        JOptionPane.showMessageDialog(frame, "Please enter a non-negative integer.", 
                                                      "Input Error", JOptionPane.ERROR_MESSAGE);
                        outputField.setText("");
                    } else {
                        // Compute the factorial and display the result
                        long factorial = computeFactorial(number);
                        outputField.setText(String.valueOf(factorial));
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid integer.", 
                                                  "Input Error", JOptionPane.ERROR_MESSAGE);
                    outputField.setText("");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
