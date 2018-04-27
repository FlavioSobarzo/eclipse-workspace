package Capitulo3;
import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero{
   public static void main(String args[]){
	   
      Scanner in = new Scanner(System.in);
      System.out.println("Pienso en un numero del 1 al 100");
      System.out.println("¡¡¡Adivina!!!");
      
      int numero = in.nextInt();
      Random random = new Random();
      int respuesta = random.nextInt(100) + 1;
      
      System.out.printf("Dijiste: %d\n", numero);
      System.out.printf("El numero era: %d\n", respuesta);
      System.out.printf("Estubiste cerca por: %d\n", Math.abs(numero - respuesta));
   }
}