package challenges;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Challenge01Controller {

	@FXML
    private Label costLabel;

    @FXML
    private TextField costTextField;

    @FXML
    private Label markupLabel;

    @FXML
    private TextField markupTextField;

    @FXML
    private Label msgLabel;

    @FXML
    private Button calcButton;

    @FXML
    void buttonCalculatorListener() {
    	if (costTextField.getText().isEmpty() || markupTextField.getText().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Fill both text fields");
    	} else {
    		try {
    			double cost = Double.parseDouble(costTextField.getText());
    			double markup = Double.parseDouble(markupTextField.getText());
    			double total = cost + cost * markup / 100;
    			msgLabel.setText("The final cost is: $" + total);
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Invalid values in one or both of text fields");
    			costTextField.setText("");
    			markupTextField.setText("");
    		}
    	}
    }
}

