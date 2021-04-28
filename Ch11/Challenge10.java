package challenges;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Challenge10 extends JFrame {
	
	private final int WINDOW_WIDTH = 280;
	private final int WINDOW_HEIGHT = 130;
	private JLabel celsiusLabel;
	private JTextField celsiusTextField;
	private JButton calc;
		
	public Challenge10() {
		super("Celsius to Fahrenheit");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		celsiusLabel = new JLabel("Enter a Celsius temperature");
		celsiusTextField = new JTextField(5);
		calc = new JButton("Calculate Fahrenheit");
		calc.addActionListener(new ButtonListener());
		add(celsiusLabel);
		add(celsiusTextField);
		add(calc);
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			try {
				double celsius = Double.parseDouble(celsiusTextField.getText());
				if (celsius < 0) {
					JOptionPane.showMessageDialog(null, "Invalid temperature (less than 0)");					
				} else {
					JOptionPane.showMessageDialog(null, "F = " + (9 / 5 * celsius + 32));
				}
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Input value is not number");
				celsiusTextField.setText("");
			}	 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Challenge10();
	}
}
