package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
	Label sep1; //separador /
	Label sep3;
	TextField dia;
	TextField mes;
	TextField año;
	Label lb_text5;
	TextField horaTermino;
	Label sep2; //separador :
	Label sep4;
	TextField horaI;
	TextField minutoI;
	Label lb_text8;
	TextField horaT;
	TextField minutoT;
	Label lb_text6;
	Label eventoEntrante;
	Button btn;
	Button modoOcupado;
	Label lb_text7;
	static ArrayList<Label> eventosProx = new ArrayList<Label>();
	static int h =16;
	static int m = 15;
	int eventoOcurriendo = -1;
	boolean nuevoEvento = false;
	ArrayList<Integer> tiempoRestante = new ArrayList<Integer>();
	ArrayList<String> unidad = new ArrayList<String>();
	
	public static boolean ocupado = false; 
	public static double segundo =0;
	public static ArrayList<Llamada> llamadas = new ArrayList<Llamada>();
	public static ArrayList<Noticia> noticias = new ArrayList<Noticia>();
	public static ArrayList<Evento> eventos = new ArrayList<Evento>();
	// private static Llamada[] llamadas = new Llamada[3];
	// private static Noticia[] noticias = new Noticia[3];
	//private static Evento[] eventos = new Evento[100];	
	private static int contadorEventos = 0;
	
	/*
	ArrayList<Llamada> guardarLlamadas = new ArrayList<Llamada>();
	ArrayList<Noticia> guardarNoticias = new ArrayList<Noticia>();
	*/
	private static Llamada[] guardarLlamadas = new Llamada[100];
	private static int contadorLlamadaG = 0;
	private static String ll = "";
	private static Noticia[] guardarNoticias = new Noticia[100];
	private static int contadorNoticiaG = 0;
	private static String n = "";
	
	public static void main(String[] args) {
		
		for(int i =0; i < 20; i++) {
		eventosProx.add(new Label(""));
		}
		llamadas.add( new Llamada("Flavio", 57282036, h, m, 10, 22, 6, 2018) );
		llamadas.add( new Llamada("Cristian", 76439764, h, m, 20, 22,  6, 2018) );
		llamadas.add( new Llamada("Catalina", 45628988, h, m,30 ,22, 6, 2018) );
		llamadas.add( new Llamada("Flavio", 57282036, h, m+1, 20 , 22, 6, 2018) );
		llamadas.add( new Llamada("Cristian", 76439764, h, m+1, 10, 22, 6, 2018) );
		llamadas.add( new Llamada("Catalina", 45628988, h,m+1, 40, 22, 6, 2018) );
		llamadas.add( new Llamada("Flavio", 57282036, h, m+2, 10, 22, 6, 2018) );
		noticias.add( new Noticia("Las 7 lucas del confort", "Porfin van a pagarnos los 7 mil pesos de la colucion del confort", h, m, 10, 22, 6, 2018) );
		noticias.add( new Noticia("Frutilla con superpoderes", "Una solucion en base a una hormona vegetal optimiza todo el proceso de maduracion de la frutilla", h, m, 40, 22, 6, 2018) );
		noticias.add( new Noticia("Stan Lee en peligro", "Dos tipos armados se metieron en la casa de Stan Lee", h, m+1, 10, 22, 6, 2018) );
		noticias.add( new Noticia("Las 7 lucas del confort", "Porfin van a pagarnos los 7 mil pesos de la colucion del confort", h, m+1, 0, 22, 6, 2018) );
		noticias.add( new Noticia("Frutilla con superpoderes", "Una solucion en base a una hormona vegetal optimiza todo el proceso de maduracion de la frutilla", h, m+2, 0, 22, 6, 2018) );
		noticias.add( new Noticia("Stan Lee en peligro", "Dos tipos armados se metieron en la casa de Stan Lee", h, m+1, 45, 22, 6, 2018) );
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
			
			modoOcupado = new Button("Modo ocupado desactivado");
		
			lb_text1 = new Label("Ultima Llamada:");
			llamadaEntrante = new Label(" ");
			lb_text2 = new Label("Ultima Noticia:");
			noticiaEntrante = new Label(" ");
			segundos = new Label(" ");
			
			btn = new Button("Agregar evento");
			lb_text3 = new Label("Asunto:");
			asunto = new TextField ("Ingrese asunto");
			asunto.setMaxWidth(200);
			lb_text4 = new Label("Fecha:");
			horaInicio = new TextField ("Fecha");
			sep1 = new Label("/");
			sep3 = new Label("/");
			sep2 = new Label(":");
			sep4 = new Label(":");
			dia = new TextField ("dd");
			mes = new TextField ("mm");
			año = new TextField ("aaaa");
			dia.setMaxWidth(50); mes.setMaxWidth(50); año.setMaxWidth(60);
			horaInicio.setMaxWidth(200);
			lb_text5 = new Label("Hora Inicio:");
			horaTermino = new TextField ("Ingrese hora de termino");
			horaI = new TextField ("hh");
			minutoI = new TextField ("mm");
			horaI.setMaxWidth(50); minutoI.setMaxWidth(50);
			lb_text8 = new Label("Hora Termino:");
			horaT = new TextField ("hh");
			minutoT = new TextField ("mm");
			horaT.setMaxWidth(50); minutoT.setMaxWidth(50);
			horaTermino.setMaxWidth(200);
			lb_text6 = new Label("Evento actual:");
			eventoEntrante = new Label("Ninguno");
			lb_text7 = new Label("Eventos proximos");
			
			btn.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent AE) {
					System.out.println("Se apreto el boton");
					/*boolean noSePuede = false;
					if(eventos.size() != 0) {
						for(int i = 0; i < eventos.size(); i++) {
							
						}
					}*/
						eventos.add( new Evento(asunto.getText(), Integer.parseInt(horaI.getText()), Integer.parseInt(minutoI.getText()), Integer.parseInt(horaT.getText()), Integer.parseInt(minutoT.getText()), Integer.parseInt(dia.getText()), Integer.parseInt(mes.getText()), Integer.parseInt(año.getText())) );
						contadorEventos =+ 1;
						asunto.setText("Ingrese asunto");
						dia.setText("dd");
						mes.setText("mm");
						año.setText("aaaa");
						horaI.setText("hh");
						horaT.setText("hh");
						minutoI.setText("mm");
						minutoT.setText("mm");
						eventosProx.add( new Label(eventos.get(contadorEventos-1).getAsunto() + " comenzara en ") );
						unidad.add("");
						tiempoRestante.add(15);
						nuevoEvento = true;						
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
			lb_text7.getStyleClass().add("my_customLabel");
			lb_text8.getStyleClass().add("my_customLabel");
			btn.getStyleClass().add("my_btn");
			modoOcupado.getStyleClass().add("my_btn");
			
			VBox root = new VBox();
			HBox hb1 = new HBox();
			HBox hb2 = new HBox();
			HBox hb3 = new HBox();
			hb1.getChildren().addAll(dia, sep1, mes, sep3, año);
			hb2.getChildren().addAll(horaI, sep2, minutoI);
			hb3.getChildren().addAll(horaT, sep4, minutoT);
			root.getChildren().addAll(modoOcupado, lb_text1,llamadaEntrante, lb_text2, noticiaEntrante, segundos, lb_text3, asunto, lb_text4, hb1, lb_text5, hb2, lb_text8, hb3, btn, lb_text6, eventoEntrante, lb_text7);
			for(int i = 0; i < eventosProx.size(); i++) {
				root.getChildren().add(eventosProx.get(i));
			}
			Scene scene = new Scene(root, 1000,800);
			stage.setScene(scene);

			
			scene.getStylesheets().add("application/application.css");
			
			stage.show();
			Date tiempo = new Date();
			segundo = tiempo.getSeconds();
	    	int minR = tiempo.getMinutes();
	    	int horaR = tiempo.getHours();
	    	int diaR = tiempo.getDay() + 16;
	    	int mesR = tiempo.getMonth() + 1;
	    	int añoR = tiempo.getYear() + 2000 - 100;
	    	
			segundos.setText(String.valueOf(horaR) + ":" + String.valueOf(minR) + "  " + String.valueOf(diaR) + "/" + String.valueOf(mesR) + "/" + String.valueOf(añoR));
			//System.out.println(String.valueOf(segundo));
		
			Timeline timeline = new Timeline(
				new KeyFrame(Duration.seconds(0),
						new EventHandler<ActionEvent>() {
					     	@Override 
					        public void handle(ActionEvent actionEvent) {
					     		Date tiempo = new Date();
						    	segundo = tiempo.getSeconds();
						    	int minR = tiempo.getMinutes();
						    	int horaR = tiempo.getHours();
						    	int diaR = tiempo.getDay() + 17;
						    	int mesR = tiempo.getMonth() + 1;
						    	int añoR = tiempo.getYear() + 2000 - 100;
						    	
								segundos.setText(String.valueOf(horaR) + ":" + String.valueOf(minR) + ":" + String.valueOf(segundo) + "  " + String.valueOf(diaR) + "/" + String.valueOf(mesR) + "/" + String.valueOf(añoR));
								//System.out.println(String.valueOf(segundo));
							
								for(int i = 0; i < llamadas.size(); i++) {
										
									if(minR == llamadas.get(i).getMin() && horaR == llamadas.get(i).getHora() && diaR == llamadas.get(i).getDia() && mesR == llamadas.get(i).getMes() && añoR == llamadas.get(i).getAño() && segundo == llamadas.get(i).getSeg()) {
										if(ocupado == false) {
											llamadaEntrante.setText(llamadas.get(i).getContacto() + " ha llamado");
											System.out.println(llamadas.get(i).getContacto() + " ha llamado");
										}
										
										else {
											guardarLlamadas[contadorLlamadaG] = llamadas.get(i);
											contadorLlamadaG =+ 1;
										}
				
									}
								}
								for(int i = 0; i < noticias.size(); i++) {
									if(horaR == noticias.get(i).getHora() && minR == noticias.get(i).getMin() && diaR == noticias.get(i).getDia() && mesR == noticias.get(i).getMes() && añoR == noticias.get(i).getAño() && segundo == noticias.get(i).getSeg()) {
										if(ocupado == false) {
											noticiaEntrante.setText(noticias.get(i).getTitulo() + ". " + noticias.get(i).getEncabezado());
											System.out.println(noticias.get(i).getTitulo() + ". " + noticias.get(i).getEncabezado());
										}
										
										else {
											guardarNoticias[contadorNoticiaG] = noticias.get(i);
											contadorNoticiaG =+ 1;
										}
									}
									
								}
								if(contadorEventos != 0) {
									for(int i = 0; i < eventos.size(); i++) {
										
										if(horaR == eventos.get(i).getHoraInicio() && minR == eventos.get(i).getMinI() && diaR == eventos.get(i).getDia() && mesR == eventos.get(i).getMes() && añoR == eventos.get(i).getAño() ) {
											System.out.println("Tienes el evento: " + eventos.get(i).getAsunto());
											System.out.println("Y termina a las " + eventos.get(i).getHoraTermino());
											eventoEntrante.setText(eventos.get(i).getAsunto() + " finaliza a las " + eventos.get(i).getHoraTermino());
											eventoOcurriendo = i;
										}
										
										if(horaR == eventos.get(i).getHoraTermino() && minR == eventos.get(i).getMinT() && diaR == eventos.get(i).getDia() && mesR == eventos.get(i).getMes() && añoR == eventos.get(i).getAño() ) {
											System.out.println("Tu evento " + eventos.get(i).getAsunto() + " ha finalizado");
											eventoEntrante.setText("Ninguno");
											eventos.remove(i);
										}
										
									}
								
								}
								if(eventoOcurriendo != -1) {
									int tiempoRestanteT = 1;
									String unidadT = "";
									if(horaR == eventos.get(eventoOcurriendo).getHoraTermino() ) {
										tiempoRestanteT = eventos.get(eventoOcurriendo).getMinT() - minR;
										unidadT = "minutos";
									}
									
									else if(horaR < eventos.get(eventoOcurriendo).getHoraTermino()) {
										tiempoRestanteT = eventos.get(eventoOcurriendo).getHoraTermino() - horaR;
										unidadT = "horas";
									}
									eventoEntrante.setText(eventos.get(eventoOcurriendo).getAsunto() + " finaliza en " + tiempoRestanteT + " " + unidadT);
								}
								
								if( nuevoEvento == true) {
									for(int i = 0; i < eventosProx.size() - 19; i++) {
										if(añoR == eventos.get(i).getAño() && mesR == eventos.get(i).getMes() && diaR == eventos.get(i).getDia()  && horaR == eventos.get(i).getHoraInicio() ) {
											tiempoRestante.set(i, eventos.get(i).getMinI() - minR);
											unidad.set(i, "minutos");
										}
										else if(añoR == eventos.get(i).getAño() && mesR == eventos.get(i).getMes() && diaR == eventos.get(i).getDia() ) {
											tiempoRestante.set(i, eventos.get(i).getHoraInicio() - horaR);
											unidad.set(i, "horas");
										}
										else if(añoR == eventos.get(i).getAño() && mesR == eventos.get(i).getMes() ) {
											tiempoRestante.set(i, eventos.get(i).getDia() - diaR);
											unidad.set(i, "dias");
										}
										else if(añoR == eventos.get(i).getAño() ) {
											tiempoRestante.set(i, eventos.get(i).getMes() - mesR);
											unidad.set(i, "meses");
										}
										else if(añoR < eventos.get(i).getAño() ) {
											tiempoRestante.set(i, eventos.get(i).getAño() - añoR);
											unidad.set(i, "años");
										}
										if(unidad.get(i) == "minutos" && tiempoRestante.get(i) <= 0) {
											eventosProx.get(i).setText("");
										}
										else {
										eventosProx.get(i).setText(eventos.get(i).getAsunto() + " comenzara en " + tiempoRestante.get(i) + " " + unidad.get(i));
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