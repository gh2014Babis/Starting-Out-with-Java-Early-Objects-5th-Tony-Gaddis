package challenges;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Challenge05 extends JFrame {
	
	private final double THEATER_PERC = 0.2;
	private final int WINDOW_WIDTH = 300;
	private final int WINDOW_HEIGHT = 600; 
	private JPanel panel;
	private JLabel lb1;
	private JLabel lb2;
	private JLabel lb3;
	private JLabel lb4;
	private JLabel msg1;
	private JLabel msg2;
	private JLabel msg3;
	private JLabel msg4;
	private JLabel msg5;
	private JLabel msg6;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JButton calc;
	
	public Challenge05() {
		super("Theater Revenue");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		lb1 = new JLabel("Price per adult ticket");
		lb2 = new JLabel("Number of adult tickets sold");
		lb3 = new JLabel("Price per child ticket");
		lb4 = new JLabel("Number of child tickets sold");
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf4 = new JTextField(10);
		calc = new JButton("Calculate");
		calc.addActionListener(new ButtonListener());
		msg1 = new JLabel();
		msg2 = new JLabel();
		msg3 = new JLabel();
		msg4 = new JLabel();
		msg5 = new JLabel();
		msg6 = new JLabel();
		panel.add(lb1);
		panel.add(tf1);
		panel.add(lb2);
		panel.add(tf2);
		panel.add(lb3);
		panel.add(tf3);
		panel.add(lb4);
		panel.add(tf4);
		panel.add(calc);
		panel.add(msg1);
		panel.add(msg2);
		panel.add(msg3);
		panel.add(msg4);
		panel.add(msg5);
		panel.add(msg6);
		add(panel);
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			try {
				double totalGrossRevenue = 0;
				double totalNetRevenue = 0;
				double adultPrice = Double.parseDouble(tf1.getText());	
				int adults = Integer.parseInt(tf2.getText());
				double grossAdultRevenue = adultPrice * adults;
				double netAdultRevenue = grossAdultRevenue * THEATER_PERC;
				double childPrice = Double.parseDouble(tf3.getText());	
				int children = Integer.parseInt(tf4.getText());
				double grossChildRevenue = childPrice * children;
				double netChildRevenue = grossChildRevenue * THEATER_PERC;
				totalGrossRevenue = grossAdultRevenue + grossChildRevenue;
				totalNetRevenue = netAdultRevenue + netChildRevenue;
				msg1.setText("Gross revenue for adult tickets sold: $" + grossAdultRevenue);
				msg2.setText("Net revenue for adult tickets sold: $" + netAdultRevenue);
				msg3.setText("Gross revenue for child tickets sold: $" + grossChildRevenue);
				msg4.setText("Net revenue for child tickets sold: $" + netChildRevenue);
				msg5.setText("Total gross revenue: $" + totalGrossRevenue);
				msg6.setText("Total net revenue: $" + totalNetRevenue);
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Invalid input");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Challenge05();
	}
}
