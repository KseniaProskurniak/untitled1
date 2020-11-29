package lessons.lesson3.task5;

import java.util.Random;

public class Names {

    static final String[] humanNames = {"Иван", "Михаил", "Олег", "Александр", "Татьяна", "Светлана", "Марина", "Ольга"};
    static final String[] catNames = {"Мурзик", "Барсик", "Пушок", "Базилио", "Рыжик", "Леопольд"};
    static final String[] dogNames = {"Шарик", "Тузик", "Трезор", "Мухтар", "Дружок", "Джек"};

    private static final Random random = new Random();

    static String getRandomHumanName() {
        return humanNames[random.nextInt(humanNames.length)];
    }

    static String getRandomCatName() {
        return catNames[random.nextInt(catNames.length)];
    }

    static String getRandomDogName() {
        return dogNames[random.nextInt(dogNames.length)];
    }
}
