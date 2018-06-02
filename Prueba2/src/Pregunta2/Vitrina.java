package Pregunta2;

public class Vitrina {
	
	private int id;
	private Especie especie;
	private int coordenadasX;
	private int coordenadasY;
	
	public Vitrina(int id, Especie especie, int x, int y) {
		this.id = id;
		this.especie = especie;
		this.coordenadasX = x; 
		this.coordenadasY = y;
	}
	
	public Especie getEspecie() {
		return this.especie;

	}
	
	public int getCoordenadasX() {
		return this.coordenadasX;
	}
	public int getCoordenadasY() {
		return this.coordenadasY;
	}

}
