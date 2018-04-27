package Capitulo3;

import java.util.Scanner;

public class Temperatura {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
	System.out.println("Ingresa la temperatura en grados Celsius uy se pasara a Fahrenheit");
	int celsius = in.nextInt();
	double fahrenheit = (celsius * 1.8) + 32;
	System.out.println("Ingreso " + celsius + "°C");
	System.out.println(celsius + "°C" + "=" + fahrenheit + "°F");	
	}
}
