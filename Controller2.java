import java.io.IOException;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller2 implements Initializable{
	@FXML
	public Button up;
	public Button down;
	public Button left;
	public Button right;
	public Button quit;
	public ImageView beyBladeImageView;
	public Label nameLabel;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// Animating the bayblade
		RotateTransition rotate= new RotateTransition() ;
		rotate.setNode(beyBladeImageView);
		rotate.setDuration(Duration.millis(500));
		rotate.setDelay(Duration.ZERO);
		rotate.setInterpolator(Interpolator.LINEAR);
		rotate.setCycleCount(TranslateTransition.INDEFINITE);
		rotate.setByAngle(360);
		rotate.play();
		
		
	}

	
	public void upButtonFunction() {
		double xPosn=beyBladeImageView.getX();
		double yPosn=beyBladeImageView.getY();
		beyBladeImageView.setY(yPosn-10);
		
	}
	public void downButtonFunction() {
		double xPosn=beyBladeImageView.getX();
		double yPosn=beyBladeImageView.getY();
		beyBladeImageView.setY(yPosn+10);	
	}
	public void leftButtonFunction() {
		RotateTransition rotate= new RotateTransition() ;
		rotate.setNode(beyBladeImageView);
		rotate.setDuration(Duration.millis(500));
		rotate.setDelay(Duration.ZERO);
		rotate.setInterpolator(Interpolator.LINEAR);
		rotate.setCycleCount(TranslateTransition.INDEFINITE);
		rotate.setByAngle(-360);
		rotate.play();
		double xPosn=beyBladeImageView.getX();
		double yPosn=beyBladeImageView.getY();
		beyBladeImageView.setX(xPosn-10);
	}
	public void rightButtonFunction() {
		RotateTransition rotat= new RotateTransition() ;
		rotat.setNode(beyBladeImageView);
		rotat.setDuration(Duration.millis(500));
		rotat.setDelay(Duration.ZERO);
		rotat.setInterpolator(Interpolator.LINEAR);
		rotat.setCycleCount(TranslateTransition.INDEFINITE);
		rotat.setByAngle(360);
		rotat.play();
		double xPosn=beyBladeImageView.getX();
		double yPosn=beyBladeImageView.getY();
		beyBladeImageView.setX(xPosn+10);
	}
	public void quitButtonFunction(ActionEvent event) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("scene3.fxml"));
		
		Parent root = null;
		try {
			root = loader.load();
		} catch (Throwable t) {
			while(t.getCause()!=null) {
				t=t.getCause();
			}
			System.out.println("Error cause: "+t);
		}
		
		Scene scene3 = new Scene(root);
		
		Button button = (Button) event.getSource();
		Stage stage = (Stage) button.getScene().getWindow();
		
		stage.setScene(scene3);
		stage.show();
		
		
	}
	
	// function for setting the name label
	public void setNameLabel(String string) {
		nameLabel.setText(string);
	}





	
}
