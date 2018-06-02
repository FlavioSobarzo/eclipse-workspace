/*
 * Estas cerca de la vitrina de Delfin
Ingrese 1 para escuchar el audio y si no 0
1
<<Esta vitrina tiene al Delfin
Este animal marino vive aprox 60 años
Vive en aguas tropicales, sub-tropicales, y templadas-tibias
El cerebro de un delfín es superior al de un ser humano, no sólo en su tamaño en relación al resto del cuerpo, sino también por lo que a su estructura respecta
Y se alimenta normalmente de macarela
 puedes nadar con los peces en nuestro parque acuatico>>
Estas cerca de la vitrina de a
Ingrese 1 para escuchar el audio y si no 0
1
<<Esta vitrina tiene al a
Este animal marino vive aprox b
Vive en c
d
Y se alimenta normalmente de e
 puedes comer los moluscos que cultivamos en nuestro restaurante>>
Estas cerca de la vitrina de a
Ingrese 1 para escuchar el audio y si no 0
 */

package Pregunta2;

import java.util.Scanner;

public class Wrapper {
	
	private static Pez delfin;
	private static Molusco ostra;
	private static Vitrina[] vit = new Vitrina[2];
	private static Smartphone sOne;
	private static Scanner in;
	
	public static void main(String[] args) {
	
		in = new Scanner(System.in);
		delfin = new Pez("Delfin", "60 años", "aguas tropicales, sub-tropicales, y templadas-tibias", "El cerebro de un delfín es superior al de un ser humano, no sólo en su tamaño en relación al resto del cuerpo, sino también por lo que a su estructura respecta", "macarela", 1);
		ostra = new Molusco("a", "b","c","d","e",2);
		vit[0] = new Vitrina(1, delfin, 1, 1);
		vit[1] = new Vitrina(2, ostra, 1, 2);
		sOne = new Smartphone(1, 1, 1);
	
		while(true) {
			
			for(int i = 0; i < 2; i++) {
				if(sOne.getCoordenadasX() == vit[i].getCoordenadasX() && sOne.getCoordenadasY() == vit[i].getCoordenadasY()) {
					System.out.println("Estas cerca de la vitrina de " + vit[i].getEspecie().getEspecie());
					System.out.println("Ingrese 1 para escuchar el audio y si no 0");
					int N = in.nextInt();
					if(N==1) {
						sOne.audioActivado(vit[i]);

					}			
				}
			}
			sOne.setCoordenadas(1, 2);
		}
	}

}
