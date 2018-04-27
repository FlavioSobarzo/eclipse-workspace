package Capitulo8;

public class areFactors {
	
	public static boolean areFactors(int n, int[] numeros){
	      for (int factor:numeros){
	         if (n % factor != 0)
	            return false;
	      }
	      return true;
	   }
}
