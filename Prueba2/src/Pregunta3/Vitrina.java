package Pregunta3;

public class Vitrina {
	
	private int id;
	private Especie especie;
	private int coordenadasX;
	private int coordenadasY;
	private int puntos;
	
	public Vitrina(int id, Especie especie, int x, int y, int puntos) {
		this.id = id;
		this.especie = especie;
		this.coordenadasX = x; 
		this.coordenadasY = y;
		this.puntos = puntos;
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
	
	public void darPuntos(Smartphone sp) {
		if(sp.getJuegoDeRutaActivado() == true) {
			sp.SumarAlPuntaje(this.puntos);
			sp.mostrarPuntaje();
		}
	}

}
