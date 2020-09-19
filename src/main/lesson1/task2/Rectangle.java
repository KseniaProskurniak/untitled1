package main.lesson1.task2;

public class Rectangle {
    int width;
    int height;

    int getSquare() {
        return width * height;
    }

    int getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle innstance = new Rectangle();
        innstance.height = 2;
        innstance.width = 7;

        int square = innstance.getSquare();
        int perimeter = innstance.getPerimeter();
        boolean checkResult = square>perimeter;

        System.out.println(square);
        System.out.println(perimeter);
        System.out.println(checkResult);

    }
}



