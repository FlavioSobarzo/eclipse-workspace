package Pregunta1;

public class Smartphone {
	
	private int id; 
	
	public Smartphone(int id) {
		this.id = id;
	}
	
	public void acercarCelularNFC(Totem t, Smartphone sp) {
		System.out.println("Se acerco el celular al totem");
		t.audioFueActivado(sp);
	}
	
	public void verCodigoQR(Totem t, Smartphone sp) {
		System.out.println("Se codifico el codigo QR");
		t.audioFueActivado(sp);
	}
	
	public void audioActivado(Vitrina v) {
		Especie especie = v.getEspecie();
		System.out.println("<<Esta vitrina tiene al " + especie.getEspecie());
		System.out.println("Este animal marino vive aprox " + especie.getAñosDeVida());
		System.out.println("Vive en " + especie.getHabitat());
		System.out.println(especie.getDatosInteresantes());
		System.out.println("Y se alimenta normalmente de " + especie.getAlimentacion() + ">>");

	}
}
