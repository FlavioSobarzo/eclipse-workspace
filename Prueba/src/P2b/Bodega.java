package P2b;

import java.util.Scanner;

public class Bodega {
	
	private static Scanner in;
	private Pila[] pilas;
	
	public Bodega(int cantidadPilas) {
		
		  in = new Scanner(System.in);
	      pilas = new Pila[cantidadPilas];
	      for (int i = 0; i < pilas.length; i++) {
	    	  System.out.println("Ingrese la cantidad de Pallets que trendra su pila numero "  + (i+1));
		      int pallets = in.nextInt();
	    	  pilas[i] = new Pila(pallets);
		  }
	   }
}
