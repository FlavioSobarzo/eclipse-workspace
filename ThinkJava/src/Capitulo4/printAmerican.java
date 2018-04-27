package Capitulo4;

public class printAmerican {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dia = "Lunes", mes = "Mayo";
	      int fecha = 24, año = 2018;
	      printAmerican(dia, fecha, mes, año);
	      printEuropean(dia, fecha, mes, año);
	}
	
	  public static void printAmerican(String dia, int fecha, String mes, int año){
	      System.out.println("American format:");
	      System.out.println(dia + ", " + mes + " " + fecha + ", " + año);
	   }
	  
	  public static void printEuropean(String dia, int fecha, String mes, int año){
	      System.out.println("European format:");
	      System.out.println(dia + " " + fecha + " " + mes + " " + año);
	   }
}
