package P3a;

import java.util.Scanner;
public class PilaPushBodega {
	private static Scanner in;
	
	public PilaPushBodega(String[] S){
		in = new Scanner(System.in);
		System.out.println("Ingrese el numero que quiere agregar de la pila");
		String Pallet = in.nextLine();
		int agregar = CuentaNumerosPila(S);
		S[agregar] = Pallet;
		System.out.println( "Se agrego " + Pallet + " a la pila y su id es " + agregar);
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