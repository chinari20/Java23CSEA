import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TrafficLightSimulator extends Frame implements ItemListener {
    private Checkbox redButton;
    private Checkbox yellowButton;
    private Checkbox greenButton;
    private Label messageLabel;

    
    public TrafficLightSimulator() {
        setTitle("Traffic Light Simulator");
        setSize(300, 200);
        setLayout(new BorderLayout());

     
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0); 
            }
        });
        
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new FlowLayout());  
        CheckboxGroup group = new CheckboxGroup();

        redButton = new Checkbox("Red", group, true); 
        yellowButton = new Checkbox("Yellow", group, false);
        greenButton = new Checkbox("Green", group, false);
        redButton.addItemListener(this);
        yellowButton.addItemListener(this);
        greenButton.addItemListener(this);
        
        buttonPanel.add(redButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(greenButton);

        add(buttonPanel, BorderLayout.CENTER);

        messageLabel = new Label("", Label.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 28));
        add(messageLabel, BorderLayout.NORTH);  
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (redButton.getState()) {
            messageLabel.setText("Stop");
            messageLabel.setForeground(Color.RED);
        } else if (yellowButton.getState()) {
            messageLabel.setText("Ready");
            messageLabel.setForeground(Color.ORANGE);
        } else if (greenButton.getState()) {
            messageLabel.setText("Go");
            messageLabel.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        TrafficLightSimulator frame = new TrafficLightSimulator();
        frame.setVisible(true);
    }
}
