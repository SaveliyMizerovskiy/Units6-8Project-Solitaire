import java.util.ArrayList;

public class Deck {
    ArrayList<Card> deck;
    // class of card objects
    public Deck(){
        deck = new ArrayList<Card>();
    }

    public void createDeck(){
        for (int i = 0; i < 13; i++) {
            deck.add(new Card(i, "Clubs"));
        }
        for (int i = 0; i < 13; i++) {
            deck.add(new Card(i, "Diamonds"));
        }
        for (int i = 0; i < 13; i++) {
            deck.add(new Card(i, "Hearts"));
        }
        for (int i = 0; i < 13; i++) {
            deck.add(new Card(i, "Spades"));
        }
    }
}
