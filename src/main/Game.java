package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private final List<Player> listOfPlayers;
    private final int numberOfPlayers;

    Game(int numberOfPlayers) {
        this.listOfPlayers  = new ArrayList<>();
        this.numberOfPlayers = numberOfPlayers;
    }

    public void run() {
        setup();
        startGame();
       // playGame();
    }

    public void setup() {

        System.out.println("============================================");
        System.out.println("            WELCOME TO BLACKJACK!           ");
        System.out.println("============================================");
        System.out.println("       Get ready to test your luck and      ");
        System.out.println("        strategy in the classic game of     ");
        System.out.println("                21!                         ");
        System.out.println("       Will you hit or stand? Double down   ");
        System.out.println("       or split? The dealer awaits!         ");
        System.out.println("       Good luck, and may the best hand win!");
        System.out.println("============================================");

        // get player names and bet amount
        Scanner scanner = new Scanner(System.in);
        String name;
        int count = 0;
        double betAmount;

        do {
            System.out.println("Enter player name: ");
            name = scanner.nextLine();

            System.out.println("Enter bet amount: ");
            while (!scanner.hasNextDouble()){
                System.out.println("Invalid amount. Please enter a valid number! ");
                scanner.next(); //consume the invalid input
                System.out.println("Enter bet amount: ");
            }
            betAmount = scanner.nextDouble();
            scanner.nextLine(); // consume the newline character left by nextDouble

            listOfPlayers.add(new Player(name, betAmount));
        }while (++count < numberOfPlayers );


    }

    private void startGame() {
        Deck deck = new Deck();
        System.out.println("Shuffling cards...");
        deck.shuffleDeck();

        System.out.println("Dealing cards...");
        for (Player player : listOfPlayers) {
            player.getPlayerHand().add(deck.dealCard());
            player.getPlayerHand().add(deck.dealCard());
        }

        System.out.println("Initial hand of all players: ");
        for (Player player : listOfPlayers) {
            System.out.println( player.getPlayerName() + " : " + player.getPlayerHand());
        }

    }



        // -- playGame()



    public List<Player> getListOfPlayers() {
        return listOfPlayers;
    }

}
