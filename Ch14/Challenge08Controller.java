package challenges;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Challenge08Controller {

    @FXML
    private ImageView die1Image;

    @FXML
    private ImageView die2Image;

    @FXML
    private Button rollButton;
    
    private Image die11; 
    private Image die12;
    private Image die13;
    private Image die14;
    private Image die15;
    private Image die16;
    private Image die21;
    private Image die22;
    private Image die23;
    private Image die24;
    private Image die25;
    private Image die26;
    
    public void initialize() {
        // Load the dog and cat images
    	die11 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Dice\\Die1.jpg");
    	die12 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Dice\\Die2.jpg");
    	die13 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Dice\\Die3.jpg");
    	die14 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Dice\\Die4.jpg");
    	die15 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Dice\\Die5.jpg");
    	die16 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Dice\\Die6.jpg");
    	die21 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Dice\\1Die.jpg");
    	die22 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Dice\\2Die.jpg");
    	die23 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Dice\\3Die.jpg");
    	die24 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Dice\\4Die.jpg");
    	die25 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Dice\\5Die.jpg");
    	die26 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Dice\\6Die.jpg");
    }

    @FXML
    void rollButtonListener() {
    	Random rand = new Random();
    	int d1 = rand.nextInt(6) + 1;
    	int d2 = rand.nextInt(6) + 1;
    	if (d1 == 1) 
    		die1Image.setImage(die11);
    	else if (d1 == 2)
    		die1Image.setImage(die12);
    	else if (d1 == 3)
    		die1Image.setImage(die13);
    	else if (d1 == 4)
    		die1Image.setImage(die14);
    	else if (d1 == 5)
    		die1Image.setImage(die15);
    	else
    		die1Image.setImage(die16);
    	
    	if (d2 == 1) 
    		die2Image.setImage(die21);
    	else if (d2 == 2)
    		die2Image.setImage(die22);
    	else if (d2 == 3)
    		die2Image.setImage(die23);
    	else if (d2 == 4)
    		die2Image.setImage(die24);
    	else if (d2 == 5)
    		die2Image.setImage(die25);
    	else
    		die2Image.setImage(die26);
    }

}
