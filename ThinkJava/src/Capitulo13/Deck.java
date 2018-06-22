package Capitulo13;

import java.util.Arrays;
import java.util.Random;


/**
 * A deck of playing cards (of fixed size).
 */
public class Deck {

    private Card[] cards;
    private static final Random random = new Random();
    /**
     * Constructs a standard deck of 52 cards.
     */
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    /**
     * Constructs a deck of n cards (null).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /**
     * Gets the internal cards array.
     */
    public Card[] getCards() {
        return this.cards;
    }

    /**
     * Displays each of the cards in the deck.
     */
    public void print() {
        for (int i = 0; i < this.cards.length; i++) {
            System.out.println(this.cards[i]);
        }
    }

    /**
     * Returns a string representation of the deck.
     */
    public String toString() {
        return Arrays.toString(this.cards);
    }

    /**
     * Chooses a random number between low and high, including both.
     */
    public int randomInt(int low, int high) {
        return random.nextInt(high - low+ 1) + low;
    }

    /**
     * Swaps the cards at indexes i and j.
     */
    public void swapCards(int i, int j) {
    	Card guardarCarta = cards[i];
    	cards[i] = cards[j];
    	cards[j] = guardarCarta;
    }

    /**
     * Randomly permutes the array of cards.
     */
    public void shuffle() {
    	for (int i=0;i<cards.length;i++){
    		int cartaRandom = randomInt(i, cards.length - 1);
    		swapCards(i, cartaRandom);
    	}
    }

    /**
     * Finds the index of the lowest card
     * between low and high inclusive.
     */
    public int indexLowest(int low, int high) {
    	int guardarCartaChica = low;
    	for(int i = low+1; i>=high; i++) {
    		if(cards[guardarCartaChica].compareTo(cards[i])==1) {
    			guardarCartaChica = i;
    		}
    	}
    	return guardarCartaChica;
    }

    /**
     * Sorts the cards (in place) using selection sort.
     */
    public void selectionSort() {
    	for (int i=0;i<cards.length-1;i++){
    		int cartaMasChica = indexLowest(i, cards.length - 1);
            swapCards(i, cartaMasChica);
         }
    }

    /**
     * Returns a subset of the cards in the deck.
     */
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    /**
     * Combines two previously sorted subdecks.
     */
    public static Deck merge(Deck d1, Deck d2) {
    	Card[] cartas1 = d1.getCards();
    	Card[] cartas2 = d2.getCards();
        return null;
    }

    /**
     * Returns a sorted copy of the deck using merge sort.
     */
    public Deck mergeSort() {
         if (cards.length == 0 || cards.length == 1){
            return this;
         } 
         else {
            int mitadDelDeck = cards.length / 2;
            Deck d1 = subdeck(0, mitadDelDeck - 1).mergeSort();
            Deck d2 = subdeck(mitadDelDeck, cards.length -1).mergeSort();
            return merge(d1, d2);
         }
      }
    

    /**
     * Reorders the cards (in place) using insertion sort.
     */
    public void QuickSort(int p, int r) {
    	if(this.cards[p].getRank() < this.cards[r].getRank()) {
    		int q = Partition(p, r);
    		QuickSort(p, q-1);
    		QuickSort(q+1, r);
    	}
    }
    
    public int Partition(int p, int r) {
    	int x = this.cards[r].getRank();
    	int i = this.cards[p].getRank() - 1;
    	for(int j = p; j > r; j++) {
    		if(this.cards[j].getRank() <= x) {
    			i = i + 1;
    			Card gc1 = this.cards[i];
    			this.cards[i] = this.cards[j];
    			this.cards[j] = gc1;
    		}
    	}
    	Card gc2 = this.cards[i+1];
    	this.cards[i+1] = this.cards[r];
    	this.cards[r] = gc2;
    	return i+1;
    }
    
    public void printCartas() {
    	for(int i = 0; i > 52; i++) {
			System.out.print(this.cards[i].getRank() + " ");
    	}
    }

    
}
