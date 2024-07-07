import java.util.Collections;
import java.util.Stack;

//an instance of a Deck object should build Deck. 
// contains a shuffle deck and deal cards method

public class Deck {
    Stack<Card> deckOfCards = new Stack<Card>();

    Deck() {
        buildDeck();
    }
    
    private void buildDeck() {
        for (Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                deckOfCards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(deckOfCards);
    }
    
    public Stack<Card> getCards() {
        return deckOfCards;
    }

    // deal: pop a card from the top of the card and return it


}
