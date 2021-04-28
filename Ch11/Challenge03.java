package challenges;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Challenge03 extends JFrame {
	
	private JPanel panel;             
	private JLabel assessmentValueLabel; 
	private JLabel propertyTaxLabel;
	private JLabel actualValueLabel;
	private JTextField actualValueTextField; 
   	private JButton calcButton;       
   	private final int WINDOW_WIDTH = 350;  
   	private final int WINDOW_HEIGHT = 200;

   public Challenge03() {
	   // Set Call the JFrame constructor.
	   super(" Property Tax");

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
	   actualValueLabel = new JLabel("Enter the actual value of a property");
	   actualValueTextField = new JTextField(10);
	   calcButton = new JButton("Calculate");
	   assessmentValueLabel = new JLabel();
	   propertyTaxLabel = new JLabel();  

	   calcButton.addActionListener(new CalcButtonListener());

	   panel = new JPanel();
	   setLayout(new BorderLayout());
	   JPanel panel01 = new JPanel();
	   JPanel panel02 = new JPanel();
	   JPanel panel03 = new JPanel();

	   panel01.add(actualValueLabel);
	   panel01.add(actualValueTextField);
	   panel02.add(calcButton);
	   panel03.add(assessmentValueLabel); 
	   panel03.add(propertyTaxLabel); 
	   
	   panel.add(panel01, BorderLayout.NORTH);
	   panel.add(panel02, BorderLayout.CENTER);
	   panel.add(panel03, BorderLayout.SOUTH);
   }

   private class CalcButtonListener implements ActionListener {
	   public void actionPerformed(ActionEvent e) {
		   if (actualValueTextField.getText().isEmpty())
			   JOptionPane.showMessageDialog(null, "The text field of actual value is empty");
		   else {
			   double actualValue = Double.parseDouble(actualValueTextField.getText().trim());
			   if (actualValue <= 0)
				   JOptionPane.showMessageDialog(null, "The actual value is <= 0");
			   else {
				   double assessmentValue = actualValue * 0.6;
				   assessmentValueLabel.setText("The assessment value: $" + assessmentValue);
				   double propertyTax = (int)assessmentValue / 100 * 0.64;
				   propertyTaxLabel.setText("The property tax: $" + propertyTax);
			   }
		   }
	   }
   }
   
   public static void main(String[] args) {
	   new Challenge03();
   }
}