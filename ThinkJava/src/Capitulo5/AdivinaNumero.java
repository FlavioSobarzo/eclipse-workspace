package Capitulo5;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
	
	   public static void main(String args[]){
		      Random random = new Random();
		      int respuesta = random.nextInt(100) + 1;
		      Adivina(respuesta);
	   }
	   
	   public static void Adivina(int r){
		   Scanner in = new Scanner(System.in);
		   System.out.println("Pienso en un numero del 1 al 100");
		   System.out.println("¡¡¡Adivina!!!");
		   int numero = in.nextInt();
		   
		   if(numero == r) {
			   System.out.println("¡¡Ganaste!!");
		   }
		   else {
			   System.out.println("Ese no era el numero");  
			   Diferencia(numero, r);
			   System.out.println("Intentalo de nuevo"); 
			   Adivina(r);
		   }
		}
	   
	   public static void Diferencia(int numero, int random){
		   int diferencia = Math.abs(numero - random);
		   if(diferencia >= 50) {
			 System.out.println("Estubiste muy lejos"); 
		   }
		   else {
			 System.out.println("Estas muy cerca");
		   }
		   System.out.println("La diferencia es " + diferencia); 
		}
}
