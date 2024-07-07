package Tests;

import main.Deck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void getCardsShouldReturnACollectionOfSizeFiftyTwo() {
        Deck deck = new Deck();
        assertEquals(52, deck.getCards().size());
    }
}