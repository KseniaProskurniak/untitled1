package main.lesson1.task5;

public class Task5 {
    public static void main(String[] args) {
        Task5 new5 = new Task5();
        System.out.println(new5.metod1(false,false) + " " + new5.metod2(false,false));
        System.out.println(new5.metod1(false,true) + " " + new5.metod2(false,true));
        System.out.println(new5.metod1(true,false) + " " + new5.metod2(true,false));
        System.out.println(new5.metod1(true,true) + " " + new5.metod2(true,true));


    }
    boolean metod1 (boolean a, boolean b){
        return !(a||b);
    }
    boolean metod2 (boolean a, boolean b){
        return !a&&!b;
    }

}
