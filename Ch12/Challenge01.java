package challenges;

import java.awt.GridLayout;
import java.util.InputMismatchException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class Challenge01 extends JFrame {

	private JTextField purchaseAmount; 
	private JTextField salesTax;    
	private JPanel ppanel;             
	private JPanel tpanel;             
	private JPanel sliderPanel;        
	private JSlider slider;            
	   
	/**
	 *  Constructor
	 */
	   
	public Challenge01() {
		// Call the JFrame constructor.
	    super("Scrollable Tax Calculator");
	    // Specify an action for the close button.
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	    // Create the labels.
	    JLabel label1 = new JLabel("Amount of purchase: ");
	    JLabel label2 = new JLabel("Amount of sales tax: ");
	      
	    // Create the read-only text fields.
	    purchaseAmount = new JTextField(10);
	    
	    salesTax = new JTextField(10);
	    salesTax.setEditable(false);
	    
	    // Create the slider.
	    slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
	    slider.setMajorTickSpacing(5);
	    slider.setMinorTickSpacing(1);
	    slider.setPaintTicks(true);
	    slider.setPaintLabels(true);
	    slider.addChangeListener(new SliderListener());
	     
	    // Create panels and place the components in them.
	    ppanel = new JPanel();
	    ppanel.add(label1);
	    ppanel.add(purchaseAmount);
	    tpanel = new JPanel();
	    tpanel.add(label2);
	    tpanel.add(salesTax);
	    sliderPanel = new JPanel();
	    sliderPanel.add(slider);
	     
	    // Create a layout manager for the content pane.
	    setLayout(new GridLayout(3, 1));
	    
	    // Add the panels to the content pane.
	    add(ppanel);
	    add(tpanel);
	    add(sliderPanel);
	    
	    // Pack and display the frame.
	    pack();
	    setVisible(true);
	}
	  
	/**
	 *  Private inner class to handle the change events
	 *  that are generated when the slider is moved.
	 */

	private class SliderListener implements ChangeListener {
	   
		public void stateChanged(ChangeEvent e) {
			double taxSales, taxRate;	 
			if (purchaseAmount.getText().isEmpty()) {
				salesTax.setText("");
				purchaseAmount.requestFocusInWindow();
				JOptionPane.showMessageDialog(null, "You haven't give the amount of purchase");				
			} else {
				try {
					taxRate = slider.getValue();
			        taxSales = Double.parseDouble(purchaseAmount.getText()) * taxRate / 100;
			        salesTax.setText(Double.toString(taxSales));
				} catch (InputMismatchException exception) {
					purchaseAmount.setText("");
					salesTax.setText("");
					purchaseAmount.requestFocusInWindow();	
					JOptionPane.showMessageDialog(null, "The text field value is not an integer");					
				} catch (NumberFormatException exception) {
					purchaseAmount.setText("");
					salesTax.setText("");
					purchaseAmount.requestFocusInWindow();	
					JOptionPane.showMessageDialog(null, "The text field value is not a number");
				}
			}
	        
	    }
	}

	/**
	 *  The main method creates an instance of the
	 *  TempConverter class.
	 */

	public static void main(String[] args) {
		new Challenge01();
	}
}
