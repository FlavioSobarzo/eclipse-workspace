package Capitulo7;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
		
	}
	
	 public static int factorial(int n){
	      int numero = 1;
	      
	      for (int i=1;i<=n;i++){
	    	  numero *=i;
	      }
	      
	      return numero;
	   }
	 

}
