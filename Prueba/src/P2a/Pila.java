package P2a;

public class Pila {
	
	static int[] pila;
	
	public Pila(int elementos) {
		pila = new int[elementos];
		for(int i = 0; i < pila.length; i++) {
			pila[i] = -1;
		}
	}
	
	public static void PilaPush(int x) {
		int agregar = CuentaNumerosPila(pila);
		if(agregar != pila.length) {
			pila[agregar] = x;
			System.out.println("Se agrego " + x);
			System.out.print("La pila es: ");
			for(int i = 0; i < pila.length; i++) {
				if(pila[i] != -1) {
					System.out.print(pila[i] + " ");
				}
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
			System.out.println("Se elimino el numero " + pila[eliminar - 1] + " de la pila");
			pila[eliminar - 1] = -1;
			System.out.print("La pila es: ");
			for(int i = 0; i < pila.length; i++) {
				if(pila[i] != -1) {
					System.out.print(pila[i] + " ");
				}
			}
			System.out.println();
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
	
	public static void PilaEmpty() {
		int contador = CuentaNumerosPila(pila);
		if(contador == 0) {
			System.out.println("La pila esta vacia");
		}
		else {
			System.out.println("La pila no se encuentra vacia, esta posee " + contador + " elementos");
			System.out.print("La pila es: ");
			for(int i = 0; i < pila.length; i++) {
				if(pila[i] != -1) {
					System.out.print(pila[i] + " ");
				}
			}
			System.out.println();
		}
	}
}
