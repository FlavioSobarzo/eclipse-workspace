package Asistente;

public class Noticias {
	String[] listaDeNoticias = new String [3];
	double[] listaDeHoras = new double [3];
	
	public Noticias(double hora, boolean ocupado){
		listaDeNoticias[0]="Fin del mundo";	
		listaDeNoticias[1]="Guerra mundial";
		listaDeNoticias[2]="Meteorito";
		listaDeHoras[0]=5;	
		listaDeHoras[1]=15;
		listaDeHoras[2]=24;
		
		for(int i = 0; i <= 2; i = i + 1){ 
		//recorro todas las noticias
			if(hora == listaDeHoras[i]) { 
		    //si el tiempo actual es igual a la hora cuando sale la notica 
				if(ocupado==false) {
			    //si el modo ocupado esta desactivado
				 System.out.print("Nueva noticia ");
				 Mostrar noticia = new Mostrar(listaDeNoticias[i], listaDeHoras[i]); //llamo a la clase Mostrar
				
				}
				else {
					//Cuando modo ocupado activado
					
				}
			}
		}
	}
}


