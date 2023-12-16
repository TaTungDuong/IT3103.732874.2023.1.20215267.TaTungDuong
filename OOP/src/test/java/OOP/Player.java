package OOP;
import java.util.*;

public class Player {
    String name;
    int score;
    boolean isReal;

    Player(String name, boolean isReal) {
        this.name = name;
        this.score = 0;
        this.isReal = isReal;
    }

    void rollDice(Dice dice) {
        Scanner scanner = new Scanner(System.in);
        if (isReal) {
            String input;
            do {
                System.out.println(name + ", do you want to roll the dice? (y/n)");
                input = scanner.nextLine();
            } while (!input.equalsIgnoreCase("y"));
        }
        int roll = dice.roll();
        System.out.println(this.name + " rolled " + roll + "!");
        if (score + roll > 21) {
            score = 0;
        } else if (score + roll == 21) {
            score = 21;
        } else {
            score += roll;
        }
    }
}
