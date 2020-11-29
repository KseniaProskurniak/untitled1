package lessons.lesson5.task4;

import java.util.Random;

public class Application {
    public static void main(String[] args) {

        Cat[] cats = new Cat[10];
        for (int i = 0; i < cats.length; i++) {
            int age = -50 + new Random().nextInt(100);
            try {
                cats[i] = new Cat("Новый кот", age);
            } catch (AgeTooHighException e) {
                System.out.println("Слишком большой возраст для кота");
                cats[i] = null;
            }
        }
        for (Cat cat : cats) {
            try {
                System.out.println(cat.toString());
            } catch (NullPointerException e) {
                System.out.println("Ошибка вывода данных");
            }
        }
    }
}

