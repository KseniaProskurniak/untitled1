package main.java.other;

public class NewClass2 {

    public static void main(String[] args) {
        NewClass2 inst = new NewClass2();
        System.out.println(inst.getSquare(0));
        System.out.println(inst.getSquare(2));
        System.out.println(inst.getSquare(100));
    }

    double getSquare(int radius) {
        return 3.14 * radius * radius;
    }

}