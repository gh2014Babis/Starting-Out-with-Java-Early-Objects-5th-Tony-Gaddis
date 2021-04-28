package challenges;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Challenge05Controller {

    @FXML
    private Label milesLabel;

    @FXML
    private TextField milesTextField;

    @FXML
    private Button button5;

    @FXML
    private Button button8;

    @FXML
    private Button button12;

    @FXML
    private Label distance5;

    @FXML
    private Label distance8;

    @FXML
    private Label distance12;
    
    @FXML
    void button5Listener() {
    	if (milesTextField.getText().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Fill the text field");
    		distance5.setText("");
			distance8.setText("");
			distance12.setText("");
    	} else {
    		try {
    			double miles = Double.parseDouble(milesTextField.getText());
    			distance5.setText(String.valueOf(miles * 5) + " miles");
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Invalid input value");
    			distance5.setText("");
    			distance8.setText("");
    			distance12.setText("");
    		}
    	}    	
    }

    @FXML
    void button8Listener() {
    	if (milesTextField.getText().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Fill the text field");
    		distance5.setText("");
			distance8.setText("");
			distance12.setText("");
    	} else {
    		try {
    			double miles = Double.parseDouble(milesTextField.getText());
    			distance8.setText(String.valueOf(miles * 8) + " miles");
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Invalid input value");
    			distance5.setText("");
    			distance8.setText("");
    			distance12.setText("");
    		}
    	}    
    }

    @FXML
    void button12Listener() {
    	if (milesTextField.getText().isEmpty()) { 
    		JOptionPane.showMessageDialog(null, "Fill the text field");
    		distance5.setText("");
			distance8.setText("");
			distance12.setText("");
    	} else {
    		try {
    			double miles = Double.parseDouble(milesTextField.getText());
    			distance12.setText(String.valueOf(miles * 12) + " miles");
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Invalid input value");
    			distance5.setText("");
    			distance8.setText("");
    			distance12.setText("");
    		}
    	}    
    }
}
