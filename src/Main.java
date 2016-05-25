

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main  extends Application
{
	Stage primaryStage;
	Scene logScene;
	Scene mainScene;
	TabPane mainTab;
	
	public static void main(String[] args)
	{
		launch(args);
		new ClientSocket();
	}

	@Override
	public void start(Stage stage) throws Exception
	{
		primaryStage=stage;
		setLogin();
		setMain();
		primaryStage.setScene(logScene);
		primaryStage.show();

		
		
	}
	
	public void setLogin (){
		Label name = new Label("Name : ");
		TextField getName = new TextField();
		Button connect=  new Button (" Connect");
		connect.setOnAction(new EventHandler<ActionEvent>()
		{
			
			@Override
			public void handle(ActionEvent event)
			{
				
				primaryStage.setScene(mainScene);
				
			}
		});
		VBox pane = new VBox();
		pane.setPadding(new Insets(10,15,55,10)); 
		pane.getChildren().addAll(name,getName, connect);
		pane.setSpacing(10);
	
		
		logScene = new Scene(pane,200, 120);
		
	}
	
	public void setMain(){
		
		mainTab = new TabPane();
		mainScene= new Scene(mainTab, 500,500);
	}

}
