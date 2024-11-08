package JavaPractice;
import java.awt.event.*;
import javax.swing.*;

public final class Labels2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("Lable Example");
		JLabel l1,l2;
		l1 = new JLabel("Enter your Name:");
		l1.setBounds(50,50,200,30);
		l2 = new JLabel("Enter Roll_No. :");
		l2.setBounds(50,100,200,30);
		
		JButton button1 = new JButton("Submit");
		button1.setBounds(200,200,100,30);
		
		final JTextField tf = new JTextField();
		tf.setBounds(150,50,150,30);
		tf.setText(" ");
		final JTextField TF = new JTextField();
		TF.setBounds(150,100,150,30);
		TF.setText(" ");
		
		f.add(TF);
		f.add(tf);
		f.add(button1);
		f.add(l1);
		f.add(l2);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}