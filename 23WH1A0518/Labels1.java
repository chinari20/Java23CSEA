package JavaPractice;
import java.awt.event.*;
import javax.swing.*;

public final class Labels1 {

	public static void main(String[] args) {
		JFrame f = new JFrame("Lable Example");
		JLabel l1,l2;
		l1 = new JLabel("First Label");
		l1.setBounds(50,50,100,30);
		l2 = new JLabel("second Label");
		l2.setBounds(50,100,100,30);
		f.add(l1);
		f.add(l2);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
