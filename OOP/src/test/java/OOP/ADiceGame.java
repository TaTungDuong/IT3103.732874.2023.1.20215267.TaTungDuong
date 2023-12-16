package OOP;
import java.util.*;

public class ADiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //Menu
            System.out.println("-------------------");
            System.out.println("A Dice Game!");
            System.out.println("1. New game");
            System.out.println("2. Quit");
            System.out.println("-------------------");
            
            //Check input
            int choice;
            while (true) {
                System.out.print("Enter your choice (1-2): ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice == 1 || choice == 2) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter 1 or 2.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter 1 or 2.");
                }
            } // consume newline
            
            if (choice == 1) {//If user want to starts a new game
                Game game = new Game();
                System.out.println("How many real players are there?");
                int realPlayers = scanner.nextInt();
                scanner.nextLine(); // consume newline
                for (int i = 1; i <= realPlayers; i++) {
                    System.out.println("Enter the name of player " + i + ":");
                    String name = scanner.nextLine();
                    game.addPlayer(new Player(name, true));
                }
                System.out.println("-------------------");
                for (int i = realPlayers + 1; i <= 4; i++) {
                    game.addPlayer(new Player("Player " + i, false));
                }
                System.out.println("Added " + (4 - realPlayers) + " virtual players.");
                System.out.println("-------------------");
                boolean gameOver = game.playGame();
                if (gameOver) {
                    continue;
                }
            } else if (choice == 2) { //If user wants to quit
                System.out.println("\nSee you again!");
                break;
            }
        }
    }
}