import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print Welcome message to console
        System.out.println("Welcome to Black Jack!");

//        // Ask for the 3 players details. create players and store in a list
//        System.out.println(" ** Each Player should Enter their Name and Bet ** ");
//
//        Scanner scanner = new Scanner(System.in);
//        for (int i=1; i<4; i++){
//            System.out.println("Player " + i + "Name: ");
//            String name = scanner.nextLine();
//            System.out.println("Player "  + i + "Bet: ");
//            double  bet = scanner.nextDouble();
//            Player player = new Player(name, bet);
//
//
//        }


        // print game begins and run Game.run()

        Game game = new Game();
        game.run();

    }
}
