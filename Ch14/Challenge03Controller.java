package challenges;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Challenge03Controller {

    @FXML
    private Label frstLabel;

    @FXML
    private Label midLabel;

    @FXML
    private Label lstLabel;

    @FXML
    private Label titLabel;

    @FXML
    private TextField frstTextField;

    @FXML
    private TextField midTextField;

    @FXML
    private TextField lstTextField;
    
    private ObservableList<String> titleList = FXCollections.observableArrayList("Mr.", "Mrs.", "Ms.", "Dr.");

    @FXML
    private ComboBox<String> titComboBox = new ComboBox<String>();

    @FXML
    private Button msg1Button;

    @FXML
    private Button msg2Button;

    @FXML
    private Button msg3Button;

    @FXML
    private Button msg4Button;

    @FXML
    private Button msg5Button;

    @FXML
    private Button msg6Button;

    @FXML
    private Label msg1Label;

    @FXML
    private Label msg2Label;

    @FXML
    private Label msg3Label;

    @FXML
    private Label msg4Label;

    @FXML
    private Label msg5Label;

    @FXML
    private Label msg6Label;
    
    public void initialize()  {
        titComboBox.setItems(titleList);
    }
    
    @FXML
    void msg1ButtonListener() {
    	if (titComboBox.getValue() != null)
    		msg1Label.setText(titComboBox.getValue() + " " + frstTextField.getText() + " " + midTextField.getText() + " " + lstTextField.getText());
    	else
    		JOptionPane.showMessageDialog(null, "Select a title");
    }

    @FXML
    void msg2ButtonListener() {
    	msg2Label.setText(frstTextField.getText() + " " + midTextField.getText() + " " + lstTextField.getText());
    }

    @FXML
    void msg3ButtonListener() {
    	msg3Label.setText(frstTextField.getText() + " " + lstTextField.getText());
    }

    @FXML
    void msg4ButtonListener() {
    	if (titComboBox.getValue() != null)
    		msg4Label.setText(lstTextField.getText() + ", " + frstTextField.getText() + " " + midTextField.getText() + ", " + titComboBox.getValue());
    	else
    		JOptionPane.showMessageDialog(null, "Select a title");
    }

    @FXML
    void msg5ButtonListener() {
    	msg5Label.setText(lstTextField.getText() + ", " + frstTextField.getText() + " " + midTextField.getText());
    }

    @FXML
    void msg6ButtonListener() {
    	msg6Label.setText(lstTextField.getText() + ", " + frstTextField.getText());
    }	
}