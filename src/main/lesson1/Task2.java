package main.lesson1;

public class Task2 {
    public static void main(String[] args) {
        Task2 new1 = new Task2();
        System.out.println(new1.squereMorePerimeter(2,7));
        System.out.println(new1.squereMorePerimeter(6,5));
        System.out.println(new1.squereMorePerimeter(6,3));
    }

    boolean squereMorePerimeter (int width, int height ){
        int square =  height *  width;
        int perimeter =  2 * (height +  width);
        return (square > perimeter);
    }


}
