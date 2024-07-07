package main;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private final String playerName;
    private double bet;
    private List<Card> playerHand;

    // Constructor: Take main.Player name and bet amount
    Player(String playerName, double bet) {
        this.playerName = playerName;
        this.bet = bet;
        this.playerHand = new ArrayList<Card>();
    }

    public String getPlayerName() {
        return playerName;
    }

    public List<Card> getPlayerHand() {
        return playerHand;
    }

    public double getBet() {
        return bet;
    }
}
