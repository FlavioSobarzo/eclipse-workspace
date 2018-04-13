
public class respuesta {

	public static void main(String[] args) {
		int i = 1;
		double d = 0.1;
		String s = "Hola";
		char c = 'c';
		boolean b = true;
		
		////////////////////////   9.1.2   //////////////////////////////////////
		System.out.println("9.2 int con double " + (i+d)); // Resultado double (adicion)
		System.out.println("9.2 int con String " + (i+s)); // Resultado String (concadenacion)
		System.out.println("9.2 int con char " + (i+c)); // Resultado int (adicion)
		// System.out.println("9.2 int con boolean " + (i+b)); //Invalido
		System.out.println("9.2 double con String " + (d+s)); //Resultado String (concadenacion)
		System.out.println("9.2 double con char " + (d+c)); //Resultado double (adicion)
		// System.out.println("9.2 double con boolean " + (d+b)); //Invalido 
		System.out.println("9.2 String con char " + (s+c)); //Resultado String (concadenacion)
		System.out.println("9.2 String con boolean " + (s+b)); //Resultado String (concadenacion)
		// System.out.println("9.2 char con boolean " + (c+b)); //Invalido

		
		
		//////////////////////   9.1.4   //////////////////////
		c = c++;
		System.out.println("9.4 char++ " + c);
		c = 'c';
		
		
		
		/////////////////////// 9.1.5 ///////////////////
		// i = "" + i; //Invalido
		// d = "" + d; //Invalido
		s = "" + s;
		// c = "" + c; //Invalido
		// b = "" + b; //Invalido
		
	}

}
