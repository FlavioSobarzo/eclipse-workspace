package P1a;

/*
 Si quieres agregar un numero presiona 0 si quieres eliminar presiona 1
0
Ingrese el numero que quiere agregar de la pila
15
Tu pila es: 15 
Si quieres agregar un numero presiona 0 si quieres eliminar presiona 1
0
Ingrese el numero que quiere agregar de la pila
1
Tu pila es: 15 1 
Si quieres agregar un numero presiona 0 si quieres eliminar presiona 1
0
Ingrese el numero que quiere agregar de la pila
6
Tu pila es: 15 1 6 
Si quieres agregar un numero presiona 0 si quieres eliminar presiona 1
0
Ingrese el numero que quiere agregar de la pila
1
Tu pila es: 15 1 6 1 
Si quieres agregar un numero presiona 0 si quieres eliminar presiona 1
1
Ingrese el numero que quiere eliminar de la pila
1
Tu pila es: 15 1 6 
Si quieres agregar un numero presiona 0 si quieres eliminar presiona 1
 */

import java.util.Scanner;

public class Pila {
	
	private static Scanner in;
    private static int[] pila = new int[20];
    
	public static void main(String[] args) {
		in = new Scanner(System.in);
		for(int i = 0; i < pila.length; i = i + 1){
			 pila[i] = -1;  
		}
		while(true) {
			System.out.println("Si quieres agregar un numero presiona 0 si quieres eliminar presiona 1");
			int PushOrPop = in.nextInt();
			if(PushOrPop == 0) {
				System.out.println("Ingrese el numero que quiere agregar de la pila");
				int numero = in.nextInt();
				PilaPush(pila, numero);
				System.out.print( "Tu pila es: ");
				for(int i = 0; i < CuentaNumerosPila(pila); i = i + 1){
					System.out.print(pila[i] + " ");
				}
			System.out.println();
			}
			else if(PushOrPop == 1) {
				System.out.println("Ingrese el numero que quiere eliminar de la pila");
				int numero = in.nextInt();
				PilaPop(pila, numero);
				System.out.print( "Tu pila es: ");
				for(int i = 0; i < CuentaNumerosPila(pila); i = i + 1){
					System.out.print(pila[i] + " ");
				}
			System.out.println();
			}
			else {
				System.out.println("El caracter que escribio no corresponde");
			}
		}
	}
	
	public static void PilaPush(int[] S, int x) {
		int agregar = CuentaNumerosPila(S);
		S[agregar] = x;
	}
	
	public static void PilaPop(int[] S, int x) {
		int recuerda = -1;
		for(int i = CuentaNumerosPila(S) -1; i >= 0; i = i - 1){
			if(S[i] == x && recuerda < i) {
					for(int j = i; j < CuentaNumerosPila(S); j = j + 1) {
						S[j] = S[j+1]; 
					}
					recuerda = i;
			}
		}
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
