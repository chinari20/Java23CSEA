package javaprojectslab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Factorial extends JFrame{
	public JTextField numField,resultField;
	public JButton compute;
	
	Factorial(){
		setTitle("Factorial");
		setLayout(new FlowLayout());
        setSize(300, 200);

        JLabel num1Label = new JLabel("Number:");
        numField = new JTextField(10);
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField(10);
        resultField.setEditable(false); 
        compute = new JButton("compute");
        
        add(num1Label);
        add(numField);
        add(compute);
        add(resultLabel);
        add(resultField);
        
        compute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse input values as integers
                    int num = Integer.parseInt(numField.getText());

                    if (num < 0) {
                        throw new ArithmeticException("Factorial is not allowed for negative numbers...");
                    }

                    int result = 1;
                    if(num==0) {
                    	result = 1;
                    }
                    else {
                    	for(int i=1;i<=num;i++) {
                    		result *= i;
                    	}
                    }
                    resultField.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Factorial.this, "Invalid input. Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        });
   }
	
	public static void main(String[] args) {
        new Factorial().setVisible(true);
    }
}
