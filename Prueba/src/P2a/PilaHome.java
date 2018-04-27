package P2a;
/*
Si quieres agregar un numero presiona 0 si quieres eliminar presiona 1
0
Ingrese el numero que quiere eliminar de la pila
15
Tu pila es: 15 
Si quieres agregar un numero presiona 0 si quieres eliminar presiona 1
0
Ingrese el numero que quiere eliminar de la pila
1
Tu pila es: 15 1 
Si quieres agregar un numero presiona 0 si quieres eliminar presiona 1
0
Ingrese el numero que quiere eliminar de la pila
6
Tu pila es: 15 1 6 
Si quieres agregar un numero presiona 0 si quieres eliminar presiona 1
1
Ingrese el numero que quiere eliminar de la pila
15
Tu pila es: 1 6 
Si quieres agregar un numero presiona 0 si quieres eliminar presiona 1
 */

import java.util.Scanner;

public class PilaHome {
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
				PilaPush agregar = new PilaPush(pila);
			}
			else if(PushOrPop == 1) {
				PilaPop eliminar = new PilaPop(pila);
			}
			else {
				System.out.println("El caracter que escribio no corresponde");
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
