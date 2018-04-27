package P3a;

import java.util.Scanner;

public class PilaPopBodega{
	private static Scanner in;
	
	public PilaPopBodega(String[] S){
		in = new Scanner(System.in);
		System.out.println("Ingrese el Pallet que quiere eliminar de la pila");
		String Pallet = in.nextLine();
		for(int i = CuentaNumerosPila(S)-1; i >= 0; i = i - 1){
			System.out.println(Pallet);
			System.out.println(S[i]);
			if(Pallet == S[i]) {
					for(int j = i; j < CuentaNumerosPila(S); j = j + 1) {
						S[j] = S[j+1]; 
					}
			}
		}
		System.out.print( "Tu pila ahora es: ");
		for(int i = 0; i < CuentaNumerosPila(S); i = i + 1){
			System.out.print(S[i] + " ");
		}
		System.out.println();
	}
	
	public static int CuentaNumerosPila(String[] S) {
		int contador = 0;
		for(int i = 0; i < S.length; i = i + 1){
			 if(S[i] != "") {
				 contador = contador +1;
			 }
		}
	 return contador;   
	}

}
