package edu.nvcc.csc200.javafx;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXp2 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		String correctUserName = "twg2997";
		String correctPassword = "bluechip";
		String[] correctAccountType = { "Student", "Admin", "Faculty" };
		primaryStage.setTitle("Authentication");
		Label userNameLbl = new Label("User Name");
		Label passwordLbl = new Label("Password");
		TextField userNameTxtFld = new TextField();
		PasswordField pwTxtFld = new PasswordField();

		Button submitBtn = new Button("Submit");
		submitBtn.setOnAction(new EventHandler<ActionEvent>() {
			String inputUserName = "";
			String inputPw = "";
			String inputAccountType = "";
			int trial = 0;

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub

				inputUserName = userNameTxtFld.getText();
				inputPw = pwTxtFld.getText();

				if (trial < 3) {
					if (correctUserName.equals(inputUserName) && correctPassword.equals(inputPw)) {

						JOptionPane.showMessageDialog(null, "Welcome " + correctUserName + "!");
						
						
						
						
					} else {
						trial++;
						JOptionPane.showMessageDialog(null, "Fail Authentication.");
						if (trial > 2) {
							JOptionPane.showMessageDialog(null, "System Locked.");

						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "***System Locked.\nContact your Administrator.");

				}
			}

		});

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);

		grid.add(userNameLbl, 0, 0);
		grid.add(passwordLbl, 0, 1);
		grid.add(userNameTxtFld, 1, 0);
		grid.add(pwTxtFld, 1, 1);
		grid.add(submitBtn, 1, 2);

		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}

