package lessons.lesson10.task4;

import java.util.Random;

public class StringGenerator {
    private static final Random RANDOM = new Random();

    public static String generate(int length, String pattern) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(pattern.length());
            char ch = pattern.charAt(index);
            sb.append(ch);
        }
        return sb.toString();
    }
}
