package Capitulo5;

import java.util.Scanner;

public class CancionBotella {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingresa el numero de botellas de la cancion");
		int botellas = in.nextInt();
		CancionBotella(botellas);
	}
	
	public static void CancionBotella(int numero){
		System.out.println(numero + " bottles of beer on the wall,");
		System.out.println(numero + " bottles of beer,");
		System.out.println("ya’ take one down, ya’ pass it around,");
		System.out.println((numero - 1) + " bottles of beer on the wall.");
		if(numero != 1) {
			CancionBotella(numero-1);
		}
	}
}
