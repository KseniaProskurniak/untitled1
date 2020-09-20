package main.lesson1.task3;

public class Task3 {
    public static void main(String[] args) {
        Task3 new2 = new Task3();
        System.out.println(new2.isOdd(14));
        System.out.println(new2.isOdd(19));
    }

    boolean isOdd(int n) {
        return n % 2 == 1;

    }

}
