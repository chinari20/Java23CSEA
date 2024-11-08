package JavaPractice;

import javax.swing.*;
public class FrameCreation {
	JFrame frame;
	FrameCreation(){
		frame = new JFrame("My way");
		
		JButton button1 = new JButton("start");
		button1.setBounds(200, 150, 90, 50);
		
		JButton button2  = new JButton("next");
		button2.setBounds(200, 300, 90, 50);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(button1);
		frame.add(button2);
		
		frame.setSize(500,600);
		
		frame.setLayout(null);
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FrameCreation();
	}

}
