package lessons.lesson6.task1;

import java.util.Random;

public class PhoneGenerator {
    private static final Random random = new Random();

    public static String generate() {
        return String.format("+7(%03d)%03d-%02d-%02d", random.nextInt(1000), random.nextInt(1000),
                random.nextInt(100), random.nextInt(100));
    }
}
