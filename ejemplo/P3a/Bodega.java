package P3a;

import java.util.Scanner;

public class Bodega {

	private static Scanner in;
    private static String[] pila1 = new String[7];
    private static String[] pila2 = new String[7];
    private static String[] pila3 = new String[7];
    private static String[] pila4 = new String[7];
    private static String[] pila5 = new String[7];
    private static String[] pila6 = new String[7];
    private static String[] pila7 = new String[7];
    private static double[][] coordenadas = new double[7][2];
    
    public static void main(String[] args) {
		in = new Scanner(System.in);
		for(int i = 0; i < pila1.length; i = i + 1){
			 pila1[i] = "";
			 pila2[i] = "";
			 pila3[i] = "";
			 pila4[i] = "";
			 pila5[i] = "";
			 pila6[i] = "";
			 pila7[i] = "";
			 for(int j = 0; j < coordenadas.length; j = j + 1){
				 double Xaleatorio = Math.random()*10;
				 double Yaleatorio = Math.random()*10;
				 
					 
		}
		while(true) {
			System.out.println("Si quieres agregar un pallet presiona 0, si quieres eliminar uno presiona 1");
			int PushOrPop = in.nextInt();
			if(PushOrPop == 0) {
				PilaPushBodega agregar = new PilaPushBodega(pila1);
			}
			else if(PushOrPop == 1) {
				PilaPopBodega eliminar = new PilaPopBodega(pila1);
			}
			else {
				System.out.println("El caracter que escribio no corresponde");
			}
		}
	}

	