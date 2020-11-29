package lessons.lesson6.task2.generators;

import java.util.Random;

public class AgeGenerator {
    private static final Random random = new Random();

    public static int generate() {
        return 20 + random.nextInt(56);
    }
}
