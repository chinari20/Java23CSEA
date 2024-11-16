package lab_experiments;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class TrafficLigtht{
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		
		frame.setLayout(new FlowLayout());
		
		JLabel label = new JLabel();
		frame.add(label);
		
		JRadioButton redbutton = new JRadioButton("RED");
		JRadioButton greenbutton = new JRadioButton("GREEN");
		JRadioButton yellowbutton = new JRadioButton("YELLOW");
		
		ButtonGroup button = new ButtonGroup();
		button.add(redbutton);
		button.add(yellowbutton);
		button.add(greenbutton);
		
		frame.add(redbutton);
		frame.add(yellowbutton);
		frame.add(greenbutton);
		
		redbutton.addActionListener (e-> {
			label.setText("STOP");
			label.setForeground(Color.RED);
		});
		yellowbutton.addActionListener(e->{
			label.setText("READY");
			label.setForeground(Color.ORANGE);
			
		});
		greenbutton.addActionListener(e->{
			label.setText("GO");
			label.setForeground(Color.GREEN);
		});
		frame.setVisible(true);
	}
}
