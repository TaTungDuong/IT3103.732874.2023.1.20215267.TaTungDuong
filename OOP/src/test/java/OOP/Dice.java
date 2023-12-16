package OOP;
import java.util.*;

public class Dice {
    private Random random;

    Dice() {
        this.random = new Random();
    }

    int roll() {
        int roll = random.nextInt(100);
        if (roll < 20) return 1;
        if (roll < 40) return 2;
        if (roll < 60) return 3;
        return 4;
    }
}
