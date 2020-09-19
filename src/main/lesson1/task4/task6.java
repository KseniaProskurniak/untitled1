package main.lesson1.task4;

public class task6 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean d = true;

        boolean check1 = a || b;
        boolean check2 = c || d;
        boolean check3 = check1 || check2;
        System.out.println(check3);
    }
}
