package Pregunta3;

public class Especie {
	
	private String especie;
	private String añosDeVida;
	private String habitat;
	private String datosInteresantes;
	private String alimentacion;
	private int vitrinaUbicado;
	
	public Especie(String especie,String añosDeVida,String habitat,String datosInteresantes, String alimentacion, int vitrinaUbicado) {
		this.especie = especie;
		this.añosDeVida = añosDeVida;
		this.habitat = habitat;
		this.datosInteresantes = datosInteresantes;
		this.alimentacion = alimentacion;
		this.vitrinaUbicado = vitrinaUbicado;
		
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public String getAñosDeVida() {
		return this.añosDeVida;
	}
	public String getHabitat() {
		return this.habitat;
	}
	public String getDatosInteresantes() {
		return this.datosInteresantes;
	}
	public String getAlimentacion() {
		return this.alimentacion;
	}
	public void ActividadConElAnimal() {
		System.out.print("Puedes realizar actividades con estos animales,");
	}

}
