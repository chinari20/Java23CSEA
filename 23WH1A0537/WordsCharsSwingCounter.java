package java537;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CountSwing extends JFrame implements ActionListener{
	private JTextArea textArea;
    private JLabel result;
    
	CountSwing(){
		setTitle("word and character counter");
		setSize(400,300);
		setLayout(new GridLayout(3, 1, 10, 10));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textArea = new JTextArea(10,30);
		add(textArea);
		JButton button = new JButton("count words and characters");
		add(button);
		
		result = new JLabel("words: 0  characters: 0");
		add(result);
		
		button.addActionListener(this);
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		String input = textArea.getText();
		int numChars = input.replaceAll("\\s","").length();
		String[] words = input.trim().split("\\s+");
		int numWords = words.length;
		
		if (input.trim().isEmpty()) {
			numWords = 0;
		}
		
		result.setText("words: " + numWords + "characters:" + numChars);
	}
	
	public static void main(String args[]) {
		new CountSwing();
	}
	
}
