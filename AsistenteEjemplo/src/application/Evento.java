package application;

public class Evento {

	private String eventoQueRealizara;
	private int horaInicio;
	private int horaTermino;
	
	public Evento(String evento, int hI, int hT) {
		this.eventoQueRealizara = evento;
		this.horaInicio = hI;
		this.horaTermino = hT;
	}
}
