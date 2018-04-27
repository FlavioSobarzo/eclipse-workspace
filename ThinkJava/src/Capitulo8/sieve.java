package Capitulo8;

public class sieve {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static boolean[] sieve(int n){
	      boolean[] esPrimo = new boolean[n];
	      
	      for (int i=2;i<n;i++)
	    	  esPrimo[i] = true;
	      
	      for (int i=2;i<=(int)Math.sqrt(n);i++){
	         if (esPrimo[i] == true){
	            for (int j = i*i;j < n;j += i){
	            	esPrimo[j] = false;
	            }
	         }
	      }
	      return esPrimo;
	   }
}
