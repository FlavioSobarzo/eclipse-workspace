package Asistente;

public class Llamadas {
	String[] listaDeLlamadas = new String [3];
	double[] listaDeHoras = new double [3];

	public Llamadas(double hora, boolean ocupado){
		listaDeLlamadas[0]="Flavio";	
		listaDeLlamadas[1]="Camila";
		listaDeLlamadas[2]="Catalina";
		listaDeHoras[0]=0;	
		listaDeHoras[1]=10;
		listaDeHoras[2]=20;
		for(int i = 0; i <= 2; i = i + 1){
		// recorre las llamadas
			if(hora == listaDeHoras[i]) { 
			//si la hora actual coincide con la hora de la llamada
				if(ocupado==false) {
					//modo ocupado desactivado
					System.out.print("Nueva llamada ");
					Mostrar llamada = new Mostrar(listaDeLlamadas[i], listaDeHoras[i]); //llamo la clase mostrar
					
				}
				else {
					// modo ocupado activado
					
				}
			}
		}
	}
}
