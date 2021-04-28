package challenges;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Challenge09 extends JFrame {
	
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 350;
	private JLabel gallonsLabel;
	private JLabel milesLabel;
	private JPanel p11;
	private JPanel p12;
	private JPanel p21;
	private JPanel p22;
	private JPanel p3;
	private JTextField gallonsTextField;
	private JTextField milesTextField;
	private JButton calc;
		
	public Challenge09() {
		super("Miles-per-Gallon Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setLayout(new GridLayout(3, 2));			
		gallonsLabel = new JLabel("Number of gallons of gas");
		p11 = new JPanel();
		p12 = new JPanel();
		gallonsTextField = new JTextField(10);
		p11.add(gallonsLabel);
		p12.add(gallonsTextField);
		milesLabel = new JLabel("Number of miles");
		p21 = new JPanel();
		p22 = new JPanel();
		milesTextField = new JTextField(10);
		p21.add(milesLabel);
		p22.add(milesTextField);
		calc = new JButton("Calculate MPG");
		p3 = new JPanel();
		p3.add(calc);
		calc.addActionListener(new ButtonListener());
		add(p11);
		add(p12);
		add(p21);
		add(p22);
		add(p3);
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			try {
				double gallons = Double.parseDouble(gallonsTextField.getText());
				double miles = Double.parseDouble(milesTextField.getText());
				if (gallons < 0 || miles < 0) {
					JOptionPane.showMessageDialog(null, "Invalid values (less than 0)");					
				} else {
					JOptionPane.showMessageDialog(null, "MPG: " + (miles / gallons));
				}
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Input values are not both numbers");
				gallonsTextField.setText("");
				gallonsTextField.setText("");
			}	 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Challenge09();
	}
}
