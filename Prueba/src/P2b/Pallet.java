package P2b;

import java.util.Scanner;

public class Pallet {

	private static Scanner in;
    private static String[] pila = new String[20];
    
    public static void main(String[] args) {
		in = new Scanner(System.in);
		for(int i = 0; i < pila.length; i = i + 1){
			 pila[i] = "";  
		}
		while(true) {
			System.out.println("Si quieres agregar un pallet presiona 0, si quieres eliminar uno presiona 1");
			int PushOrPop = in.nextInt();
			if(PushOrPop == 0) {
				PilaPushPallet agregar = new PilaPushPallet(pila);
			}
			else if(PushOrPop == 1) {
				PilaPopPallet eliminar = new PilaPopPallet(pila);
			}
			else {
				System.out.println("El caracter que escribio no corresponde");
			}
		}
	}
}
