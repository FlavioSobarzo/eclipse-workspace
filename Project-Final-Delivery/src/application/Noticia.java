package application;

public class Noticia {

	private String titulo;
	private String encabezado;
	private int hora;
	private int minuto;
	private int seg;
	private int dia;
	private int mes;
	private int año;
	
	public Noticia(String titulo, String encabezado, int hora, int minuto, int seg, int dia, int mes, int año) {
		this.titulo = titulo;
		this.encabezado = encabezado;
		this.hora = hora;
		this.minuto = minuto;
		this.seg = seg;
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	
	public int getHora() {
		return this.hora;
	}
	
	public int getMin() {
		return this.minuto;
	}
	
	public int getSeg() {
		return this.seg;
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public int getAño() {
		return this.año;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getEncabezado() {
		return this.encabezado;
	}
}
