import java.util.Scanner;
public class Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("¿Que numero quieres partir?");
		int N = in.nextInt();
		System.out.println(N);
		irRestando(N);
	}
	
	public static void irRestando(int n) {
		int GuardarN = n;
		if(n==1) {
			System.out.print(n);
		}
		else {
			n = n-1;
			System.out.print(n);
			System.out.println(GuardarN-n);
			irRestando(n);
			}
		
	

}
}
