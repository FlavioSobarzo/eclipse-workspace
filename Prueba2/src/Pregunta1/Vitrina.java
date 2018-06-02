package Pregunta1;

public class Vitrina {
	
	private String especieQueContiene;
	private int id;
	private Especie especie;
	
	public Vitrina(String especieQueContiene, int id, Especie especie) {
		this.especieQueContiene = especieQueContiene;
		this.id = id;
		this.especie = especie;
	}
	
	public Especie getEspecie() {
		return this.especie;

	}

}
