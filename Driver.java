import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Driver extends  Application{

	@Override
	public void start(Stage stage) {
		
		FXMLLoader loader =new FXMLLoader(getClass().getResource("scene1.fxml")) ;
		
		Parent root = null;
		try {
			root = loader.load();
		} catch (Throwable t) {
			while (t.getCause()!=null) {
				t=t.getCause();
			}
			System.out.println("The root cause for the error : "+t);			
		}
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}



}
