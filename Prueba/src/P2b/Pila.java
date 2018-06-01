package P2b;

import java.util.Scanner;

public class Pila {
	
	private static Scanner in;
	static int[] id;
	static String[] pila;
	static boolean trabajandoPila = true;
	public Pila(int pallets) {
	
		  in = new Scanner(System.in);

	      pila = new String[pallets];
			for(int i = 0; i < pila.length; i++) {
				pila[i] = "";
			}
//			
		  this.id = new int[pallets];
			for(int i = 0; i < pila.length; i++) {
				id[i] = i;
			}
			
			while(trabajandoPila == true) {
			System.out.println("Si quieres agregar un pallet presiona 0, si quieres eliminar presiona 1 y si quieres ver si la pila esta vacia presione 2");
			System.out.println("Si desea trabajar con una nueva pila presione 3");
			int PushOrPop = in.nextInt();
	
			if(PushOrPop == 0) {
				System.out.println("¿Que pallet quieres agregar?");
				String nombre = in.nextLine();
				Pila.PilaPush(nombre);
			}
	
			else if(PushOrPop == 1) {
				Pila.PilaPop();
			}

			else if(PushOrPop == 2) {
				Pila.PilaEmpty();
			}
			else if(PushOrPop == 3) {
				trabajandoPila= false;
			}
		
			else {
				System.out.println("El caracter que ingreso no corresponde");
			}
			}
	}
	
	public static void PilaPush(String x) {
		int agregar = CuentaNumerosPila(pila);
		if(agregar != pila.length) {
			pila[agregar] = x;
			System.out.println( "Se agrego " + x + " a la pila y su id es " + agregar);
			System.out.print( "Tu pila ahora es: ");
			for(int i = 0; i < CuentaNumerosPila(pila); i = i + 1){
				System.out.print(pila[i] + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("La pila esta llena");
		}
	}
	
	public static void PilaPop() {
		int eliminar = CuentaNumerosPila(pila);
		if(eliminar != 0) {
			System.out.println("Se elimino el pallet" + pila[eliminar - 1] + " de la pila");
			pila[eliminar - 1] = "";
			System.out.print("La pila es: ");
			for(int i = 0; i < pila.length; i++) {
				if(pila[i] != "") {
					System.out.print(pila[i] + " ");
				}
			}
			System.out.println();
		}
		else {
			System.out.println("No se encuentran elementos en la pila");
		}
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
	
	public static void PilaEmpty() {
		int contador = CuentaNumerosPila(pila);
		if(contador == 0) {
			System.out.println("La pila esta vacia");
		}
		else {
			System.out.println("La pila no se encuentra vacia, esta posee " + contador + " elementos");
			System.out.print("La pila es: ");
			for(int i = 0; i < pila.length; i++) {
				if(pila[i] != "") {
					System.out.print(pila[i] + " ");
				}
			}
			System.out.println();
		}
	}
}
