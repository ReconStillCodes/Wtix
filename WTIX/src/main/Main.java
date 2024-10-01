package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

	Scene scene;

	public static void main(String[] args) {
		launch(args);
	}

	public void initialize() {
		Label label = new Label("test");
		scene = new Scene(label, 1000, 800);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		initialize();
		primaryStage.setTitle("test");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
