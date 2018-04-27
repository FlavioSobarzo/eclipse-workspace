package P2a;

import java.util.Scanner;
public class PilaPush {
	private static Scanner in;
	
	public PilaPush(int[] S){
		in = new Scanner(System.in);
		System.out.println("Ingrese el numero que quiere agregar de la pila");
		int numero = in.nextInt();
		int agregar = CuentaNumerosPila(S);
		S[agregar] = numero;
		System.out.print( "Tu pila es: ");
		for(int i = 0; i < CuentaNumerosPila(S); i = i + 1){
			System.out.print(S[i] + " ");
		}
	    System.out.println();
	}
	
	public static int CuentaNumerosPila(int[] S) {
		int contador = 0;
		for(int i = 0; i < S.length; i = i + 1){
			 if(S[i] != -1) {
				 contador = contador +1;
			 }
		}
	 return contador;   
	}

}
