package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;


public class Asistente extends Application{
	
	Label lb_text;
	Button btn_click;
	int x=0;
	private static Llamada[] llamadas = new Llamada[3];
	private static Noticia[] noticias= new Noticia[3];
	private static Evento[] eventos = new Evento[100];
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		llamadas[0] = new Llamada("Flavio", 57282036, 10);
		llamadas[1] = new Llamada("Cristian", 76439764, 30);
		llamadas[2] = new Llamada("Catalina", 45628988, 40);
		noticias[0] = new Noticia("Catalina", 57282036, 0);
		noticias[1] = new Noticia("Catalina", 57282036, 20);
		noticias[2] = new Noticia("Catalina", 57282036, 50);

		
		lb_text = new Label("Here some Text");
		btn_click = new Button("Click it");
		
		lb_text.getStyleClass().add("my_customLabel");
		
		btn_click.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				if(x == 0) {
					lb_text.setText("New Text");	
					x = 1;
				}
				else {
					lb_text.setText("Here some Text");
					x = 0;
				}
			}
		});
		
		VBox root = new VBox();
		root.getChildren().addAll(lb_text, btn_click);
		
		Scene scene = new Scene(root, 500,500);
		stage.setScene(scene);
		
		scene.getStylesheets().add("application/application.css");
		
		stage.show();
		
	}
}