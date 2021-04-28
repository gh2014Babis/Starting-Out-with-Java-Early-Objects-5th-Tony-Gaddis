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
public class Challenge01 extends JFrame {
	private JPanel panel;             
	private JLabel wholesaleCostLabel; 
	private JLabel markupLabel;
	private JTextField wholesaleCostTextField; 
	private JTextField markupTextField; 
   	private JButton calcButton;       
   	private final int WINDOW_WIDTH = 500;  
   	private final int WINDOW_HEIGHT = 200;

   public Challenge01() {
	   // Set Call the JFrame constructor.
	   super("Retail Price Calculator");

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
	   wholesaleCostLabel = new JLabel("Enter the wholesale cost of an item");
	   markupLabel = new JLabel("Enter the markup percentage");

	   wholesaleCostTextField = new JTextField(10);
	   markupTextField = new JTextField(10);

	   // Create a button with the caption "Calculate".
	   calcButton = new JButton("Calculate");

	   // Add an action listener to the button.
	   calcButton.addActionListener(new CalcButtonListener());

	   // Create a JPanel object and let the panel
	   // field reference it.
	   panel = new JPanel();

	   // Add the label, text field, and button
	   // components to the panel.
	   panel.add(wholesaleCostLabel);
	   panel.add(wholesaleCostTextField);
	   panel.add(markupLabel);
	   panel.add(markupTextField);
	   panel.add(calcButton);
   }

   private class CalcButtonListener implements ActionListener {
	   public void actionPerformed(ActionEvent e) {
		   if (wholesaleCostTextField.getText().isEmpty())
			   JOptionPane.showMessageDialog(null, "The text field of wholesale cost is empty");
		   else {
			   double cost = Double.parseDouble(wholesaleCostTextField.getText());
			   if (cost <= 0)
				   JOptionPane.showMessageDialog(null, "The wholesale cost is <= 0");
			   else {
				   if (markupTextField.getText().isEmpty()) 
					   JOptionPane.showMessageDialog(null, "The text field of markup percentage is empty");
				   else {
					   double perc = Double.parseDouble(markupTextField.getText());
					   if (perc <= 0) 
						   JOptionPane.showMessageDialog(null, "The markup percentage is <= 0");
					   else {  
						   double retailCost = cost + (cost * perc) / 100;
						   JOptionPane.showMessageDialog(null, "Retail cost: $" + retailCost);
					   }
				   }
			   }
		   }
	   }
   }
   
   public static void main(String[] args) {
	   new Challenge01();
   }
}