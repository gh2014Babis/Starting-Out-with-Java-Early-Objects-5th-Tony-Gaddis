package challenges;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Challenge07Controller {

    @FXML
    private Label temperatureLabel;

    @FXML
    private TextField temperatureTextField;

    @FXML
    private Button fahrenheitButton;

    @FXML
    private Button celsiusButton;

    @FXML
    private TextField fahrenheitTextField;

    @FXML
    private TextField celsiusTextField;

    @FXML
    void celsiusButtonListener() {
    	if (temperatureTextField.getText().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Fill the text field");
    		fahrenheitTextField.setText("");
    		celsiusTextField.setText("");
    	} else {
    		try {
    			double f = Double.parseDouble(temperatureTextField.getText());
    			double c = (5.0 / 9) * (f - 32);
    			celsiusTextField.setText(temperatureTextField.getText() + " Fahrenheit = " + c + " Celsius");
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Invalid input value");
    			fahrenheitTextField.setText("");
        		celsiusTextField.setText("");
    		}
    	}
    }

    @FXML
    void fahrenheitButtonListener() {
    	if (temperatureTextField.getText().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Fill the text field");
    		fahrenheitTextField.setText("");
    		celsiusTextField.setText("");
    	} else {
    		try {
    			double c = Double.parseDouble(temperatureTextField.getText());
    			double f = 1.8 * c + 32;
    			fahrenheitTextField.setText(temperatureTextField.getText() + " Celsius = " + f + " Fahrenheit");
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Invalid input value");
    			fahrenheitTextField.setText("");
        		celsiusTextField.setText("");
    		}
    	}
    }

}
