package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Button bouton = new Button("OK");
			bouton.setId("bouton");
			root.setCenter(bouton);
			ToolBar toolBar = new ToolBar();
			toolBar.setId("toolBar");
			VBox vBox = new MainController();
			//root.setCenter(vBox);
			toolBar.setStyle("-fx-Background-color:Blue");
			root.setTop(toolBar);
			toolBar.setPrefHeight(100);
			Scene scene = new Scene(root,400,400);  
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
