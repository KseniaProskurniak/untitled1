package main.lesson6.task1;

import java.util.Random;

public class AgeGenerator {
    private static final Random random = new Random();

    public static int generate() {
        return 20 + random.nextInt(56);
    }
}
