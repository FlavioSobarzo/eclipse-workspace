/*
 * Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
0
Ingrese el numero que quiere agregar de la pila
1
Tu pila es: 1 
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
1
Se elimino el numero 1 de la pila
Tu pila es: 
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
1
No se encuentran elementos en la pila
Tu pila es: 
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
0
Ingrese el numero que quiere agregar de la pila
2
Tu pila es: 2 
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
2
La pila no se encuentra vacia, esta posee 1 elementos
Tu pila es: 2 
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
1
Se elimino el numero 2 de la pila
Tu pila es: 
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
2
La pila esta vacia
Tu pila es: 
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
 */
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
			System.out.println("Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2");
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
				PilaPop(pila);
				System.out.print( "Tu pila es: ");
				for(int i = 0; i < CuentaNumerosPila(pila); i = i + 1){
					System.out.print(pila[i] + " ");
				}
			System.out.println();
			}
			else if(PushOrPop == 2) {
				PilaEmpty(pila);
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
	
	public static void PilaPop(int[] S) {
		int eliminar = CuentaNumerosPila(S);
		if(eliminar != 0) {
			System.out.println("Se elimino el numero " + S[eliminar - 1] + " de la pila");
			S[eliminar - 1] = -1;
		}
		else {
			System.out.println("No se encuentran elementos en la pila");
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
	public static void PilaEmpty(int[] S) {
		int contador = CuentaNumerosPila(S);
		if(contador == 0) {
			System.out.println("La pila esta vacia");
		}
		else {
			System.out.println("La pila no se encuentra vacia, esta posee " + contador + " elementos");
		}
	}
}
