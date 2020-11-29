package lessons.lesson9.task3.figure;

import lessons.lesson9.task3.OneParameterFigure;


public class EquilateralTriangle extends OneParameterFigure {

    @Override
    public double getArea() {
        return Math.sqrt(3) * parameter1 * parameter1 / 4;
    }

    @Override
    public double getLength() {
        return 3 * parameter1;
    }
}

