package main.lesson10.task2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StringHelper {
    public static String generate() {
        char[] pattern = Config.LINES_PATTERN.toCharArray();
        String result = "";
        int length = ThreadLocalRandom.current().nextInt(Config.LINES_MIN_LENGTH, Config.LINES_MAX_LENGTH + 1);
        for (int i = 0; i < length; i++) {
            int index = new Random().nextInt(pattern.length);
            result += pattern[index];
        }
        System.out.printf(Config.LINES_MESSAGE, result);
        return result;
    }
}

