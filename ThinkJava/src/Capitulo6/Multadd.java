package Capitulo6;

public class Multadd {

	public static void main(String args[]){
		   System.out.println(multadd(1.0,2.0,3.0));
		   System.out.println(multadd(0.5,Math.cos(Math.PI/4),Math.sin(Math.PI/4)));
		   System.out.println(Math.log(10)+multadd(2,Math.log(2),Math.log(5)));
	}
	
	  public static double multadd(double n1, double n2, double n3){
	      double numero = n1*n2+n3;
	      return numero;
	   }
	  
	  public static double expSum(double x){
		  double numero = multadd(x,Math.exp(-x),Math.sqrt(1-Math.exp(-x)));
	      return (numero);
	   }
}
