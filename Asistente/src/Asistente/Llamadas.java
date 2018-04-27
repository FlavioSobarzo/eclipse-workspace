package Asistente;

import javax.swing.JFrame;

public class Llamadas {
	String[] listaDeLlamadas = new String [3];
	double[] listaDeHoras = new double [3];

	String todasLasLlamadasGuardadas = "";

	public Llamadas(double hora, boolean ocupado, JFrame frame, String[] GuardarLlamada){
		listaDeLlamadas[0]="Flavio";	
		listaDeLlamadas[1]="Camila";
		listaDeLlamadas[2]="Catalina";
		listaDeHoras[0]=0;	
		listaDeHoras[1]=20;
		listaDeHoras[2]=40;

		for(int j = 0; j < GuardarLlamada.length; j = j + 1){ 
			if(GuardarLlamada[j] != "") {
				todasLasLlamadasGuardadas = todasLasLlamadasGuardadas + " " + GuardarLlamada[j] + ",";
			}
		}
		if(todasLasLlamadasGuardadas != "" && ocupado == false) {
		System.out.print("Llamadas guardadas:" + todasLasLlamadasGuardadas);
		Mostrar llamada = new Mostrar(todasLasLlamadasGuardadas, -1, frame,2);
		todasLasLlamadasGuardadas = "";
		}
			
		
			for(int i = 0; i <= 2; i = i + 1){
				// recorre las llamadas
				if(hora == listaDeHoras[i]) { 
					//si la hora actual coincide con la hora de la llamada
					if(ocupado==false) {
						for(int j = 0; j < 20; j = j + 1){
							GuardarLlamada[j] = "";
						}
					//modo ocupado desactivado
						System.out.println("Nueva llamada");
						Mostrar llamada = new Mostrar(listaDeLlamadas[i], listaDeHoras[i], frame,0); //llamo la clase mostrar
					
					}
					if(ocupado==true) {
						for(int j = 0; j < 20; j = j + 1){
							if(GuardarLlamada[j] == "") {
								GuardarLlamada[j] = listaDeLlamadas[i];	
								System.out.println("Se guardo " + GuardarLlamada[j]);
								break;
								}
						}
					}
				}
			}
		
	}
}
