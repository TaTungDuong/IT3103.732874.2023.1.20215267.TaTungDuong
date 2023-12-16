package OOP;
import java.util.*;

public class Game {
    List<Player> players;
    Dice dice;
    int currentPlayerIndex;
    int turnCount;

    Game() {
        this.players = new ArrayList<>();
        this.dice = new Dice();
        this.currentPlayerIndex = 0;
        this.turnCount = 0;
    }

    void addPlayer(Player player) {
        if (players.size() < 4) {
            players.add(player);
            if (player.isReal) {
                System.out.print("Add player: " + player.name + "\n");
            } 
            else {
                System.out.print("Add virtual player: " + player.name + "\n");
            }
            
        }
    }

    void playTurn() {
        System.out.println("Turn " + (++turnCount) + ":");
        Player currentPlayer = players.get(currentPlayerIndex);
        currentPlayer.rollDice(dice);
        System.out.println(currentPlayer.name + "'s current score: " + currentPlayer.score);
        if (currentPlayer.score == 21) {
            System.out.println(currentPlayer.name + " wins with 21 points!");
            return;
            //System.exit(0);
        }
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        System.out.println("Next player: " + players.get(currentPlayerIndex).name);
        System.out.println("");
    }

    boolean playGame() {
        while (true) {
            playTurn();
            if (isGameOver()) {
                return true;
            }
        }
    }

    boolean isGameOver() {
        for (Player player : players) {
            if (player.score == 21) {
                System.out.println(player.name + " wins with 21 points!");
                return true;
            }
        }
        return false;
    }
}
