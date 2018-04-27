package Capitulo8;

public class indexOfMax {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int indexOfMax(int[] n){
	      int guardar = 0;
	      
	      for (int i=1;i<n.length;i++){
	         if (n[i] > n[guardar]){
	        	 guardar = i;
	         }
	      }
	      return guardar;
	   }
}
