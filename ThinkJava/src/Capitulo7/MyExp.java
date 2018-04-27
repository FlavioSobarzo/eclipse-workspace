package Capitulo7;

public class MyExp {

	public static void main(String[] args) {
		
	}
	
	public static double myexp(double d, int n){
	      double numero = 1;
	      double x = 1;
	      double y = 1;
	      
	      for (int i=1;i<n;i++){
	    	  numero += (x*=d)/(y*=i);
	      } 
	      
	      return numero;
	   }

	   public static void check(double d){
	      int x = 28;
	       double intervalo = 0;
	       do{
	          x++;
	          intervalo = Math.abs(myexp(d,x) - Math.exp(d));
	          System.out.println(x+"\t"+intervalo);
	       }
	     while (intervalo > 0.000000000001);
	      
	   }
}
