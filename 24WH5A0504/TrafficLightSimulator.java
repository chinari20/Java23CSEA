package Applets;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TrafficLightSimulator {

 public static void main(String[] args) {
JFrame frame = new JFrame("Traffic Light Simulator");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400, 250);
frame.setLayout(new BorderLayout());

       
 JPanel panel = new JPanel();
panel.setLayout(new FlowLayout());

JRadioButton redButton = new JRadioButton("Red");
 JRadioButton yellowButton = new JRadioButton("Yellow");
 JRadioButton greenButton = new JRadioButton("Green");

 ButtonGroup group = new ButtonGroup();
 group.add(redButton);
 group.add(yellowButton);
 group.add(greenButton);

  panel.add(redButton);
  panel.add(yellowButton);
  panel.add(greenButton);

  JLabel messageLabel = new JLabel("");
  messageLabel.setFont(new Font("Arial", Font.BOLD, 18));
  messageLabel.setHorizontalAlignment(SwingConstants.CENTER);

   ActionListener actionListener = new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent e) {
   if (redButton.isSelected()) {
   messageLabel.setText("Stop");
   messageLabel.setForeground(Color.RED);}
   
   else if (yellowButton.isSelected()) {
   messageLabel.setText("Ready");
   messageLabel.setForeground(Color.YELLOW);}
   
   else if (greenButton.isSelected()) {
   messageLabel.setText("Go");
   messageLabel.setForeground(Color.GREEN);
       }
      }
    };

  redButton.addActionListener(actionListener);
  yellowButton.addActionListener(actionListener);
  greenButton.addActionListener(actionListener);
  
  frame.add(messageLabel, BorderLayout.NORTH);
  frame.add(panel, BorderLayout.CENTER);

  frame.setVisible(true);
    }
}
