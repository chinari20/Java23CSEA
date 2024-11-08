package javaa537;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Division {
	Division(){
		JFrame f = new JFrame("integer division calculator");
		f.setSize(400,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new GridLayout(4, 2, 10, 10));
		 
		JButton db = new JButton("divide");
		
		JLabel l1 = new JLabel("enter number1");
		JTextField t1 = new JTextField(10);
			
		JLabel l2 = new JLabel("enter number2");
		JTextField t2 = new JTextField(10);

		JLabel result = new JLabel("Result: ");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);
	
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(resultField);
		f.add(result);
		f.add(db);
		
		db.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    
                    int divisionResult = num1 / num2;
                    
                    resultField.setText(String.valueOf(divisionResult));
				}
				catch (NumberFormatException ex){
					 JOptionPane.showMessageDialog(f, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
				}
				catch(ArithmeticException ex) {
					JOptionPane.showMessageDialog(f,"Cannot divide by zero","Math Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new Division();
	}
}
	
