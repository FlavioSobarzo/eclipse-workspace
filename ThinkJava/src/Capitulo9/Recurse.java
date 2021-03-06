package Capitulo9;
import java.util.Scanner;

public class Recurse {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe una frase");
		String frase = in.nextLine();
		System.out.println("Escribe una segunda frase");
		String frase2 = in.nextLine();
		
		System.out.println("Primera letra " + first(frase));
		System.out.println("Todo menos primera letra " + rest(frase));
		System.out.println("Todos menos la primera y ultima letra " + middle(frase));
		System.out.println("Cantidad de letras " + length(frase));
		printString(frase);
		printBackward(frase);
		System.out.println("frase dada vuelta " + reverseString(frase));
		System.out.println("Es palidrome " + isPalindrome(frase));
		System.out.println("Es abecedarian " + isAbecedarian(frase));
		System.out.println("Es doubloon " + isDoubloon(frase));
		System.out.println("son Anagram " + areAnagram(frase,frase2));
	}
	/**
	* Returns the first character of the given String.
	*/
	public static char first(String s) {
	return s.charAt(0);
	}
	/**
	* Returns all but the first letter of the given String.
	*/
	public static String rest(String s) {
	return s.substring(1);
	}
	/**
	* Returns all but the first and last letter of the String.
	*/
	public static String middle(String s) {
	return s.substring(1, s.length() - 1);
	}
	/**
	* Returns the length of the given String.
	*/
	public static int length(String s) {
	return s.length();
	}
	////////////////////////////// 9.4 ////////////////////////////
	public static void printString(String s) {
		for(int i = 0; i < length(s); i = i + 1){
		System.out.println(s.charAt(i));
		}
		}
	 
	public static void printBackward(String s) {
		for(int i = length(s)-1; i >= 0; i = i - 1){
		System.out.println(s.charAt(i));
		}
		}
	public static String reverseString(String s) {
		String guardarS = "";
		char caracter;
		for(int i = 0; i < length(s); i = i + 1){
			caracter = s.charAt(length(s)-1-i);
			guardarS = guardarS + caracter;
			}
		return guardarS;
		}
	
	public static boolean isPalindrome(String s) {
		String sDadaVuelta = reverseString(s);
		for(int i = 0; i < length(s); i = i + 1){
			if(s.charAt(i) != sDadaVuelta.charAt(i)) {
				return false;
			}
			}
		return true;
		}
	////////////////////////////////////// 9.5 //////////////////////////////////
	 public static boolean isAbecedarian(String s) {
			for(int i = 0; i < length(s); i = i + 1){
				char letra = s.charAt(i);
				int numeroLetra = letra;
				char letraSig ='a';
				int numeroLetraSig = 0;
				if(i == length(s)-1) {
				letraSig = s.charAt(i);
				numeroLetraSig = letraSig;
				}
				else {
				letraSig = s.charAt(i+1);
				numeroLetraSig = letraSig;
				}
				if(letra >=97 && letra <= 122) {
					if(numeroLetraSig < numeroLetra) {
					return false;
					}
				}
				else {
					return false;
				}
				}
			return true;
			}
	 ///////////////////////////// 9.6 /////////////////////////////////////////////
	 public static boolean isDoubloon(String s) {
		 for(int i = 0; i < length(s); i = i + 1){
		    if (Contar(s, s.charAt(i)) != 2) {
		        return false;
		    }
		 }
		 return true;
	 }
	 
	 public static int Contar(String frase, char entrada) {
			int count = 0;
			for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (c == entrada) {
			count++;
			}
			}
			return count;
		}
	 
	/////////////////////////// 9.7 //////////////////////////////////
	 public static boolean areAnagram(String s1, String s2) {
		if(length(s1) == length(s2)) {
		 for(int i = 0; i < length(s1); i = i + 1){
           if(Contar(s1,s1.charAt(i)) != Contar(s2,s1.charAt(i))) { // uso metodo que cree en el ejercicio 9.6
        	   return false;
           }
		 }
		}
		else {
			return false;
		}
		return true;
	 }
	 
	 ///////////////////////////////// 9.8 /////////////////////////
	 
	 public static boolean canSpell(String set, String test) {
			 for(int i = 0; i < length(test); i = i + 1){
	           if(Contar(test,test.charAt(i)) > Contar(set,set.charAt(i))) { // uso metodo que cree en el ejercicio 9.6
	        	//si la cantidad de letras que necesito parta formar la palabra test son mas de las que tengo en mi set
	            //no se puede formar la palabra 
	        	   return false;
	           }
			 }
			return true; 
		 }
}
