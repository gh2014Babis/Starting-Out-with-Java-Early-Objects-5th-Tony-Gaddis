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
public class Challenge02 extends JFrame {
	
	private final double COUNTY_TAX_RATE = 0.02;
	private final double STATE_TAX_RATE = 0.04;
	private JPanel panel;             
	private JLabel totalSalesLabel; 
	private JLabel countySalesTaxLabel;
	private JLabel stateSalesTaxLabel;
	private JLabel totalSalesTaxLabel;
	private JTextField totalSalesTextField; 
   	private JButton calcButton;       
   	private final int WINDOW_WIDTH = 500;  
   	private final int WINDOW_HEIGHT = 200;

   public Challenge02() {
	   // Set Call the JFrame constructor.
	   super("Monthly Sales Tax");

	   // Set the size of the window.
	   setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

	   // Specify what happens when the close button is clicked.
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	   // Build the panel and add it to the frame.
	   buildPanel();

	   // Add the panel to the frame's content pane.
	   add(panel);

	   // Display the window.
	   setVisible(true);
   }

   private void buildPanel() {
	   totalSalesLabel = new JLabel("Enter the total sales for the month");
	   countySalesTaxLabel = new JLabel();
	   stateSalesTaxLabel = new JLabel();
	   totalSalesTaxLabel = new JLabel();
	   totalSalesTextField = new JTextField(10);
	   
	   calcButton = new JButton("Calculate");

	   calcButton.addActionListener(new CalcButtonListener());

	   panel = new JPanel();

	   panel.add(totalSalesLabel);
	   panel.add(totalSalesTextField);
	   panel.add(calcButton);
	   panel.add(countySalesTaxLabel);
	   panel.add(stateSalesTaxLabel);
	   panel.add(totalSalesTaxLabel);	   
   }

   private class CalcButtonListener implements ActionListener {
	   public void actionPerformed(ActionEvent e) {
		   if (totalSalesTextField.getText().isEmpty())
			   JOptionPane.showMessageDialog(null, "The text field of total sales is empty");
		   else {
			   double totalSales = Double.parseDouble(totalSalesTextField.getText().trim());
			   if (totalSales <= 0)
				   JOptionPane.showMessageDialog(null, "The total sales are <= 0");
			   else {
				   double amount1 = totalSales * COUNTY_TAX_RATE;
				   countySalesTaxLabel.setText("The amount of county sales tax: $" + amount1);
				   double amount2 = totalSales * STATE_TAX_RATE;
				   stateSalesTaxLabel.setText("The amount of state sales tax: $" + amount2);
				   totalSalesTaxLabel.setText("The total sales tax: $" + (amount1 + amount2));
			   }
		   }
	   }
   }
   
   public static void main(String[] args) {
	   new Challenge02();
   }
}