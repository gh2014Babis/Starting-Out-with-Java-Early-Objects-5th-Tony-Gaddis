package challenges;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Challenge09 extends JApplet {
	
	private int counter = 0;
	private int total = 0;
	private int delay = 0;
	private Timer timer;
	private JPanel photoPanel;
	private JPanel fieldsPanel;
	private JPanel buttonPanel;
	private JLabel photoLabel;
	private JLabel numLabel;
	private JTextField numTextField;
	private JLabel delayLabel;
	private JTextField delayTextField;
	private JButton startButton;
	private JButton stopButton;
	
	public void init() {
		timer = new Timer(0, new TimerListener());
		
		setLayout(new BorderLayout());
		
		photoPanel = new JPanel();
		photoLabel = new JLabel();
		photoPanel.add(photoLabel);
		
		fieldsPanel = new JPanel();		
		numLabel = new JLabel("Enter the number of photos: ");
		numTextField = new JTextField(3);		
		delayLabel = new JLabel("Enter the delay of seconds: ");
		delayTextField = new JTextField(5);
		fieldsPanel.add(numLabel);
		fieldsPanel.add(numTextField);
		fieldsPanel.add(delayLabel);
		fieldsPanel.add(delayTextField);
		
		buttonPanel = new JPanel();
		startButton = new JButton("Start");
		startButton.addActionListener(new ButtonListener());
		stopButton = new JButton("Stop");
		stopButton.addActionListener(new ButtonListener());
		buttonPanel.add(startButton);
		buttonPanel.add(stopButton);
		
		add(fieldsPanel, BorderLayout.NORTH);
		add(photoPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (counter < total) 
				counter++;
			else
				counter = 1;
			photoLabel.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch13\\src\\challenges\\Dice\\"+ counter + "Die.jpg"));
		}
	}
	
	private class ButtonListener implements ActionListener {		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == startButton) {
				if (numTextField.getText().isEmpty() || delayTextField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Fill all the fields");
				} else {
					try {
						if (Integer.parseInt(numTextField.getText()) <= 0 || Integer.parseInt(delayTextField.getText()) <= 0) {
							JOptionPane.showMessageDialog(null, "Enter positive values");
						} else {
							if (Integer.parseInt(numTextField.getText()) <= 6) {
								delay = Integer.parseInt(delayTextField.getText());
								total = Integer.parseInt(numTextField.getText());
								timer.setDelay(delay * 1000);
								timer.start();
							} else {
								JOptionPane.showMessageDialog(null, "Enter num value up to 6");
							}
						}
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Invalid values");
					}					
				}
			} else {
				timer.stop();
				counter = 0;
				total = 0;
				numTextField.setText("");
				delayTextField.setText("");
			}
		}
	}
}