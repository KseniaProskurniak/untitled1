package lessons.lesson11.task3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Generator {

    public static int randomInteger(int start, int end) {
        return ThreadLocalRandom.current().nextInt(start, end);
    }

    public static String randomString(int startLength, int endLength) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        int countName = ThreadLocalRandom.current().nextInt(startLength, endLength);
        String result = "";
        for (int i = 0; i < countName; i++) {
            int pick = new Random().nextInt(alphabet.length);
            result += alphabet[pick];
        }
        return result;
    }
}
