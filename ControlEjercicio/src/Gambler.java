import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vecesQueAcierta = 0;
		int vecesQueFalla = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("¿Cuanto es tu capital inicial?");
		int stake = in.nextInt();
		System.out.println("¿Cuanto es tu capital objetivo?");
		int goal = in.nextInt();
		System.out.println("¿Cuantos intentos quieres?");
		int trials = in.nextInt();
		
		for(int i = 1; i <= trials; i = i + 1){
			if(turno()) {
				stake = stake + 1;
				vecesQueAcierta = vecesQueAcierta +1;
			}
			else {
				stake = stake - 1;
				vecesQueFalla = vecesQueFalla +1;
			}
		}
		System.out.println("Acerto " + vecesQueAcierta + " y fallo " + vecesQueFalla + " de "+ trials + " intentos");
	}
	public static boolean turno() {
		double numeroAleatorio =  Math.random();
	       if(numeroAleatorio <= 0.5) {
	    	  return true;
	       }
	       else {
	    	   return false;
	       }
	    	  
	}

}
