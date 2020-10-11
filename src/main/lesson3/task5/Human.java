package main.lesson3.task5;

import java.util.Random;

public class Human {

    private static final Random random = new Random();

    String name;
    Cat[] cats;
    Dog[] dogs;

    public Human() {
        name = Names.getRandomHumanName();

        cats = new Cat[random.nextInt(4)];
        dogs = new Dog[random.nextInt(4)];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %d кошек, %d собак", name, cats.length, dogs.length);
    }


    public boolean equals(Human other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return cats.length == other.cats.length && dogs.length == other.dogs.length;
    }
}


