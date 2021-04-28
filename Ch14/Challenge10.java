package challenges;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;   
import javafx.stage.Stage;

public class Challenge10 extends Application {
	
	public void start(Stage stage) throws Exception {  
		// Load the FXML file.
		Parent parent = FXMLLoader.load(getClass().getResource("Challenge10.fxml")); 
      
		// Build the scene graph.
		Scene scene = new Scene(parent); 
      
		// Display our window, using the scene graph.
		stage.setTitle("Tic-Tac-Toe Simulator"); 
		stage.setScene(scene);
		stage.show(); 
	}
   
	public static void main(String[] args) {
		// Launch the application.
		launch(args);
	}
}