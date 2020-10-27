package main.lesson6.task4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NameGenerator {

    public static String generate() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int countName = ThreadLocalRandom.current().nextInt(5, 12);
        String name = "";
        for (int i = 0; i < countName; i++) {
            int pick = new Random().nextInt(alphabet.length); // переменная содержит рандомное число, ограниченное длинной массива
            name += alphabet[pick];
            if (i == 0) {
                name = name.toUpperCase();
            }
        }
        return name;
    }
}
