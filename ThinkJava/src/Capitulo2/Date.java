package Capitulo2;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dia = "viernes";
		int fecha = 13;
		String mes = "Mayo";
		int año = 2018;
		 System.out.println("Flavio format");
         System.out.println("Hoy es " + dia + " " + fecha + " de " + mes + " del " + año);
         System.out.println ("American format:");
         System.out.println (dia + ", " + mes + " " + fecha + ", " + año);
         System.out.println ("European Format:");
         System.out.println (dia+" "+fecha+" "+mes+", "+año);
	}

}
