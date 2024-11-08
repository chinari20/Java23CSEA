package JavaPractice;
import javax.swing.*;
import java.awt.event.*;

public class Jbutton_with_ActionListener {

	public static void main(String[] args) {
		JFrame f = new JFrame("Button Example");
		final JTextField tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		
		
		JButton b = new JButton("click here");
		b.setBounds(50, 100, 95, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Hello Devloper");
			}
		});
		f.add(tf);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);

	}

}
