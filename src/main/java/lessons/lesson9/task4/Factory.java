package lessons.lesson9.task4;

import lessons.lesson9.task4.food.*;

import java.util.Random;

public class Factory {
    public static Food getRandomFood() {
        int foodIndex = new Random().nextInt(6);
        switch (foodIndex) {
            case 0:
                return new Buckwheat();
            case 1:
                return new Coffee();
            case 2:
                return new Fish();
            case 3:
                return new Meat();
            case 4:
                return new Rice();
            case 5:
                return new Tea();
            default:
                throw new IllegalStateException("Что-то пошло не так!");
        }
    }
}
