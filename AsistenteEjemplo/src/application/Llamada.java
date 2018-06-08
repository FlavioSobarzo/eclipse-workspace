package application;

public class Llamada {
	
	private String contacto;
	private int numero;
	private int hora;
	
	public Llamada(String contacto, int numero, int hora) {
		this.contacto = contacto;
		this.numero = numero;
		this.hora = hora;
	}

	public int getHora() {
		return this.hora;
	}
	
	public String getContacto() {
		return this.contacto;
	}
	
	public int getNumero() {
		return this.numero;
	}
}
