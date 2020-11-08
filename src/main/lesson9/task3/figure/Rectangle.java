package main.lesson9.task3.figure;

import main.lesson9.task3.TwoParameterFigure;

public class Rectangle extends TwoParameterFigure {

    @Override
    public double getArea() {
        return parameter1 * parameter2;
    }

    @Override
    public double getLength() {
        return 2 * (parameter1 + parameter2);
    }
}
