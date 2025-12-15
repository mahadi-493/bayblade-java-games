import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Controller3 {
	@FXML
	public Button logOutButton;
	
	public void logOutButtonFunction(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Do you want to Quit?");
		if(alert.showAndWait().get()==ButtonType.OK) {
			Button button = (Button) event.getSource();
			Stage stage = (Stage) button.getScene().getWindow();
			stage.close();
		}

	}
	
}
