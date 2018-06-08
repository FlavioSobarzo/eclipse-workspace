package application;

public class Noticia {

	private String titulo;
	private String encabezado;
	private int hora;
	
	public Noticia(String titulo, String encabezado, int hora) {
		this.titulo = titulo;
		this.encabezado = encabezado;
		this.hora = hora;
	}
	
	public int getHora() {
		return this.hora;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getEncabezado() {
		return this.encabezado;
	}
}
