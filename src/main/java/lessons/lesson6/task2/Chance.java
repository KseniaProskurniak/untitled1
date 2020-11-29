package lessons.lesson6.task2;

import java.util.Random;

public class Chance {
    private static final Random random = new Random();

    public static boolean calculateChance(int percent) {
        int seed = 1 + random.nextInt(100);
        return seed <= percent;
    }
}
