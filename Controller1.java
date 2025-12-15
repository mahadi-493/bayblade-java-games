import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller1 {
	@FXML
	public TextField textField;
	public Button loginButton;
	
	public void loginButtonFunction(ActionEvent event) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
		
		Parent root = null;
		try {
			root = loader.load();
		} catch (Throwable t) {
			while (t.getCause()!=null) {
				t=t.getCause();
			}
			System.out.println("The root cause for the error : "+t);			
		}
		
		Scene scene2= new Scene(root);
		
		// getting the stage
		Button button = (Button) event.getSource();
		Stage stage = (Stage) button.getScene().getWindow();
		stage.setScene(scene2);
		stage.show();
		
		Controller2 controller2=loader.getController();
		
		String nameLabelText = textField.getText();
		controller2.setNameLabel(nameLabelText);
		
		
	}
}
