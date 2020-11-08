package main.lesson9.task3;

import main.lesson9.task3.figure.*;

public class Generator {
    private static int roundRobin = 0;

    static Figure generateFigure() {
        roundRobin %= 6;
        switch (roundRobin++) {
            case 1:
                return new Square();
            case 2:
                return new Circle();
            case 3:
                return new EquilateralTriangle();
            case 4:
                return new Rectangle();
            case 5:
                return new Ellipse();
            default:
                return new RightTriangle();
        }
    }
}