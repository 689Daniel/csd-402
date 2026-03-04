/* Daniel Preller, 4 March 2026, Assignment 11
Program to demonstrate an Accordion in JavaFX */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AccordionDemo extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		Accordion mainContainer = new Accordion();//Creates a new Accordion
		
		//Creates VBoxes for showing Pokémon information
		VBox mimikyuBox = new VBox();
		VBox klawfBox = new VBox();
		VBox bulbasaurBox = new VBox();
		VBox cyndaquilBox = new VBox();
		
		//Populates VBoxes with Pokémon information
		mimikyuBox.getChildren().addAll(new Text("Pokédex Number: 778"), new Text("Types: Ghost & Fairy"), new Text("Generation: 7"));
		klawfBox.getChildren().addAll(new Text("Pokédex Number: 950"), new Text("Types: Rock"), new Text("Generation: 8"));
		bulbasaurBox.getChildren().addAll(new Text("Pokédex Number: 1"), new Text("Types: Grass & Poison"), new Text("Generation: 1"));
		cyndaquilBox.getChildren().addAll(new Text("Pokédex Number: 155"), new Text("Types: Fire"), new Text("Generation: 2"));
		
		//Creates TitledPanes for each VBox and adds the VBox to them
		TitledPane mimikyuPane = new TitledPane("Mimikyu", mimikyuBox);
		TitledPane klawfPane = new TitledPane("Klawf", klawfBox);
		TitledPane bulbasaurPane = new TitledPane("Bulbasaur", bulbasaurBox);
		TitledPane cyndaquilPane = new TitledPane("Cyndaquil", cyndaquilBox);
		
		//Adds TitledPanes to Accordion
		mainContainer.getPanes().addAll(mimikyuPane, klawfPane, bulbasaurPane, cyndaquilPane);
		
		mainContainer.setExpandedPane(mimikyuPane);//Sets Mimikyu TitledPane to expand by default
		
		//Displays the scene
		Scene scene = new Scene(mainContainer, 500, 150);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Accordion Demo");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
