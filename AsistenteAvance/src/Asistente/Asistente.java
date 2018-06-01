package Asistente;

import java.util.Scanner;

public class Asistente{
	
	private static Scanner in;
	private static String eventoNuevo;
	private static int eventoNuevoHoraI;
	private static int eventoNuevoHoraT;
	
	public static void main(String[] args) {

		in = new Scanner(System.in);
		while(true){
			System.out.println("Ingrese el evento nuevo");
			eventoNuevo = in.nextLine();
			System.out.println("Ingrese la hora de inicio");
			eventoNuevoHoraI = in.nextInt();
			System.out.println("Ingrese la hora de termino");
			eventoNuevoHoraT = in.nextInt();
			
			Evento newEvento = new Evento(eventoNuevo, eventoNuevoHoraI, eventoNuevoHoraT);
		}
	}
     
}

