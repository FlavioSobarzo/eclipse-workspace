package Pregunta2;

public class Pez extends Especie{

	public Pez(String especie,String añosDeVida,String habitat,String datosInteresantes, String alimentacion, int vitrinaUbicado) {
		super(especie, añosDeVida, habitat, datosInteresantes, alimentacion, vitrinaUbicado);
	}
	
	public void ActividadConElAnimal() {
		System.out.print(" puedes nadar con los peces en nuestro parque acuatico");
	}
}
