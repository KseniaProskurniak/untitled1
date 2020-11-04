package main.lesson7.task3.figures;

import main.lesson7.task3.chess.Move;
import main.lesson7.task3.chess.Position;

import java.util.ArrayList;
import java.util.List;

public class King extends ChessFigure {
    private static final List<Move> MOVES;

    static {
        MOVES = new ArrayList<>(8);
        MOVES.add(new Move(0, 1)); // вверх
        MOVES.add(new Move(1, 1)); // вправо вверх
        MOVES.add(new Move(1, 0)); // вправо
        MOVES.add(new Move(1, -1)); // вправо вниз
        MOVES.add(new Move(0, -1)); // вниз
        MOVES.add(new Move(-1, -1)); // влево вниз
        MOVES.add(new Move(-1, 0)); // влево
        MOVES.add(new Move(-1, 1)); // влево вверх
    }

    public King(Position position) {
        super(position);
    }

    public King(char x, int y) {
        super(x, y);
    }

    @Override
    public List<Position> getAvailableMoves() {
        List<Position> positions = new ArrayList<>();
        for (Move move : MOVES) {
            char newX = (char) (position.getX() + move.getX());
            int newY = position.getY() + move.getY();
            if (newX >= 'a' && newX <= 'h' && newY >= 1 && newY <= 8) {
                positions.add(new Position(newX, newY));
            }
        }
        return positions;
    }
}

