package main;

import View.LoginPage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	Scene scene;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		LoginPage loginPage = new LoginPage(primaryStage);

//		primaryStage.setFullScreen(true);
//
//		primaryStage.setOnCloseRequest(event -> {
//			System.exit(0);
//		});

		primaryStage.show();
	}
}
