package main.lesson7.task3.chess;

public class Position {
    private char x;
    private int y;

    public Position(char x, int y) {
        if (x < 'a' || x > 'h' || y < 1 || y > 8) {
            throw new IllegalArgumentException("Некорректные координаты");
        }
        this.x = x;
        this.y = y;
    }

    public char getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("%c%d", x, y);
    }
}
