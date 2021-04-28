package challenges;

import java.awt.BorderLayout;
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
public class Challenge04 extends JFrame {
	
	private final int WINDOW_WIDTH = 1000;  
	private final int WINDOW_HEIGHT = 600; 
	JLabel lb01 = new JLabel("Number of days on the trip");
	JLabel lb02 = new JLabel("Amount of airfare");
	JLabel lb03 = new JLabel("Amount of car rental fees");
	JLabel lb04 = new JLabel("Number of miles driven");
	JLabel lb05 = new JLabel("Amount of parking fees");
	JLabel lb06 = new JLabel("Amount of taxi charges");
	JLabel lb07 = new JLabel("Conference or seminar registration fees");
	JLabel lb08 = new JLabel("Lodging charges");
	JLabel lb09 = new JLabel();
	JLabel lb10 = new JLabel();
	JLabel lb11 = new JLabel();
	
	JTextField tf01 = new JTextField(10);
	JTextField tf02 = new JTextField(10);
	JTextField tf03 = new JTextField(10);
	JTextField tf04 = new JTextField(10);
	JTextField tf05 = new JTextField(10);
	JTextField tf06 = new JTextField(10);
	JTextField tf07 = new JTextField(10);
	JTextField tf08 = new JTextField(10);
	
	JButton calc = new JButton("Calculate");
	
	public Challenge04() {
		super("Travel Expenses");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(8, 2));		
		
		JPanel p11 = new JPanel(); p11.add(lb01); p1.add(p11); JPanel p12 = new JPanel(); p12.add(tf01); p1.add(p12);
		JPanel p21 = new JPanel(); p21.add(lb02); p1.add(p21); JPanel p22 = new JPanel(); p22.add(tf02); p1.add(p22);
		JPanel p31 = new JPanel(); p31.add(lb03); p1.add(p31); JPanel p32 = new JPanel(); p32.add(tf03); p1.add(p32);
		JPanel p41 = new JPanel(); p41.add(lb04); p1.add(p41); JPanel p42 = new JPanel(); p42.add(tf04); p1.add(p42);
		JPanel p51 = new JPanel(); p51.add(lb05); p1.add(p51); JPanel p52 = new JPanel(); p52.add(tf05); p1.add(p52);
		JPanel p61 = new JPanel(); p61.add(lb06); p1.add(p61); JPanel p62 = new JPanel(); p62.add(tf06); p1.add(p62);
		JPanel p71 = new JPanel(); p71.add(lb07); p1.add(p71); JPanel p72 = new JPanel(); p72.add(tf07); p1.add(p72);
		JPanel p81 = new JPanel(); p81.add(lb08); p1.add(p81); JPanel p82 = new JPanel(); p82.add(tf08); p1.add(p82);
		
		add(p1, BorderLayout.WEST);
		
		JPanel p2 = new JPanel();		
		calc.addActionListener(new ButtonListener());
		p2.add(calc);
		add(p2, BorderLayout.NORTH);
		
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			double totalExpenses = 0;
			try {
				int days = Integer.parseInt(tf01.getText());
				double airfare = Double.parseDouble(tf02.getText());
				double carRentalFees = Double.parseDouble(tf03.getText());
				double miles = Double.parseDouble(tf04.getText());
				double parkingFees = Double.parseDouble(tf05.getText());
				double taxiCharges = Double.parseDouble(tf06.getText());
				double seminarFees = Double.parseDouble(tf07.getText());
				double lodgingCharges = Double.parseDouble(tf08.getText());
				totalExpenses = airfare + carRentalFees + miles * 0.27 + parkingFees + taxiCharges + seminarFees + lodgingCharges * days;
				
				double totalAllowableExpenses = (37 + 10 + 20 + 95) * days + miles * 0.27;
				JPanel p3 = new JPanel();
				p3.setLayout(new GridLayout(3, 2));
				lb09.setText("Total expenses: $" + totalExpenses);
				p3.add(new JPanel().add(lb09));
				p3.add(new JPanel().add(new JLabel()));
				lb10.setText("Total allowable expenses: $" + totalAllowableExpenses);
				p3.add(new JPanel().add(lb10));
				p3.add(new JPanel().add(new JLabel()));
				if (totalExpenses > totalAllowableExpenses)
					lb11.setText("The excess that must be paid by the businessperson: $" + (totalExpenses - totalAllowableExpenses));					
				else if (totalExpenses < totalAllowableExpenses)
					lb11.setText("The amount saved by the businessperson: $" + (totalAllowableExpenses - totalExpenses));
				p3.add(new JPanel().add(lb11));
				p3.add(new JPanel().add(new JLabel()));
				add(p3, BorderLayout.CENTER);				
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Invalid input");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Challenge04();
	}

}
