package Capitulo8;

public class roles {
	

	public static int banana(int[] a) { // multiplica todos los numeros dentro de a
			int kiwi = 1; // su rol es ser la variable donde se guarda el resultado 
			int i = 0;
			while (i < a.length) {
				kiwi = kiwi * a[i];
				i++;
			}
		return kiwi;
		}
	
		public static int grapefruit(int[] a, int grape) { // retorna en que casilla de a se encuantra grape
			for (int i = 0; i < a.length; i++) {
				if (a[i] == grape) {
					return i;
				}
			}
			return -1;
		}
		
		public static int pineapple(int[] a, int apple) { // indica cuantos numeros de la var apple hay en a
			int pear = 0; // su funcion es ser el contador
			for (int pine: a) {
				if (pine == apple) {
					pear++;
				}
			}
			return pear;
		}	
}
