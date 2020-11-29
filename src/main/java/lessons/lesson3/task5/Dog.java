package lessons.lesson3.task5;


import java.util.Random;

public class Dog {
    private static final Random random = new Random();

    String name;
    int dog;

    public Dog() {
        name = Names.getRandomDogName();
        dog = random.nextInt(15);

    }

}
