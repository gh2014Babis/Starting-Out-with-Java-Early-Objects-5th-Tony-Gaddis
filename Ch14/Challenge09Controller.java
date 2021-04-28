package challenges;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Challenge09Controller {

    @FXML
    private Label playerChoiceLabel;

    @FXML
    private Button rockButton;

    @FXML
    private Button paperButton;

    @FXML
    private Button scissorsButton;

    @FXML
    private ImageView playerImage;

    @FXML
    private Label computerChoiceLabel;

    @FXML
    private ImageView computerImage;

    @FXML
    private Label resLabel;

    @FXML
    private Label resMsgLabel;
    
    @FXML
    private Button newGameButton;
    
    private Random rand;
    private Image rockImg;
    private Image scissorsImg;
    private Image paperImg;    
    private Image cImg;
    
    private int computerChoice;
    private String result;
    
    public void initialize() {
    	rockButton.setDisable(true);
    	scissorsButton.setDisable(true);
    	paperButton.setDisable(true);
    	rockImg = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Game\\Rock.jpg");
    	scissorsImg = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Game\\Scissors.jpg");
    	paperImg = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Game\\Paper.jpg");    	
    	rand = new Random();
    	computerChoice = rand.nextInt(3) + 1;
    	if (computerChoice == 1)
    		cImg = rockImg;
    	else if (computerChoice == 2)
    		cImg = scissorsImg;
    	else
    		cImg = paperImg;    	
    }
    
    @FXML
    void rockButtonListener() {
    	playerImage.setImage(rockImg);
    	computerImage.setImage(cImg);
    	if (computerChoice == 1)
    		result = "It's a draw";
    	else if (computerChoice == 2)
    		result = "Player wins";
    	else
    		result = "Computer wins";
    	resMsgLabel.setText(result);
    	rockButton.setDisable(true);
    	scissorsButton.setDisable(true);
    	paperButton.setDisable(true);
    }
    
    @FXML
    void scissorsButtonListener() {
    	playerImage.setImage(scissorsImg);
    	computerImage.setImage(cImg);
    	if (computerChoice == 1)
    		result = "Computer wins";
    	else if (computerChoice == 2)
    		result = "It's a draw";
    	else
    		result = "Player wins";
    	resMsgLabel.setText(result);
    	rockButton.setDisable(true);
    	scissorsButton.setDisable(true);
    	paperButton.setDisable(true);
    }

    @FXML
    void paperButtonListener() {
    	playerImage.setImage(paperImg);
    	computerImage.setImage(cImg);
    	if (computerChoice == 1)
    		result = "Player wins";
    	else if (computerChoice == 2)
    		result = "Computer wins";
    	else
    		result = "It's a draw";
    	resMsgLabel.setText(result);
    	rockButton.setDisable(true);
    	scissorsButton.setDisable(true);
    	paperButton.setDisable(true);
    }
    
    @FXML
    void newGameButtonListener() {
    	rockButton.setDisable(false);
    	scissorsButton.setDisable(false);
    	paperButton.setDisable(false);
    	playerImage.setImage(null);
    	computerImage.setImage(null);
    	resMsgLabel.setText("");
    	computerChoice = rand.nextInt(3) + 1;
    	if (computerChoice == 1)
    		cImg = rockImg;
    	else if (computerChoice == 2)
    		cImg = scissorsImg;
    	else
    		cImg = paperImg;    	
    }
}
