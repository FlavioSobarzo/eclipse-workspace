package Capitulo10;
import java.util.Scanner;
import java.math.BigInteger;

public class Big {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe una numero");
		int numero = in.nextInt();
		System.out.println("factorial: " + factorial(numero));
		
		for(int i = 1; i <= 30; i++) {
		System.out.println("El factorial de "+ i + " es " + factorial(i));
		}
		
		BigInteger small = BigInteger.valueOf(17);
		BigInteger big = BigInteger.valueOf(1700000000);
		BigInteger suma = small.add(big);
		BigInteger multiplicacion = small.multiply(big);
		BigInteger exponencial = big.pow(17);
		System.out.println(suma);
		System.out.println(multiplicacion);
		System.out.println(exponencial);
	}
	
	public static BigInteger factorial(int n) {
		BigInteger guardarN = BigInteger.valueOf(n); 
		for (int i = 1; i < n; i = i+1) {
			BigInteger guardarI = BigInteger.valueOf(i);
			guardarN = guardarN.multiply(guardarI);
		}
		return guardarN;
	}
	

     
	public static BigInteger pow(int x, int n) {
		BigInteger uno = BigInteger.valueOf(1);
		if (n == 0) return uno;
		// find x to the n/2 recursively
		BigInteger guardarX = BigInteger.valueOf(x);
		BigInteger t = guardarX.pow(n);
		// if n is even, the result is t squared
		// if n is odd, the result is t squared times x
		if (n % 2 == 0) {
		return t.multiply(t);
		} else {
		return (t.multiply(t)).multiply(guardarX);
		}
		}
}
