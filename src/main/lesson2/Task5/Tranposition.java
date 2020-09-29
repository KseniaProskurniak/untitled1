/*package main.lesson2.Task5;

import java.util.Random;

public class Tranposition {
    public static void main(String[] args) {
        int m = new Random().nextInt(3) + 3;
        int n = new Random().nextInt(3) + 3;

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = new Random().nextInt(9);
            }
        }
        int[][] matrix2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix2[i][j] = new Random().nextInt(9);
            }
        }

        System.out.println("Исходная матрица:");
        for (int [] row:matrix) {
            for (int element : row) ;
            System.out.print(element);
            System.out.println();
        }

        System.out.println("Транспонированная матрица:");
        for (int [] row:matrix2) {
            for (int element : row) ;
            System.out.print(element);
            System.out.println();
        }
    }
}
*/