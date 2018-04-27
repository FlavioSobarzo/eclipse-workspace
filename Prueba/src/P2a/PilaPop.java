package P2a;

import java.util.Scanner;

public class PilaPop {
	private static Scanner in;
	
	public PilaPop(int[] S){
		in = new Scanner(System.in);
		System.out.println("Ingrese el numero que quiere eliminar de la pila");
		int numero = in.nextInt();
		int recuerda = -1;
		for(int i = CuentaNumerosPila(S) -1; i >= 0; i = i - 1){
			if(S[i] == numero && recuerda < i) {
					for(int j = i; j < CuentaNumerosPila(S); j = j + 1) {
						S[j] = S[j+1]; 
					}
					recuerda = i;
			}
		}
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
