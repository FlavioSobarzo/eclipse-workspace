package Capitulo11;

public class Tile {
		
		   public static void main(String args[]){
			   
		   }
		   
		   private char letter;
		   private int value;
		   public Tile(char letter, int value){
		      this.letter = letter;
		      this.value = value;
		   }
		   
		   public static void printTile(Tile tile){
		      System.out.println("Un titulo con "+tile.letter+" y "+tile.value);
		   }
		   
		   public static Tile testTile(){
		      Tile tile = new Tile('Z',10);
		      printTile(tile);
		      return tile;
		   }
		   
		   public String toString(){
		      return "Un titulo con "+this.letter+" y "+this.value;
		   }

		
}
