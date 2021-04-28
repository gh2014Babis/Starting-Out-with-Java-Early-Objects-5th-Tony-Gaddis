package challenges;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Challenge06Controller {

    @FXML
    private Button tossButton;

    @FXML
    private ImageView coinImage;
    
    private Image headImage;
    private Image tailImage;
    
    public void initialize() {
        // Load the dog and cat images
    	headImage = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Coin\\Heads.jpg");
    	tailImage = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Coin\\Tails.jpg");
    }

    @FXML
    void tossButtonListener() {
    	Random rand = new Random();
    	int side = rand.nextInt(2);
    	System.out.println(side);
    	if (side == 0)
    		coinImage.setImage(headImage);
    	else
    		coinImage.setImage(tailImage);
    }

}
