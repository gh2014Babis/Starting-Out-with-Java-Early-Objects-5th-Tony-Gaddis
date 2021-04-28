package challenges;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Challenge04Controller {
	
	private final double TIP = 0.07;
	
	private final double TAX = 0.18;

    @FXML
    private Label chargeLabel;

    @FXML
    private TextField chargeTextField;

    @FXML
    private Label tipLabel;

    @FXML
    private TextField tipTextField;

    @FXML
    private Label taxLabel;

    @FXML
    private TextField taxTextField;

    @FXML
    private Button calcButton;

    @FXML
    private Label totalLabel;

    @FXML
    private TextField totalTextField;

    @FXML
    void calcButtonListener() {
    	if (chargeTextField.getText().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Fill the text field");
    	} else {
    		try {
    			double chargeAmount = Double.parseDouble(chargeTextField.getText());
    			double tip = chargeAmount * TIP;
    			tipTextField.setText(String.valueOf(tip));
    			double tax = chargeAmount * TAX;
    			taxTextField.setText(String.valueOf(tax));
    			double total = chargeAmount + tip + tax;
    			totalTextField.setText(String.valueOf(total));
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Invalid input value");
    		}
    	}
    }

}

