package Capitulo9;
import java.util.Scanner;

public class Parentecis {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe una oracion con parentesis (dira si hay algun parentesis que sobra o falte)");
		String frase = in.nextLine();
		System.out.println(DiferenciaParentesis(frase));
	}
	public static int Diferencia(String frase, char entrada, char salida) {
		int count = 0;
		for (int i = 0; i < frase.length(); i++) {
		char c = frase.charAt(i);
		if (c == entrada) {
		count++;
		} else if (c == salida) {
		count--;
		}
		}
		return count;
	}
	public static int DiferenciaParentesis(String frase) {
		return Diferencia(frase,'(',')');
	}
}
