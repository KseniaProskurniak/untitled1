package main.lesson3.task5;

import java.util.Random;

public class Cat {
    private static final Random random = new Random();
    String name;
    int age;

    public Cat() {
        name = Names.getRandomCatName();
        age = random.nextInt(15);

    }
}
