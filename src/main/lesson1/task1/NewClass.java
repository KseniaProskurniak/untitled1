package main.lesson1.task1;

public class NewClass {

    public static void main(String[] args) {
        NewClass instance;
        instance = new NewClass();
        System.out.println(instance.getSquare(0));
        System.out.println(instance.getSquare(2));
        System.out.println(instance.getSquare(100));
    }

    float getSquare(int radius) {
        float pi =3.14f;
        return pi * radius * radius;
    }
}
