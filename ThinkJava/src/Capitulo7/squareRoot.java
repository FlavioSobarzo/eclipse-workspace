package Capitulo7;

public class squareRoot {

	public static void main(String[] args) {
		System.out.println(squareRoot(49));
		}

	public static double squareRoot(double d){
		  double guardarNumero = d/2;
	      double numero = d/2;
	      double interval = 0;
	      do{
	    	  guardarNumero = numero;
	    	  numero = (guardarNumero + d/guardarNumero)/2;
	         interval = Math.abs(numero - guardarNumero);
	         System.out.println(interval);
	      }
	      while(interval > 0.001);
	      return numero;
	   }
}

