package Capitulo7;

public class Gauss {

	public static void main(String[] args) {
		
	}

	 public static double gauss(double d, int n){
	      double numero = 1;
	      int x = 1;
	      double y = 1;
	      int z = 1;
	      
	      for (int i=1;i<n;i++){
	         numero += (z*=-1)*(y*=d*d)/(x*=i);
	      }
	      
	      return numero;
	  }
}
