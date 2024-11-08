package cse517;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class trafficSignals {
	public static void main(String[]args) {
		JFrame frame=new JFrame("Traffic signal stimulator");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
		JLabel messageLabel=new JLabel();
		messageLabel.setFont(new Font("Arial",Font.BOLD,20));
		
		JRadioButton redButton = new JRadioButton("RED");
		JRadioButton greenButton=new JRadioButton("GREEN");
		JRadioButton yellowButton=new JRadioButton("YELLOW");
		redButton.setBackground(Color.RED);
		yellowButton.setBackground(Color.YELLOW);
		greenButton.setBackground(Color.GREEN);
		
		ButtonGroup group = new ButtonGroup();
		group.add(redButton);
		group.add(greenButton);
		group.add(yellowButton);
		
		
		redButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					messageLabel.setForeground(Color.RED);
					messageLabel.setText("STOP");
					messageLabel.setBackground(Color.RED);
		}
		});
		
		yellowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				messageLabel.setForeground(Color.YELLOW);
				messageLabel.setText("READY");
				messageLabel.setBackground(Color.YELLOW);
			}
	    });
		
		greenButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					messageLabel.setForeground(Color.GREEN);
					messageLabel.setText("GO");
					messageLabel.setBackground(Color.GREEN);
				}
		});
		
		frame.add(redButton);
		frame.add(yellowButton);
		frame.add(greenButton);
		frame.add(messageLabel);
}
}
