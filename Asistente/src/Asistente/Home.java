package Asistente;
import java.util.Scanner;
import java.util.Date;

public class Home {
	
	static Scanner in = new Scanner(System.in);
	static boolean ocupado = false; //si esta false es porque el modo ocupado no esta activo
	static double segundo =0;;
	//static int minuto=0; //Por ahora no lo uso
	
	public static void main(String[] args) {
		String nombre;
		
		System.out.println("¿Como te llamas?");
		nombre = in.nextLine();
		System.out.println("Bienvenido " + nombre); //pequeña introduccion
		
		while (true) { //se crea un while para que el codigo constantemente revise si hay alguna noticia o llamada	
		Date tiempo = new Date();
		if(segundo != tiempo.getSeconds()){ 
		//si el seg guardado anterior es igual al seg actual no entra
		//asi se evita de que la noticia se imprima muchas veces
	    segundo = tiempo.getSeconds(); //guardo en la variable el seg actual
	    
	    /*minuto = tiempo.getMinutes();
	    //double horaActual = minuto + segundo/100; //Para mas adelante
	    System.out.println(horaActual);*/
	    
	    Noticias horaNoticia = new Noticias(segundo,ocupado); //llamo a la clase Noticias
	    Llamadas horaLlamada = new Llamadas(segundo, ocupado); //llamo a la clase Llammadas
	    
		}
		}
     }
}