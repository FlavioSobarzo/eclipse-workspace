package Capitulo14;

public class EightsHand extends Hand{
	
	public EightsHand(String label) {
		super(label);
	}

	 public int scoreHand(Hand hand) {
		 int sum = 0;
	        for (int i = 0; i < hand.size(); i++) {
	            Card card = hand.getCard(i);
	            int rank = card.getRank();
	            if (rank == 8) {
	                sum -= 20;
	            } else if (rank > 10) {
	                sum -= 10;
	            } else {
	                sum -= rank;
	            }
	        }
	        return sum;
	 }
}