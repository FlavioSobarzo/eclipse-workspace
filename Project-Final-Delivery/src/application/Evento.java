package application;

public class Evento {

	private String asunto;
	private int horaInicio;
	private int minInicio;
	private int horaTermino;
	private int minTermino;
	private int dia;
	private int mes;
	private int año;
	
	public Evento(String asunto, int hI, int mI,  int hT, int mT, int dia, int mes, int año) {
		this.asunto = asunto;
		this.horaInicio = hI;
		this.minInicio = mI;
		this.horaTermino = hT;
		this.minTermino = mT;
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	
	public int getHoraInicio() {
		return this.horaInicio;
	}
	
	public int getHoraTermino() {
		return this.horaTermino;
	}
	
	public int getMinI() {
		return this.minInicio;
	}
	
	public int getMinT() {
		return this.minTermino;
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
	
	public String getAsunto() {
		return this.asunto;
	}
}
