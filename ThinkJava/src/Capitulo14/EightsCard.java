package Capitulo14;

public class EightsCard extends Card{

	public EightsCard(int rank, int suit) {
	      super(rank, suit);
	   }
	
	 public boolean matches(EightsCard ec){
	      if (getSuit() == ec.getSuit()) {
	         return true;
	      }
	      if (getRank() == ec.getRank()) {
	         return true;
	      }
	      if (getRank() == 8) {
	         return true;
	      }
	      return false;
	   }
	 
	 public int score(){
	      int rank = getRank();
	      if (rank == 8) {
	         return -20;
	      } 
	      else if (rank > 10) {
	         return -10;
	      } 
	      else {
	         return -rank;
	      }
	   }
}
