package Capitulo6;

public class oddSum {

	public static void main(String[] args) {
		System.out.println(oddSum(7));
		}
	
	public static int oddSum(int n){
	      return ((n==1)?(1):(n*oddSum(n-2)));
	   }
}
