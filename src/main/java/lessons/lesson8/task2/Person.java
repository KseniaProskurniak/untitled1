package lessons.lesson8.task2;

import java.util.Random;

public class Person {
    private static final Random RANDOM = new Random();

    private final int birthDate = RANDOM.nextInt(365) + 1;

    public int getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthDate=" + birthDate +
                '}';
    }
}
