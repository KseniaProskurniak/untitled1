package main.lesson1;

public class Task4 {
    public static void main(String[] args) {
        Task4 new4 = new Task4();
        System.out.println(new4.meters(115));
        System.out.println(new4.meters(800));
        System.out.println(new4.meters(278));
    }

    int meters(int n) {
        return n / 100;

    }

}
