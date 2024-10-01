package View;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LoginPage {
	private Stage primaryStage;

	public LoginPage(Stage primaryStage) {
		this.primaryStage = primaryStage;
		initializeUI();
	}

	private void initializeUI() {
		HBox layout = new HBox();
		layout.getStyleClass().add("layout");

//		Rectangle leftSegment = new Rectangle(550, 600);
//		leftSegment.getStyleClass().add("leftSegment");

		VBox leftSegment = initLeftSegment();

		Rectangle rightSegment = new Rectangle(550, 600);
		rightSegment.getStyleClass().add("rightSegment");

		layout.getChildren().addAll(leftSegment, rightSegment);
		layout.setAlignment(Pos.CENTER);

		Scene scene = new Scene(layout, 1200, 700);

		String css = getClass().getResource("/style/LoginPage.css").toExternalForm();
		scene.getStylesheets().add(css);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Login Page");
	}

	private VBox initLeftSegment() {
		VBox leftSegment = new VBox();
		leftSegment.getStyleClass().add("leftSegment");

		leftSegment.getChildren().addAll(createLabel("Create your account", "title"),
				createLabel("Welcome! Please enter your details", "subtitle"));
		return leftSegment;
	}

	private Label createLabel(String text, String className) {
		Label label = new Label(text);
		label.getStyleClass().add(className);
		return label;
	}
}
