package Capitulo6;

import java.util.Scanner;

public class Triangulo {
	
	public static void main(String args[]){
		 Scanner in = new Scanner(System.in);
		   System.out.println("3longitudes para ver si se forma un triangulo");
		   int l1 = in.nextInt();
		   int l2 = in.nextInt();
		   int l3 = in.nextInt();
		   System.out.println(triangulo(l1,l2,l3));
	}
	
	public static boolean triangulo(int l1, int l2, int l3){
	      return (l1 > 0 && l2 > 0 && l3 > 0 && l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1);
	   }
}
