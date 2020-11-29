package lessons.lesson1;

public class Task1 {

    public static void main(String[] args) {
        Task1 instance;
        instance = new Task1();
        System.out.println(instance.getSquare(0));
        System.out.println(instance.getSquare(2));
        System.out.println(instance.getSquare(100));
    }

    float getSquare(int radius) {
        float pi = 3.14f;
        return pi * radius * radius;
    }
}
