import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Player> listOfPlayers;

    Game() {
        this.listOfPlayers  = new ArrayList<Player>();
    }

    public void run() {
        startGame();
       // playGame();
    }

    private void startGame() {
        Deck deck = new Deck();
        System.out.println(deck.getCards());
        deck.shuffleDeck();
        System.out.println(deck.getCards());
    }


    // run:
        //-  startGame()
            // -- buildDeck
            // -- shuffle Deck
            // -- deal deck


        // -- playGame()

    public void addPlayer(Player player) {
        listOfPlayers.add(player);
    }


}
