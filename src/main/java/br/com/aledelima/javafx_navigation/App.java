package br.com.aledelima.javafx_navigation;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

	private static Scene mainScene;
	
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/com/aledelima/javafx_navigation/view/Main.fxml"));
            Parent parent = loader.load();
            mainScene = new Scene(parent);
            primaryStage.setScene(mainScene);
            primaryStage.setTitle("Main Screen");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
    
    public static Scene getMainScene() {
    	return mainScene;
    }

}