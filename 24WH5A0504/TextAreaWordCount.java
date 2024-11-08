package Applets;
import java.awt.*;
import java.awt.event.*;

public class TextAreaWordCount extends Frame implements ActionListener {
  
 private TextArea textArea;
 private Button countButton;
 private Label charCountLabel, wordCountLabel;

public TextAreaWordCount() {
setTitle("Word and Character Count");
setLayout(new FlowLayout());
textArea = new TextArea(10, 30); 
countButton = new Button("Count");
charCountLabel = new Label("Characters: 0");
wordCountLabel = new Label("Words: 0");

add(textArea);
add(countButton);
add(charCountLabel);
add(wordCountLabel);

countButton.addActionListener(this);
setSize(400, 300);
setVisible(true);}
 @Override
public void actionPerformed(ActionEvent e) {
String text = textArea.getText();
int charCount = text.length();
String[] words = text.split("\\s+");
int wordCount = words.length;

if (text.trim().isEmpty()) {
wordCount = 0;
}
charCountLabel.setText("Characters: " + charCount);
wordCountLabel.setText("Words: " + wordCount);
    }
public static void main(String[] args) {
new TextAreaWordCount();
    }
}


