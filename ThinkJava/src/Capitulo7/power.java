package Capitulo7;

public class power {
	public static void main(String[] args) {
		System.out.println(power(2.0 ,1 ));
		}
	
	public static double power(double d, int n){
	      double numero = 1;
	      
	      for (int i = 0; i < n; i++){
	    	  numero *= d;
	      }
	      
	      return numero;
	   }
}
