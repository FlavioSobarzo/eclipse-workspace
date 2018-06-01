/*
 Ingrese la cantidad de Pilas que trendra su bodega
1
Ingrese la cantidad de Pallets que trendra su pila numero 1
2
Si quieres agregar un pallet presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
Si desea trabajar con una nueva pila presione 3
0
¿Que pallet quieres agregar?
mesa
Se agrego mesa a la pila y su id es 0
Tu pila ahora es:  mesa
Si quieres agregar un pallet presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2
Si desea trabajar con una nueva pila presione 3
3
Ingrese la cantidad de Pallets que trendra su pila numero 2
2
...
 */
package P2b;

import java.util.Scanner;

public class Home {
	
	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de Pilas que trendra su bodega");
		int pilas = in.nextInt();
		Bodega newBodega = new Bodega(pilas);
	}

}
