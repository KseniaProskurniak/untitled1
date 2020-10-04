package main.lesson3.task2;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{new Cat(2, 5, "Барсик"),
                new Cat(3, 11, "Мурзик"),
                new Cat(7, 2, "Матильда"),
                new Cat(1, 3, "Леопольд"),
                new Cat(11, 4, "Базилио")
        };
        Arrays.sort(cats, (a, b) -> a.name.compareTo(b.name));
        for (Cat cat : cats) {
            System.out.printf("Имя: %s, Возраст: %d, Вес: %d %n", cat.name, cat.age, cat.weight);
        }

    }
}
