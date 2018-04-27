package Capitulo5;

public class FermatsTheorem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkFermat(3,4,5,2);
		checkFermat(6,6,20,3);
	}
	public static void checkFermat(int a, int b, int c, int n){
		if(Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
	      System.out.println("La teoria es cierta ");
		}
		if(Math.pow(a, n) + Math.pow(b, n) != Math.pow(c, n)) {
		  System.out.println("La teoria es falsa ");
		}
		if(a <= 2 || b <= 2 || c <= 2) {
			  System.out.println("Ingesaste numeros incorrectos ");
			}
	}
}
