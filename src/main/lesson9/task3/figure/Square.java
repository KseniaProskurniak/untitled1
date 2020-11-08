package main.lesson9.task3.figure;

import main.lesson9.task3.OneParameterFigure;

public class Square extends OneParameterFigure {

    @Override
    public double getArea() {
        return parameter1 * parameter1;
    }

    @Override
    public double getLength() {
        return 4 * parameter1;
    }
}
