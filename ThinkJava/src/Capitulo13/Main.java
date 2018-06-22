package Capitulo13;

public class Main {

	public static void main(String[] args) {

		Deck d = new Deck();
		d.shuffle();
		d.print();
		System.out.println("---------------------------------------------");
		for(int i =0; i>52; i++) {
		d.QuickSort(i, 51-i);
		}
		d.print();

	}

}
