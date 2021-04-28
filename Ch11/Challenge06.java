package challenges;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Challenge06 extends JFrame {
	
	private final int WINDOW_WIDTH = 250;
	private final int WINDOW_HEIGHT = 300;
	private final double OIL_CHANGE = 26.00;
	private final double LUBE_JOB = 18.00;
	private final double RADIATOR_FLUSH = 30.00;
	private final double TRANSMISSION_FLUSH = 80.00;
	private final double INSPECTION = 15.00;
	private final double MUFFLER_REPLACEMENT = 100.00;
	private final double TIRE_ROTATION = 20.00;
	private final double CHARGES_PER_HOUR = 20;
	private JPanel panel;
	private JPanel panelHours;
	private JPanel calcPanel;
	private JCheckBox c1;
	private JCheckBox c2;
	private JCheckBox c3;
	private JCheckBox c4;
	private JCheckBox c5;
	private JCheckBox c6;
	private JCheckBox c7;
	private JLabel label;
	private JTextField tf;
	private JButton calc;	
	
	public Challenge06() {
		super("Joe’s Automotive");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setLayout(new BorderLayout());
		panel = new JPanel();
		panel.setLayout(new GridLayout(8, 1));
		panel.setBorder(BorderFactory.createTitledBorder("Bagel"));
		c1 = new JCheckBox("Oil change");
		c2 = new JCheckBox("Lube job");
		c3 = new JCheckBox("Radiator flush");
		c4 = new JCheckBox("Transmission flush");
		c5 = new JCheckBox("Inspection");
		c6 = new JCheckBox("Muffler replacement");
		c7 = new JCheckBox("Tire rotation");
		panelHours = new JPanel();
		panelHours.setLayout(new GridLayout(1, 2));
		label = new JLabel("Hours of work");
		tf = new JTextField(5);
		panelHours.add(label);
		panelHours.add(tf);
		calc = new JButton("Calculate");
		calc.addActionListener(new ButtonListener());
		panel.add(c1);
		panel.add(c2);
		panel.add(c3);
		panel.add(c4);
		panel.add(c5);
		panel.add(c6);
		panel.add(c7);
		panel.add(panelHours);
		calcPanel = new JPanel();
		calcPanel.add(calc);
		add(panel, BorderLayout.CENTER);
		add(calcPanel, BorderLayout.SOUTH);		
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			double totalCost = 0;
			if (c1.isSelected()) 
				totalCost += OIL_CHANGE;
			if (c2.isSelected()) 
				totalCost += LUBE_JOB;
			if (c3.isSelected()) 
				totalCost += RADIATOR_FLUSH;
			if (c4.isSelected()) 
				totalCost += TRANSMISSION_FLUSH;
			if (c5.isSelected()) 
				totalCost += INSPECTION;
			if (c6.isSelected()) 
				totalCost += MUFFLER_REPLACEMENT;
			if (c7.isSelected()) 
				totalCost += TIRE_ROTATION;
			try {
				double chargesPerHour = Double.parseDouble(tf.getText());
				if (chargesPerHour < 0) {
					JOptionPane.showMessageDialog(null, "Invalid charges per hour value");					
				} else {
					totalCost += chargesPerHour * CHARGES_PER_HOUR;
					JOptionPane.showMessageDialog(null, "Total cost: $" + totalCost);
				}
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Charges per hour is not a number value");
				tf.setText("");
			}			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Challenge06();
	}

}
