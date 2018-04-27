package Capitulo6;

import java.util.Scanner;

public class Divisible {

	public static void main(String args[]){
		 Scanner in = new Scanner(System.in);
		   System.out.println("inglesa un numero y despues el numero que crees que es divisible");
		   int n = in.nextInt();
		   int m = in.nextInt();
		   System.out.println(Divisible(n,m));
	}
	
	  public static boolean Divisible(int n, int m){
	      return (m != 0 && n % m == 0);
	   }
}
