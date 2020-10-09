package main.lesson5.task2;

public class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Возраст: %d.", name, age);
    }
}
