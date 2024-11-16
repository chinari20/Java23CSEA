package lab_experiments;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DivisionApp {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(4,2,10,10));
		
		JLabel num1 = new JLabel("enter num1:");
		JTextField tf1 = new JTextField(10);
		JLabel num2 = new JLabel("enter num2: ");
		JTextField tf2 =new JTextField(10);
		JButton button = new JButton("result");
		JTextField result_tf = new JTextField();
		result_tf.setEditable(false);
		
		frame.add(num1);
		frame.add(tf1);
		frame.add(num2);
		frame.add(tf2);
		frame.add(button);
		frame.add(result_tf);
		
		frame.setSize(500,500);
		frame.setVisible(true);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(tf1.getText());
					int num2 = Integer.parseInt(tf2.getText());
					
					int result = num1/num2;
					result_tf.setText(String.valueOf(result));
					
				}
				catch(NumberFormatException ex) {
					result_tf.setText("enter valid number");
				}
			
			}
			
		});
	}

}
