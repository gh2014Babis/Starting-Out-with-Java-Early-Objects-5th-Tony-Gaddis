package challenges;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Challenge07 extends JFrame {
	
	private final int WINDOW_WIDTH = 800;
	private final int WINDOW_HEIGHT = 300;
	private final double CAT1_COST = 0.07;
	private final double CAT2_COST = 0.12;
	private final double CAT3_COST = 0.05;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private ButtonGroup bg;
	private JRadioButton rb1;
	private JRadioButton rb2;
	private JRadioButton rb3;
	private JLabel label;
	private JTextField tf;
	private JButton calc;
	
	public Challenge07() {
		super("Long Distance Calls");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel1.setBorder(BorderFactory.createTitledBorder("Rate Category "));
		rb1 = new JRadioButton("Daytime (6:00 a.m. through 5:59 p.m.)");
		rb2 = new JRadioButton("Evening (6:00 p.m. through 11:59 p.m.)");
		rb3 = new JRadioButton("Off-Peak (12:00 a.m. through 5:59 a.m.)");
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		panel1.add(rb1);
		panel1.add(rb2);
		panel1.add(rb3);
		add(panel1);
		label = new JLabel("Enter the number of minutes");
		tf = new JTextField(10);
		panel2.add(label);
		panel2.add(tf);	
		add(panel2);
		calc = new JButton("Calculate");	
		calc.addActionListener(new ButtonListener());
		panel3.add(calc);
		add(panel3);
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			double totalCost = 0;
			double costPerMinute = 0;
			if (!rb1.isSelected() && !rb2.isSelected() && !rb3.isSelected()) {
				JOptionPane.showMessageDialog(null, "Select a category");
			} else {
				if (rb1.isSelected()) 
					costPerMinute = CAT1_COST;
				else if (rb2.isSelected()) 
					costPerMinute = CAT2_COST;
				else if (rb3.isSelected()) 
					costPerMinute = CAT3_COST;
				try {
					int minutes = Integer.parseInt(tf.getText());
					if (minutes < 0) {
						JOptionPane.showMessageDialog(null, "Invalid charges per hour value");					
					} else {
						totalCost = minutes * costPerMinute;
						JOptionPane.showMessageDialog(null, "Total cost: $" + totalCost);
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Charges per hour is not a number value");
					tf.setText("");
				}	
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Challenge07();
	}

}
