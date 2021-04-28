package challenges;

import java.util.Random;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Challenge11Controller {

    @FXML
    private ImageView imgView1;

    @FXML
    private ImageView imgView2;

    @FXML
    private ImageView imgView3;

    @FXML
    private Label amountInsertedLabel;

    @FXML
    private TextField amountInsertedTextField;

    @FXML
    private Label wonThisSpinLabel;

    @FXML
    private Label wonTotalLabel;

    @FXML
    private Button spinButton;
    
    private Image img01;
    private Image img02;
    private Image img03;
    private Image img04;
    private Image img05;
    private Image img06;
    private Image img07;
    private Image img08;
    private Image img09;
    private Image img10;
    private Image[] imgs = new Image[10];
    
    private double wonSpinAmount;
    private double wonTotalAmount;
    
    public void initialize() {
    	imgView1.setImage(null);
    	imgView2.setImage(null);
    	imgView3.setImage(null);
    	img01 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Fruit Symbols\\Apple.png");
    	img02 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Fruit Symbols\\Banana.png");
    	img03 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Fruit Symbols\\Cherries.png");
    	img04 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Fruit Symbols\\Grapes.png");
    	img05 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Fruit Symbols\\Lemon.png");
    	img06 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Fruit Symbols\\Lime.png");
    	img07 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Fruit Symbols\\Orange.png");
    	img08 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Fruit Symbols\\Pear.png");
    	img09 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Fruit Symbols\\Strawberry.png");
    	img10 = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\Fruit Symbols\\Watermelon.png");
    	imgs[0] = img01;
    	imgs[1] = img02;
    	imgs[2] = img03;
    	imgs[3] = img04;
    	imgs[4] = img05;
    	imgs[5] = img06;
    	imgs[6] = img07;
    	imgs[7] = img08;
    	imgs[8] = img09;
    	imgs[9] = img10;
    	wonSpinAmount = 0;
    	wonTotalAmount = 0;
    }
    

    @FXML
    void spinButtonListener() {
    	if (amountInsertedTextField.getText().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "There is no inserted amount");
    	} else {
    		try {
    			double insertedAmount = Double.parseDouble(amountInsertedTextField.getText());
    			wonSpinAmount = 0;
    	    	Random rand = new Random();
    	    	int n1 = rand.nextInt(10);
    	    	int n2 = rand.nextInt(10);
    	    	int n3 = rand.nextInt(10);
    	    	imgView1.setImage(imgs[n1]);
    	    	imgView2.setImage(imgs[n2]);
    	    	imgView3.setImage(imgs[n3]);
    	    	if (imgView1.getImage() == imgView2.getImage() && imgView2.getImage() == imgView3.getImage()) {
    	    		wonSpinAmount = 3 * insertedAmount;
    	    	} else if ((imgView1.getImage() == imgView2.getImage() && imgView1.getImage() != imgView3.getImage()) ||
    	    			   (imgView1.getImage() == imgView3.getImage() && imgView1.getImage() != imgView2.getImage()) ||
    	    			   (imgView2.getImage() == imgView3.getImage() && imgView1.getImage() != imgView2.getImage())) {
    	    		wonSpinAmount = 2 * insertedAmount;
    	    	} 
    	    	wonTotalAmount += wonSpinAmount;
    	    	amountInsertedTextField.setText("");
    	    	wonThisSpinLabel.setText("Amount Won This Spin: $" + String.valueOf(wonSpinAmount));
    	    	wonTotalLabel.setText("Total Amount Won: $" + wonTotalAmount);
    		} catch (Exception e) {
    			JOptionPane.showMessageDialog(null, "Invalid inserted amount");
    			amountInsertedTextField.setText("");
    		}
    	}
    	
    }
}
