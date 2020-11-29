package lessons.lesson6.task2.generators;

import java.util.Random;

public class NameGenerator {
    private static final Random random = new Random();

    public static String generate() {
        int length = 5 + random.nextInt(8);
        String result = "";
        for (int i = 0; i < length; i++) {
            char ch = randomChar();
            if (result.isEmpty()) {
                result += String.valueOf(ch).toUpperCase();
            } else {
                result += String.valueOf(ch);
            }
        }
        return result;
    }

    private static char randomChar() {
        char a = 'а';
        char z = 'я';
        return (char) (a + random.nextInt(z - a + 1));
    }

}
