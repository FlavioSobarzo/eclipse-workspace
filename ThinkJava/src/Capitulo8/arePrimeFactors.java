package Capitulo8;

public class arePrimeFactors {
	   
	   public static boolean arePrimeFactors(int n, int[] a){
	      int sonPrimos = 1;
	      for (int element:a){
	         if (Primo(element)){
	        	 sonPrimos *= element;
	         } 
	         else {
	            return false;
	         }
	      }
	      if (sonPrimos == n){
	         return true;
	      } 
	      else {
	         return false;
	      }
	   }
	   
		public static boolean Primo(int n){
		      if (n < 2){
		         return false;
		      } 
		      else if (n > 2){
		         if (n % 2 == 0){
		            return false;
		         }
		         for (int i = 3;i<=(int)Math.sqrt(n);i+=2){
		            if (n % i !=0){
		               return false;
		            }
		         }
		      
		      }
		      return true;
		   }

}
