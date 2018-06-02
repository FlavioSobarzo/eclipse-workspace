package Pregunta1;

public class Totem {

	private int vitrinaAsignada;
	private boolean nfcActivado;
	private Vitrina vitrina;
	
	public Totem(int vitrinaAsignada, Vitrina vitrina) {
		this.vitrinaAsignada = vitrinaAsignada;
		this.vitrina = vitrina;
		this.nfcActivado = false;
	}
	
	public void audioFueActivado(Smartphone sp) {
			sp.audioActivado(this.vitrina);
	}
	
	public int getVitrinaAsignada() {
		return this.vitrinaAsignada;
	}
}
