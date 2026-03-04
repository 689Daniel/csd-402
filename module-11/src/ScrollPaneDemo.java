/*Daniel Preller, 4 March 2026, Assignment 11
Program demonstrating a ScrollPane in JavaFX */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.shape.Circle;


public class ScrollPaneDemo extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		ScrollPane mainPane = new ScrollPane();//Creates a new ScrollPane
		
		Circle circle = new Circle(300.0, 300.0, 400.0);//Creates a new circle
		
		mainPane.setContent(circle);//Adds circle to ScrollPane
		
		mainPane.setPrefViewportHeight(200);//Sets default ScrollPane height
		
		//Sets scrolling policies
		mainPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		mainPane.setHbarPolicy(ScrollBarPolicy.NEVER);
		
		mainPane.setPannable(true);//Makes ScrollPane pannable
		
		//Places the scrollbar in the middle by default
		mainPane.setVmin(0.0);
		mainPane.setVmax(100.0);
		mainPane.setVvalue(50.0);
		
		//Displays the scene
		Scene scene = new Scene(mainPane);
		primaryStage.setTitle("ScrollPane Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {//main method for IDE compatibility
		launch(args);

	}

}
