package main.lesson7.task3;

import main.lesson7.task3.chess.Position;
import main.lesson7.task3.figures.ChessFigure;
import main.lesson7.task3.figures.King;
import main.lesson7.task3.figures.Queen;

public class Application {
    public static void main(String[] args) {
        Queen queen = new Queen('e', 4);
        King king2 = new King('h', 7);
        printMoves(king2);
        printMoves(queen);

    }

    public static void printMoves(ChessFigure figure) {
        StringBuilder sb = new StringBuilder();
        //<Тип фигуры> (<Текущая позиция>): <Позиция1>, <Позиция2>, …, <Позиция N>
        sb.append(figure.getClass().getSimpleName())
                .append(" (")
                .append(figure.getPosition())
                .append("):");

        for (Position position : figure.getAvailableMoves()) {
            sb.append(" ")
                    .append(position)
                    .append(",");
        }
        //   sb.deleteCharAt(sb.length() - 1);
        sb.replace(sb.length() - 1, sb.length(), ".");
        System.out.println(sb.toString());
    }
}


