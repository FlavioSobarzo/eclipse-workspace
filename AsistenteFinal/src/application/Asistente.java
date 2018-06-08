package application;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Asistente extends Application{
	
	Label lb_text1;
	Label llamadaEntrante;
	Label lb_text2;
	Label noticiaEntrante;
	Label segundos;
	Label lb_text3;
	TextField asunto;
	Label lb_text4;
	TextField horaInicio;
	Label lb_text5;
	TextField horaTermino;
	Label lb_text6;
	Label eventoEntrante;
	Button btn;
	Button modoOcupado;
	
	public static boolean ocupado = false; 
	public static double segundo =0;
	private static Llamada[] llamadas = new Llamada[3];
	private static Noticia[] noticias = new Noticia[3];
	private static Evento[] eventos = new Evento[100];
	private static int contadorEventos = 0;
	
	private static Llamada[] guardarLlamadas = new Llamada[100];
	private static int contadorLlamadaG = 0;
	private static String ll = "";
	private static Noticia[] guardarNoticias = new Noticia[100];
	private static int contadorNoticiaG = 0;
	private static String n = "";
	
	public static void main(String[] args) {
		
		llamadas[0] = new Llamada("Flavio", 57282036, 10);
		llamadas[1] = new Llamada("Cristian", 76439764, 30);
		llamadas[2] = new Llamada("Catalina", 45628988, 50);
		noticias[0] = new Noticia("Las 7 lucas del confort", "Porfin van a pagarnos los 7 mil pesos de la colucion del confort", 0);
		noticias[1] = new Noticia("Frutilla con superpoderes", "Una solucion en base a una hormona vegetal optimiza todo el proceso de maduracion de la frutilla", 20);
		noticias[2] = new Noticia("Stan Lee en peligro", "Dos tipos armados se metieron en la casa de Stan Lee", 40);
		launch(args);
		
	}

	@Override
	public void start(Stage stage) throws Exception {
			
			modoOcupado = new Button("Modo ocupado desactivado");
		
			lb_text1 = new Label("Ultimas Llamada:");
			llamadaEntrante = new Label(" ");
			lb_text2 = new Label("Ultimas Noticia:");
			noticiaEntrante = new Label(" ");
			segundos = new Label(" ");
			
			btn = new Button("Agregar evento");
			lb_text3 = new Label("Asunto:");
			asunto = new TextField ("Ingrese asunto");
			asunto.setMaxWidth(200);
			lb_text4 = new Label("Hora de inicio:");
			horaInicio = new TextField ("Ingrese hora de inicio");
			horaInicio.setMaxWidth(200);
			lb_text5 = new Label("Hora de termino:");
			horaTermino = new TextField ("Ingrese hora de termino");
			horaTermino.setMaxWidth(200);
			lb_text6 = new Label("Evento actual:");
			eventoEntrante = new Label("Ninguno");
			
			btn.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent AE) {
					System.out.println("Se apreto el boton");
					eventos[contadorEventos] = new Evento(asunto.getText(), Integer.parseInt(horaInicio.getText()), Integer.parseInt(horaTermino.getText()));
					contadorEventos =+ 1;
					asunto.clear();
					horaInicio.clear();
					horaTermino.clear();
				}
			});
			
			modoOcupado.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent AE) {
					if(ocupado == false) {
						System.out.println("Modo Ocupado activado");
						ocupado = true;
						modoOcupado.setText("Modo ocupado Activado");
					}
					else {
						System.out.println("Modo Ocupado desactivado");
						modoOcupado.setText("Modo ocupado desactivado");
						ocupado = false;
						if(contadorLlamadaG != 0) {
							
							for(int i = 0; i < contadorLlamadaG; i++) {
								ll = ll + ", " + guardarLlamadas[i].getContacto() + " a las " + guardarLlamadas[i].getHora();
							guardarLlamadas[i] = null;
							}
							
							llamadaEntrante.setText("Ha llamado " + ll);
							
						}
						
						if(contadorNoticiaG != 0) {
							
							for(int i = 0; i < contadorNoticiaG; i++) {
								n = n + ", " + guardarNoticias[i].getTitulo() + " a las " + guardarNoticias[i].getHora();
								guardarNoticias[i] = null;
							}
							
							noticiaEntrante.setText("Ha habido las siguientes noticias " + n);
							
						}
						
					}
					
				}
				
			});
			
			lb_text1.getStyleClass().add("my_customLabel");
			lb_text2.getStyleClass().add("my_customLabel");
			lb_text3.getStyleClass().add("my_customLabel");
			lb_text4.getStyleClass().add("my_customLabel");
			lb_text5.getStyleClass().add("my_customLabel");
			lb_text6.getStyleClass().add("my_customLabel");
			btn.getStyleClass().add("my_btn");
			modoOcupado.getStyleClass().add("my_btn");
			
			VBox root = new VBox();
			root.getChildren().addAll(modoOcupado, lb_text1,llamadaEntrante, lb_text2, noticiaEntrante, segundos, lb_text3, asunto, lb_text4, horaInicio, lb_text5, horaTermino, btn, lb_text6, eventoEntrante);
					
			Scene scene = new Scene(root, 1000,550);
			stage.setScene(scene);
			
			scene.getStylesheets().add("application/application.css");
			
			stage.show();
			
			Timeline timeline = new Timeline(
				new KeyFrame(Duration.seconds(0),
						new EventHandler<ActionEvent>() {
					     	@Override 
					        public void handle(ActionEvent actionEvent) {
					        	Date tiempo = new Date();
								
						    	segundo = tiempo.getSeconds();
								segundos.setText(String.valueOf(segundo));
								System.out.println(String.valueOf(segundo));
							
								for(int i = 0; i < 3; i++) {
										
									if(segundo == llamadas[i].getHora()) {
										if(ocupado == false) {
											llamadaEntrante.setText(llamadas[i].getContacto() + " ha llamado");
											System.out.println(llamadas[i].getContacto() + " ha llamado");
										}
										
										else {
											guardarLlamadas[contadorLlamadaG] = llamadas[i];
											contadorLlamadaG =+ 1;
										}
				
									}
										
									if(segundo == noticias[i].getHora()) {
										if(ocupado == false) {
											noticiaEntrante.setText(noticias[i].getTitulo() + ". " + noticias[i].getEncabezado());
											System.out.println(noticias[i].getTitulo() + ". " + noticias[i].getEncabezado());
										}
										
										else {
											guardarNoticias[contadorNoticiaG] = noticias[i];
											contadorNoticiaG =+ 1;
										}
									}
									
								}
								if(contadorEventos != 0) {
									for(int i = 0; i < contadorEventos; i++) {
										
										if(segundo == eventos[i].getHoraInicio()) {
											System.out.println("Tienes el evento: " + eventos[i].getAsunto());
											System.out.println("Y termina a las " + eventos[i].getHoraTermino());
											eventoEntrante.setText(eventos[i].getAsunto() + " finaliza a las " + eventos[i].getHoraTermino());
										}
										
										if(segundo == eventos[i].getHoraTermino()) {
											System.out.println("Tu evento " + eventos[i].getAsunto() + " ha finalizado");
											eventoEntrante.setText("Ninguno");
											
										}
										
									}
								
								}
								
					     	}
					        
					   }
					    
				  ),
			   new KeyFrame(Duration.seconds(1))
		    );
			
			timeline.setCycleCount(Animation.INDEFINITE);
			timeline.play();
					  
		}
}