package application;

public class Llamada {
	
	private String contacto;
	private int numero;
	private int hora;
	private int minuto;
	private int seg;
	private int dia;
	private int mes;
	private int año;
	
	public Llamada(String contacto, int numero, int hora, int minuto, int seg, int dia, int mes, int año) {
		this.contacto = contacto;
		this.numero = numero;
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
	
	public String getContacto() {
		return this.contacto;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	
}
