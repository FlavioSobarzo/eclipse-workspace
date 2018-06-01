package Capitulo11;


public class Tile {
	
	private char letter;
	private int value;
	
	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
		
	}

	public static void printTile(Tile t) {
		System.out.println("Posee la letra " + t.letter + " con el valor " + t.value);
	}

	public static void testTile() {
		Tile testTile = new Tile('z', 10);
		printTile(testTile);
	}
	
	public String toString(Tile[] t) {
		return String.format("La letra es %02d y el valor %02d\n",
		this.letter, this.value);
	}
	
	public boolean equals(Tile that) {
		return this.letter == that.letter
				&& this.value == that.value;
	}
	
	public char getLetter() {
		return this.letter;
	}
	
	public int getValeu() {
		return this.value;
	}
	
	public void setLetter(char l) {
		this.letter = l;
	}
	
	public void setValue(int v) {
		this.value = v;
	}
}
