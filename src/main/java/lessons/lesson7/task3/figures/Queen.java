package lessons.lesson7.task3.figures;

import lessons.lesson7.task3.chess.Move;
import lessons.lesson7.task3.chess.Position;

import java.util.ArrayList;
import java.util.List;

public class Queen extends ChessFigure {
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

    public Queen(Position position) {
        super(position);
    }

    public Queen(char x, int y) {
        super(x, y);
    }

    @Override
    public List<Position> getAvailableMoves() {
        List<Position> positions = new ArrayList<>();
        for (Move move : MOVES) {
            char lastX = position.getX();
            int lastY = position.getY();
            while (true) {
                char newX = (char) (lastX + move.getX());
                int newY = lastY + move.getY();
                if (newX >= 'a' && newX <= 'h' && newY >= 1 && newY <= 8) {
                    positions.add(new Position(newX, newY));
                    lastX = newX;
                    lastY = newY;
                } else {
                    break;
                }
            }
        }
        return positions;
    }
}

