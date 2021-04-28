package challenges;

import java.util.Random;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Challenge10Controller {

    @FXML
    private ImageView imgView1;

    @FXML
    private ImageView imgView2;

    @FXML
    private ImageView imgView3;

    @FXML
    private ImageView imgView4;

    @FXML
    private ImageView imgView5;

    @FXML
    private ImageView imgView6;

    @FXML
    private ImageView imgView7;

    @FXML
    private ImageView imgView8;

    @FXML
    private ImageView imgView9;
    
    @FXML
    private Label resultLabel;
    
    private Image imgX;
    private Image imgO;
    private Image emptyCell;
    private int turn;
    private ImageView[] imageViews = new ImageView[9];
    private int[][] cells = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
    
  	private int searchImageView(ImageView imgView) {
    	int pos = -1;
    	for (int i = 0; i < imageViews.length; i++) {
    		if (imageViews[i] == imgView) {
    			pos = i;
    			break;
    		}
    	}
    	return pos;
    }
  	
  	private boolean check(int pos, int playerNum) {
  		int x, y;
  		x = pos / 3;
  		y = pos % 3;
  		System.out.println(x + " " + y);
  		cells[x][y] = playerNum;
  		int n = 0;
  		if (x == y) {
  			for (int i = 0; i < cells.length; i++) {
  				if (cells[i][i] != playerNum) {
  					break;
  				} else {
  					n++;
  				}
  			}
  			if (n == 3)
  				return true;
  		}
  		n = 0;
  		if (x + y == cells.length - 1) {
  			for (int i = 0; i < cells.length; i++) {
  	  			if (cells[i][cells.length - 1 - i] != playerNum) {
  	  				break;
  	  			} else {
  	  				n++;
  	  			}
  			}
  			if (n == 3)
  				return true;
  		}
  		n = 0;
  		for (int j = 0; j < cells.length; j++) {
  	  	  	if (cells[x][j] != playerNum) {
  	  	  		break;
  	  	  	} else {
  	  	  		n++;
  	  		}
  		}
  		if (n == 3)
  			return true;
  		n = 0;
  		for (int i = 0; i < cells.length; i++) {
  			if (cells[i][y] != playerNum) {
  				break;
  			} else {
  				n++;
  			}
  		}
  		if (n == 3)
  			return true;
  		return false;
  	}
    
    public void initialize() {
    	imgView1.setDisable(true);
    	imgView2.setDisable(true);
    	imgView3.setDisable(true);
    	imgView4.setDisable(true);
    	imgView5.setDisable(true);
    	imgView6.setDisable(true);
    	imgView7.setDisable(true);
    	imgView8.setDisable(true);
    	imgView9.setDisable(true);
    	emptyCell = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\TicTacToe\\empty.png");
    	imgX = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\TicTacToe\\X.png");
    	imgO = new Image("file:E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch14\\src\\challenges\\TicTacToe\\O.png");      	
    	imgView1.setImage(emptyCell);
    	imgView2.setImage(emptyCell);
    	imgView3.setImage(emptyCell);
    	imgView4.setImage(emptyCell);
    	imgView5.setImage(emptyCell);
    	imgView6.setImage(emptyCell);
    	imgView7.setImage(emptyCell);
    	imgView8.setImage(emptyCell);
    	imgView9.setImage(emptyCell); 
    	imageViews[0] = imgView1;
    	imageViews[1] = imgView2;
    	imageViews[2] = imgView3;
    	imageViews[3] = imgView4;
    	imageViews[4] = imgView5;
    	imageViews[5] = imgView6;
    	imageViews[6] = imgView7;
    	imageViews[7] = imgView8;
    	imageViews[8] = imgView9;
    }

    @FXML
    void imgView1Listener() {
    	int pos = searchImageView(imgView1);
    	if (imgView1.getImage() != emptyCell) {
    		JOptionPane.showMessageDialog(null, "This cell is not free");
    	} else {
	    	if (turn == 1) {
	    		imgView1.setImage(imgX);
	    		if (check(pos, 1)) {
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) wins");
	    			resultLabel.setText("Player 1 (X) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 2;
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) plays");
	    			resultLabel.setText("Player 2 (O) plays");
	    		}
	    	} else {
	    		imgView1.setImage(imgO);
	    		if (check(pos, 0)) {
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) wins");
	    			resultLabel.setText("Player 2 (O) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 1;
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) plays");
	    			resultLabel.setText("Player 1 (X) plays");
	    		}
	    	}
    	}
    }

    @FXML
    void imgView2Listener() {
    	int pos = searchImageView(imgView2);
    	if (imgView2.getImage() != emptyCell) {
    		JOptionPane.showMessageDialog(null, "This cell is not free");
    	} else {
	    	if (turn == 1) {
	    		imgView2.setImage(imgX);
	    		if (check(pos, 1)) {
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) wins");
	    			resultLabel.setText("Player 1 (X) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 2;
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) plays");
	    			resultLabel.setText("Player 2 (O) plays");
	    		}
	    	} else {
	    		imgView2.setImage(imgO);
	    		if (check(pos, 0)) {
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) wins");
	    			resultLabel.setText("Player 2 (O) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 1;
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) plays");
	    			resultLabel.setText("Player 1 (X) plays");
	    		}
	    	}
    	}
    }

    @FXML
    void imgView3Listener() {
    	int pos = searchImageView(imgView3);
    	if (imgView3.getImage() != emptyCell) {
    		JOptionPane.showMessageDialog(null, "This cell is not free");
    	} else {
	    	if (turn == 1) {
	    		imgView3.setImage(imgX);
	    		if (check(pos, 1)) {
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) wins");
	    			resultLabel.setText("Player 1 (X) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 2;
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) plays");
	    			resultLabel.setText("Player 2 (O) plays");
	    		}
	    	} else {
	    		imgView3.setImage(imgO);
	    		if (check(pos, 0)) {
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) wins");
	    			resultLabel.setText("Player 2 (O) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 1;
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) plays");
	    			resultLabel.setText("Player 1 (X) plays");
	    		}
	    	}
    	}
    }

    @FXML
    void imgView4Listener() {
    	int pos = searchImageView(imgView4);
    	if (imgView4.getImage() != emptyCell) {
    		JOptionPane.showMessageDialog(null, "This cell is not free");
    	} else {
	    	if (turn == 1) {
	    		imgView4.setImage(imgX);
	    		if (check(pos, 1)) {
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) wins");
	    			resultLabel.setText("Player 1 (X) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 2;
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) plays");
	    			resultLabel.setText("Player 2 (O) plays");
	    		}
	    	} else {
	    		imgView4.setImage(imgO);
	    		if (check(pos, 0)) {
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) wins");
	    			resultLabel.setText("Player 2 (O) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 1;
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) plays");
	    			resultLabel.setText("Player 1 (X) plays");
	    		}
	    	}
    	}
    }

    @FXML
    void imgView5Listener() {
    	int pos = searchImageView(imgView5);
    	if (imgView5.getImage() != emptyCell) {
    		JOptionPane.showMessageDialog(null, "This cell is not free");
    	} else {
	    	if (turn == 1) {
	    		imgView5.setImage(imgX);
	    		if (check(pos, 1)) {
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) wins");
	    			resultLabel.setText("Player 1 (X) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 2;
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) plays");
	    			resultLabel.setText("Player 2 (O) plays");
	    		}
	    	} else {
	    		imgView5.setImage(imgO);
	    		if (check(pos, 0)) {
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) wins");
	    			resultLabel.setText("Player 2 (O) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 1;
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) plays");
	    			resultLabel.setText("Player 1 (X) plays");
	    		}
	    	}
    	}
    }

    @FXML
    void imgView6Listener() {
    	int pos = searchImageView(imgView6);
    	if (imgView6.getImage() != emptyCell) {
    		JOptionPane.showMessageDialog(null, "This cell is not free");
    	} else {
	    	if (turn == 1) {
	    		imgView6.setImage(imgX);
	    		if (check(pos, 1)) {
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) wins");
	    			resultLabel.setText("Player 1 (X) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 2;
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) plays");
	    			resultLabel.setText("Player 2 (O) plays");
	    		}
	    	} else {
	    		imgView6.setImage(imgO);
	    		if (check(pos, 0)) {
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) wins");
	    			resultLabel.setText("Player 2 (O) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 1;
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) plays");
	    			resultLabel.setText("Player 1 (X) plays");
	    		}
	    	}
    	}
    }

    @FXML
    void imgView7Listener() {
    	int pos = searchImageView(imgView7);
    	if (imgView7.getImage() != emptyCell) {
    		JOptionPane.showMessageDialog(null, "This cell is not free");
    	} else {
	    	if (turn == 1) {
	    		imgView7.setImage(imgX);
	    		if (check(pos, 1)) {
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) wins");
	    			resultLabel.setText("Player 1 (X) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 2;
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) plays");
	    			resultLabel.setText("Player 2 (O) plays");
	    		}
	    	} else {
	    		imgView7.setImage(imgO);
	    		if (check(pos, 0)) {
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) wins");
	    			resultLabel.setText("Player 2 (O) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 1;
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) plays");
	    			resultLabel.setText("Player 1 (X) plays");
	    		}
	    	}
    	}
    }

    @FXML
    void imgView8Listener() {
    	int pos = searchImageView(imgView8);
    	if (imgView8.getImage() != emptyCell) {
    		JOptionPane.showMessageDialog(null, "This cell is not free");
    	} else {
	    	if (turn == 1) {
	    		imgView8.setImage(imgX);
	    		if (check(pos, 1)) {
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) wins");
	    			resultLabel.setText("Player 1 (X) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 2;
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) plays");
	    			resultLabel.setText("Player 2 (O) plays");
	    		}
	    	} else {
	    		imgView8.setImage(imgO);
	    		if (check(pos, 0)) {
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) wins");
	    			resultLabel.setText("Player 2 (O) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 1;
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) plays");
	    			resultLabel.setText("Player 1 (X) plays");
	    		}
	    	}
    	}
    }

    @FXML
    void imgView9Listener() {
    	int pos = searchImageView(imgView9);
    	if (imgView9.getImage() != emptyCell) {
    		JOptionPane.showMessageDialog(null, "This cell is not free");
    	} else {
	    	if (turn == 1) {
	    		imgView9.setImage(imgX);
	    		if (check(pos, 1)) {
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) wins");
	    			resultLabel.setText("Player 1 (X) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 2;
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) plays");
	    			resultLabel.setText("Player 2 (O) plays");
	    		}
	    	} else {
	    		imgView9.setImage(imgO);
	    		if (check(pos, 0)) {
	    			//JOptionPane.showMessageDialog(null, "Player 2 (O) wins");
	    			resultLabel.setText("Player 2 (O) wins");
	    			imgView1.setDisable(true);
	    	    	imgView2.setDisable(true);
	    	    	imgView3.setDisable(true);
	    	    	imgView4.setDisable(true);
	    	    	imgView5.setDisable(true);
	    	    	imgView6.setDisable(true);
	    	    	imgView7.setDisable(true);
	    	    	imgView8.setDisable(true);
	    	    	imgView9.setDisable(true);
	    		} else {
	    			turn = 1;
	    			//JOptionPane.showMessageDialog(null, "Player 1 (X) plays");
	    			resultLabel.setText("Player 1 (X) plays");
	    		}
	    	}
    	}
    }

    @FXML
    void newGameButtonListener() {
    	imgView1.setImage(emptyCell);
    	imgView2.setImage(emptyCell);
    	imgView3.setImage(emptyCell);
    	imgView4.setImage(emptyCell);
    	imgView5.setImage(emptyCell);
    	imgView6.setImage(emptyCell);
    	imgView7.setImage(emptyCell);
    	imgView8.setImage(emptyCell);
    	imgView9.setImage(emptyCell); 
    	imgView1.setDisable(false);
    	imgView2.setDisable(false);
    	imgView3.setDisable(false);
    	imgView4.setDisable(false);
    	imgView5.setDisable(false);
    	imgView6.setDisable(false);
    	imgView7.setDisable(false);
    	imgView8.setDisable(false);
    	imgView9.setDisable(false);
    	Random rand = new Random();
    	turn = rand.nextInt(2) + 1;
    	if (turn == 1) 
    		JOptionPane.showMessageDialog(null, "Player 1 (X) begins");
    	else
    		JOptionPane.showMessageDialog(null, "Player 2 (O) begins");
    }
}
