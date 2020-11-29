package lessons.lesson1;

public class Task6 {
    public static void main(String[] args) {
        Task6 new6 = new Task6();
        System.out.println(new6.method1(false, false, false, false));
        System.out.println(new6.method1(true, true, true, true));
        System.out.println(new6.method1(false, true, false, true));
        System.out.println(new6.method1(true, false, true, false));
        System.out.println(new6.method1(true, true, false, false));

    }

    boolean method1(boolean a, boolean b, boolean c, boolean d) {
        boolean ab = a && b;
        boolean cd = !(c || d);
        return ab && cd;
    }

}
