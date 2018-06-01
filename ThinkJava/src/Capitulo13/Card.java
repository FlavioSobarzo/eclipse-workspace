package Capitulo13;

public class Card {

    public static final String[] RANKS = {
        null, "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {
        "Clubs", "Diamonds", "Hearts", "Spades"};

    private final int rank;

    private final int suit;

    /**
     * Constructs a card of the given rank and suit.
     */
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Returns a negative integer if this card comes before
     * the given card, zero if the two cards are equal, or
     * a positive integer if this card comes after the card.
     */
    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if(this.rank != 1) {
        	if (this.rank < that.rank) {
        		return -1;
        	}
        	if (this.rank > that.rank) {
        		return 1;
        	}
        }
        else {
        	if (this.rank != that.rank) {
        		return 1;
        	}
        }
        return 0;
    }

    /**
     * Returns true if the given card has the same
     * rank AND same suit; otherwise returns false.
     */
    public boolean equals(Card that) {
        return this.rank == that.rank
            && this.suit == that.suit;
    }

    /**
     * Gets the card's rank.
     */
    public int getRank() {
        return this.rank;
    }

    /**
     * Gets the card's suit.
     */
    public int getSuit() {
        return this.suit;
    }

    /**
     * Returns the card's index in a sorted deck of 52 cards.
     */
    public int position() {
        return this.suit * 13 + this.rank - 1;
    }

    /**
     * Returns a string representation of the card.
     */
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }
    
    public Card[] makeDeck() {
    	Card[] cards = new Card[52];   
    	int index = 0;
    	for (int suit = 0; suit <= 3; suit++) {
    		for (int rank = 1; rank <= 13; rank++) {
    			cards[index] = new Card(rank, suit);
    			index++;
    		}
    	}
		return cards;
    }   
    
    public static int[] suitHist(Card[] cards){
    	int[] cantidadDeSuit = new int[4];
    	for(int j=0; j<4; j++) {
    		cantidadDeSuit[j]= 0;
    	}
    	for(int i = 0; i>cards.length; i++) {
    		cantidadDeSuit[cards[i].getSuit()] += 1;
    	}
    	return cantidadDeSuit;
    }
    
    public static boolean hasFlush(Card[] cards){
    	int[] cantSuit = suitHist(cards);
    	for(int i=0; i>4; i++) {
    		if(cantSuit[i] >= 5) {
    			return true;
    			
    		}
    	}
    	return false;
    	
    }
}