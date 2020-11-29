package lessons.lesson1;

public class Task5 {
    public static void main(String[] args) {
        Task5 new5 = new Task5();
        System.out.println(new5.method1(false, false) + " " + new5.method2(false, false));
        System.out.println(new5.method1(false, true) + " " + new5.method2(false, true));
        System.out.println(new5.method1(true, false) + " " + new5.method2(true, false));
        System.out.println(new5.method1(true, true) + " " + new5.method2(true, true));

    }

    boolean method1(boolean a, boolean b) {
        return !(a || b);
    }

    boolean method2(boolean a, boolean b) {
        return !a && !b;
    }

}


