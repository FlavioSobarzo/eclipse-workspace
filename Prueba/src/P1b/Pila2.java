/*
 * La pila 1 es: 34 53 28 45 23 33 66 91 6 53 
La pila 2 es: 95 59 68 10 3 69 53 25 18 33 
¿A que pila le quiere hacer cambios? (indique el numero de la pila)
1
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
1
Se elimino el numero 53 de la pila

La pila 1 es: 34 53 28 45 23 33 66 91 6 
La pila 2 es: 95 59 68 10 3 69 53 25 18 33 
¿A que pila le quiere hacer cambios? (indique el numero de la pila)
1
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
0
Ingrese el numero que quiere agregar de la pila
4

La pila 1 es: 34 53 28 45 23 33 66 91 6 4 
La pila 2 es: 95 59 68 10 3 69 53 25 18 33 
¿A que pila le quiere hacer cambios? (indique el numero de la pila)
2
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
2
La pila no se encuentra vacia

La pila 1 es: 34 53 28 45 23 33 66 91 6 4 
La pila 2 es: 95 59 68 10 3 69 53 25 18 33 
¿A que pila le quiere hacer cambios? (indique el numero de la pila)
2
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
0
Ingrese el numero que quiere agregar de la pila
1
La pila esta llena

La pila 1 es: 34 53 28 45 23 33 66 91 6 4 
La pila 2 es: 95 59 68 10 3 69 53 25 18 33 
¿A que pila le quiere hacer cambios? (indique el numero de la pila)
 */
package P1b;

import java.util.Scanner;

public class Pila2 {
	
	private static Scanner in;
    private static int[] pilas = new int[20];
    private static int elementosPila1 = (int)(Math.random() * 18 +1);
    private static int elementosPila2 = 20 - elementosPila1;
    
	public static void main(String[] args) {
		in = new Scanner(System.in);
		for(int i = 0; i < elementosPila1; i = i + 1){
			 pilas[i] = (int)(Math.random()*100);  
		}
		for(int i = elementosPila1; i < 20; i = i + 1){
			 pilas[i] = (int)(Math.random()*100);  
		}
			
		while(true) {
			System.out.print("La pila 1 es: ");	
			for(int i = 0; i < elementosPila1; i = i + 1){
				if(pilas[i] != -1) {
					System.out.print(pilas[i] + " ");
					}
			}
			System.out.println();
			System.out.print("La pila 2 es: ");	
			for(int i = elementosPila1; i < 20; i = i + 1){
				if(pilas[i] != -1) {
				System.out.print(pilas[i] + " ");
				}
			}
			System.out.println();
			
			System.out.println("¿A que pila le quiere hacer cambios? (indique el numero de la pila)");
			int pilaElegida = in.nextInt();
			
				if(pilaElegida == 1 || pilaElegida == 2) {
					System.out.println("Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2");
					int PushOrPop = in.nextInt();
			
					if(PushOrPop == 0) {
						System.out.println("Ingrese el numero que quiere agregar de la pila");
						int numero = in.nextInt();
						PilaPush(pilas, numero, pilaElegida);
						System.out.println();
					}
					else if(PushOrPop == 1) {
						PilaPop(pilas, pilaElegida);
						System.out.println();
					}
					else if(PushOrPop == 2) {
						PilaEmpty(pilas, pilaElegida);
						System.out.println();
					}
					else {
						System.out.println("El caracter que escribio no corresponde");
					}
				}
				else {
					System.out.println("El caracter que escribio no corresponde");
				}
		}
	}
	
	public static void PilaPush(int[] S, int x, int Np) {
		int agregar = CuentaNumerosPila(S, Np);
		//System.out.println("--" + elementosPila1 + "--"+ elementosPila2 +"--" + agregar + "--");
		if((agregar == elementosPila1 && Np == 1) || (agregar == 20 && Np == 2)) {
			System.out.println("La pila esta llena");
		}
		else{
			S[agregar] = x;
		}
	}
	
	public static void PilaPop(int[] S, int Np) {
		int eliminar = CuentaNumerosPila(S, Np);
		//System.out.println("--" + elementosPila1 + "--"+ elementosPila2 +"--" + eliminar + "--");
		if(eliminar == 0 && Np == 1  || eliminar == elementosPila1 && Np == 2) {
			System.out.println("No se encuentran elementos en la pila");
		}
		else {
			System.out.println("Se elimino el numero " + S[eliminar - 1] + " de la pila");
			S[eliminar - 1] = -1;
		}
	}
	
	public static void PilaEmpty(int[] S, int Np) {
		int contador = CuentaNumerosPila(S, Np);
		//System.out.println("--" + elementosPila1 + "--"+ elementosPila2 +"--" + contador + "--");
		if(contador == 0 || contador == elementosPila1) {
			System.out.println("La pila esta vacia");
		}
		else {
			System.out.println("La pila no se encuentra vacia");
		}
	}
	
	public static int CuentaNumerosPila(int[] S, int Np) {
		int contador = 0;
		if(Np == 1) {
			for(int i = 0; i < elementosPila1; i = i + 1){
				if(S[i] != -1) {
					contador = contador +1;
				}
			}
		}
		else if(Np == 2) {
			contador = elementosPila1;
			for(int i = elementosPila1; i < 20; i = i + 1){
				if(S[i] != -1) {
					contador = contador +1;
				}
			}
		}
	 return contador;   
	}
}
