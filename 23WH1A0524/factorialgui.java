package java524;



import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



public class Factorial extends JFrame {



    private JTextField inputField, resultField;

    private JButton computeButton;



    public Factorial() {

        setTitle("Factorial Calculator");

        setLayout(new FlowLayout());

        setSize(300, 150);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        inputField = new JTextField(10);

        resultField = new JTextField(10);

        resultField.setEditable(false);

        computeButton = new JButton("Compute");



        add(new JLabel("Enter number:"));

        add(inputField);

        add(computeButton);

        add(new JLabel("Factorial:"));

        add(resultField);



        computeButton.addActionListener(new ActionListener() {

                   public void actionPerformed(ActionEvent e) {

                try {

                    int number = Integer.parseInt(inputField.getText());

                    long factorial = calculateFactorial(number);

                    resultField.setText(String.valueOf(factorial));

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null, "Please enter a valid integer", "Input Error", JOptionPane.ERROR_MESSAGE);

                }

            }

        });

    }



    private long calculateFactorial(int n) {

        long result = 1;

        for (int i = 2; i <= n; i++) result *= i;

        return result;

    }



    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new Factorial().setVisible(true));

    }

}


                                                                                                                                      
