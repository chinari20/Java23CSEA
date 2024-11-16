package lab_experiments;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Factorial {
	public static void main(String args[]) {
		JFrame frame = new JFrame("finding factorial");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		
		JLabel label = new JLabel("enter a number:");
		JTextField tf = new JTextField(10);
		JButton button = new JButton("compute");
		JLabel rlabel = new JLabel("factorial: ");
		
		panel.add(label);
		panel.add(tf);
		panel.add(button);
		panel.add(rlabel);
		frame.add(panel);
		
		frame.setSize(500,300);
		frame.setVisible(true);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(tf.getText());
				try {
					if(num<0) {
						rlabel.setText("enter a valid non negative integer");
					}
					else {
						long factorial = calculatefact(num);
						rlabel.setText("factorial: " + factorial);
						
					}
					
				}
				catch(NumberFormatException ex) {
					rlabel.setText("enter a valid number");
				}
				
			}

			private long calculatefact(int num) {
				long fact = 1;
				if(num==0) return 1;
				else {
					for(int i=1;i<=num;i++) {
						fact=fact*i;
					}
				}
				return fact;
			}
			
		});
		
	}
}
