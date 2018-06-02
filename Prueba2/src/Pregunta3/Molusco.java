package Pregunta3;

public class Molusco extends Especie{

	public Molusco(String especie,String añosDeVida,String habitat,String datosInteresantes, String alimentacion, int vitrinaUbicado) {
		super(especie, añosDeVida, habitat, datosInteresantes, alimentacion, vitrinaUbicado);
	}
	
	public void ActividadConElAnimal(){
		System.out.print(" puedes comer los moluscos que cultivamos en nuestro restaurante");
	}
}
