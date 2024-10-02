package View;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LoginPage {
	private Stage primaryStage;
	private TextField inputName, inputEmail, inputPhone;
	private PasswordField inputPassword, inputConfirm;

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
				createLabel("Welcome! Please enter your details", "subtitle"),
				createInput(0, "Username", "Please enter your username"),
				createInput(0, "Email", "Please enter your email"),
				createInput(0, "Phone", "Please enter your phone number"),
				createInput(1, "Password", "Please enter your Password"),
				createInput(1, "Confirm Password", "Please re-enter your Password"));
		return leftSegment;
	}

	private Label createLabel(String text, String className) {
		Label label = new Label(text);
		label.getStyleClass().add(className);
		return label;
	}

	private VBox createInput(int type, String subtitle, String text) {
		VBox group = new VBox();
		Label sub = createLabel(subtitle, "inputTitle");

		if (type == 0) {
			group.getChildren().addAll(sub, createTextField(text));
		} else {
			group.getChildren().addAll(sub, createPasswordField(text));
		}

		group.getStyleClass().add("inputContainer");
		return group;
	}

	private TextField createTextField(String text) {
		TextField field = new TextField();
		field.setPromptText(text);
		field.getStyleClass().add("inputBox");
		return field;
	}

	private PasswordField createPasswordField(String text) {
		PasswordField field = new PasswordField();
		field.setPromptText(text);
		field.getStyleClass().add("inputBox");
		return field;
	}

}
