package Capitulo3;

import java.util.Scanner;

public class CalcularSeg {

	public static void main(String args[]){
	      Scanner in = new Scanner(System.in);
	      System.out.print("Entrega un cantidad de segundos: ");
	      int calcularSeg = in.nextInt();
	      int Hora = calcularSeg / 3600;
	      int segundo = calcularSeg % 3600;
	      int minuto = calcularSeg / 60;
	      segundo = calcularSeg % 60;
	      System.out.printf("%d segundo(s) = %d Hora(s), %d minuto(s), y %d segundo(s)", calcularSeg, Hora, minuto, segundo);
	   }
}
