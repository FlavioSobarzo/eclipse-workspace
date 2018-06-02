/*Se acerco el celular al totem
<<Esta vitrina tiene al Tiburon Blanco
Este animal marino vive aprox 50 años
Vive en Aguas cálidas y templadas de casi todos los océanos
La longitud más frecuente entre los tiburones blancos adultos es de 5 a 7,5 m (siendo los machos menores que las hembras)
Y se alimenta normalmente de manta rayas y otros tiburones>>
Se codifico el codigo QR
<<Esta vitrina tiene al ostra
Este animal marino vive aprox b
Vive en c
d
Y se alimenta normalmente de e>>
*/
package Pregunta1;

public class Wrapper {
	
	private static Pez tiburonBlanco;
	private static Molusco ostra;
	private static Vitrina vOne;
	private static Vitrina vTwo;
	private static Totem tOne;
	private static Totem tTwo;
	private static Smartphone sOne;
	
	public static void main(String[] args) {
	
		tiburonBlanco = new Pez("Tiburon Blanco", "50 años", "Aguas cálidas y templadas de casi todos los océanos", "La longitud más frecuente entre los tiburones blancos adultos es de 5 a 7,5 m (siendo los machos menores que las hembras)", "manta rayas y otros tiburones", 1);
		ostra = new Molusco("ostra", "b","c","d","e",2);
		vOne = new Vitrina("Tiburon Blanco", 1, tiburonBlanco);
		vTwo = new Vitrina("Ostra", 2, ostra);
		tOne = new Totem(1, vOne);
		tTwo = new Totem(2, vTwo);
		sOne = new Smartphone(1);
		
		sOne.acercarCelularNFC(tOne, sOne);
		sOne.verCodigoQR(tTwo, sOne);
	}

}
