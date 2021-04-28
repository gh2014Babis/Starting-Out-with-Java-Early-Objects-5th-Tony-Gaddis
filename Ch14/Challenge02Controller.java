package challenges;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Challenge02Controller {

    @FXML
    private Button word1Button;

    @FXML
    private Button word2Button;

    @FXML
    private Button word3Button;

    @FXML
    private Label word1Label;

    @FXML
    private Label word2Label;

    @FXML
    private Label word3Label;

    @FXML
    void button1Listener() {
    	word1Label.setText("left");
    }

    @FXML
    void button2Listener() {
    	word2Label.setText("right");
    }

    @FXML
    void button3Listener() {
    	word3Label.setText("center");
    }
}

