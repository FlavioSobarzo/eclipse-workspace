/*
 * Ingrese la cantidad de elementos que trendra su pila
4
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
Si desea trabajar con una nueva pila presione 3
0
Que numero quieres agregar
4
Se agrego 4
La pila es: 4 
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
Si desea trabajar con una nueva pila presione 3
0
Que numero quieres agregar
1
Se agrego 1
La pila es: 4 1 
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
Si desea trabajar con una nueva pila presione 3
0
Que numero quieres agregar
5
Se agrego 5
La pila es: 4 1 5 
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
Si desea trabajar con una nueva pila presione 3
0
Que numero quieres agregar
4
Se agrego 4
La pila es: 4 1 5 4 
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
Si desea trabajar con una nueva pila presione 3
0
Que numero quieres agregar
1
La pila esta llena
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
Si desea trabajar con una nueva pila presione 3
1
Se elimino el numero 4 de la pila
La pila es: 4 1 5 
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
Si desea trabajar con una nueva pila presione 3
2
La pila no se encuentra vacia, esta posee 3 elementos
La pila es: 4 1 5 
Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
Si desea trabajar con una nueva pila presione 3
3
Ingrese la cantidad de elementos que trendra su pila
 */

package P2a;

import java.util.Scanner;

public class Home {
	
	private static Scanner in;
	private static boolean TrabajoConPila;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		while(true) {
			System.out.println("Ingrese la cantidad de elementos que trendra su pila");
			int elementos = in.nextInt();
			Pila Pila = new Pila(elementos);
			TrabajoConPila =true;
			while(TrabajoConPila == true) {
				System.out.println("Si quieres agregar un numero presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2");
				System.out.println("Si desea trabajar con una nueva pila presione 3");
				int PushOrPop = in.nextInt();
		
				if(PushOrPop == 0) {
					System.out.println("Que numero quieres agregar");
					int numero = in.nextInt();
					Pila.PilaPush(numero);
				}
		
				else if(PushOrPop == 1) {
					Pila.PilaPop();
				}

				else if(PushOrPop == 2) {
					Pila.PilaEmpty();
				}

				else if(PushOrPop == 3) {
					TrabajoConPila = false;
				}
			
				else {
					System.out.println("El caracter que ingreso no corresponde");
				}
		
			}
		}
	}
}
