package br.com.aledelima.javafx_navigation.view.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.aledelima.javafx_navigation.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainController implements Initializable {

    @FXML
    private MenuItem menuItemScreen1;

    @FXML
    private MenuItem menuItemScreen2;

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    void menuItemAboutAction(ActionEvent event) {
    	String path = "/br/com/aledelima/javafx_navigation/view/About.fxml";
    	loadView(path);
    }

    @FXML
    void menuItemScreen1Action(ActionEvent event) {
    	String path = "/br/com/aledelima/javafx_navigation/view/Screen1.fxml";
    	loadView(path);
    }

    @FXML
    void menuItemScreen2Action(ActionEvent event) {
    	String path = "/br/com/aledelima/javafx_navigation/view/Screen2.fxml";
    	loadView(path);
    }
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {

	}

	
	private synchronized void loadView(String absolutePath) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absolutePath));
			VBox newVbox = loader.load();
			
			Scene mainScene = App.getMainScene();
			VBox mainVbox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVbox.getChildren().get(0);
			mainVbox.getChildren().clear();
			mainVbox.getChildren().add(mainMenu);
			mainVbox.getChildren().addAll(newVbox.getChildren());
			
		} catch (IOException e)	{
			e.printStackTrace();
		}
	}
	
}
