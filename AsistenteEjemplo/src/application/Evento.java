package application;

public class Evento {

	private String asunto;
	private int horaInicio;
	private int horaTermino;
	
	public Evento(String asunto, int hI, int hT) {
		this.asunto = asunto;
		this.horaInicio = hI;
		this.horaTermino = hT;
	}
	
	public int getHoraInicio() {
		return this.horaInicio;
	}
	
	public int getHoraTermino() {
		return this.horaTermino;
	}
	
	public String getAsunto() {
		return this.asunto;
	}
}
