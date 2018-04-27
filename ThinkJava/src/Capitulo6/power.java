package Capitulo6;

public class power {
	
	public static void main(String[] args) {
		System.out.println(power(2.0 ,1 ));
		}

	public static double power(double d, int n){
	      if (d == 0){
	         if (n == 0){
	            return 1;
	         } 
	         else {
	            return 0;
	         }
	      }
	      else {
	         if (n == 1){
	            return d;
	         } 
	         else if (n == 2){
	            return d*d;
	         } 
	         else {
	            if (n % 2 == 0){
	               return power(power(d,n/2),2);
	            } 
	            else {
	               return d*power(d,n-1);
	            }
	         }
	      }
	   }
}
