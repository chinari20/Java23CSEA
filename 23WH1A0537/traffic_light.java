package javaa537;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TrafficLight {
	TrafficLight(){
		JFrame f = new JFrame("traffic light stimulator");
		f.setSize(400,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new GridLayout(5,3));
		 
		JRadioButton redB = new JRadioButton("red light");
		JRadioButton yelB = new JRadioButton("yellow light");
		JRadioButton greenB = new JRadioButton("green light");
		
		//button group allows only one selection at a time
		ButtonGroup g = new ButtonGroup();
		g.add(redB);
	    g.add(yelB);
	    g.add(greenB);
	    
		JLabel l1 = new JLabel("");
		
		f.add(l1);
		f.add(greenB);
		f.add(yelB);
		f.add(redB);
		
		redB.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("Stop");
				l1.setForeground(Color.RED);
				
			}
		});
		
		yelB.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("ready");
				l1.setForeground(Color.YELLOW);
				
			}
		});
		
		greenB.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("go");
				l1.setForeground(Color.GREEN);
				
			}
		});
		
		
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new TrafficLight();
	}
}
	
