package Pregunta3;

public class Smartphone {
	
	private int id; 
	private int coordenadasX;
	private int coordenadasY;
	private boolean juegoDeRutaActivado = false;
	private int puntaje = 0;
	
	public Smartphone(int id, int x, int y) {
		this.id = id;
		this.coordenadasX = x;
		this.coordenadasY = y;
	}

	public int getCoordenadasX() {
		return this.coordenadasX;
	}
	public int getCoordenadasY() {
		return this.coordenadasY;
	}
	

	public void audioActivado(Vitrina v) {
		Especie especie = v.getEspecie();
		System.out.println("<<Esta vitrina tiene al " + especie.getEspecie());
		System.out.println("Este animal marino vive aprox " + especie.getAñosDeVida());
		System.out.println("Vive en " + especie.getHabitat());
		System.out.println(especie.getDatosInteresantes());
		System.out.println("Y se alimenta normalmente de " + especie.getAlimentacion());
		especie.ActividadConElAnimal();
		System.out.println(">>");

	}
	public void setCoordenadas(int x, int y) {
		this.coordenadasX = x;
		this.coordenadasY = y;
	}
	
	public void CrearRuta(Vitrina[] v) {
		//Esta funcion tomara las cordenadas de todas las vitrinas 
		//y las comparara con las cordenadas del celular para crear una ruta
		//retornara un aviso en la consolo diciendo el orden de visita de las vitrinas
		//y como llega
		juegoDeRutaActivado = true;
	}
	
	public boolean getJuegoDeRutaActivado() {
		return this.juegoDeRutaActivado;
	}
	
	public void SumarAlPuntaje(int n) {
		this.puntaje += n;
	}
	
	public void mostrarPuntaje() {
		System.out.println("Tu puntaje es de " + this.puntaje);
	}
	
}
