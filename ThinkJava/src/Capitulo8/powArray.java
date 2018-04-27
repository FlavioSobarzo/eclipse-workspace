package Capitulo8;

public class powArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static double[] powArray(double[] a, double elevado){
		  double[] acumula = new double[a.length];
		  
	      for (int i=0;i<a.length;i++){
	    	  acumula[i] = Math.pow(a[i], elevado);
	      }
	      return acumula;
	 }
	 public static int[] histogram(int[] a, int contador){
		      int[] guardar = new int[contador];
		      
		      for (int element:a){
		    	  guardar[element]++;
		      }
		      
		      return guardar;
		   
	 }
}