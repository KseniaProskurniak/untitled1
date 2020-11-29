package lessons.lesson7.task3.figures;

import lessons.lesson7.task3.chess.Position;

import java.util.List;

public abstract class ChessFigure {
    protected Position position;

    public ChessFigure(Position position) {
        this.position = position;
    }

    public ChessFigure(char x, int y) {
        this.position = new Position(x, y);
    }

    public abstract List<Position> getAvailableMoves();

    public Position getPosition() {
        return position;
    }
}
