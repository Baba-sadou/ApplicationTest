package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

public class MainController extends VBox {
	

public MainController()throws IOException{
	FXMLLoader loader = new FXMLLoader(MainController.class.getResource("Main.fxml"));
	loader.setRoot(this);
	loader.setController(this);
	loader.load();
}
	
 @FXML
 public void initialize(){
	 
 }
}
