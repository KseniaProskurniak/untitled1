package main.lesson2.Task5;

import java.util.Random;

public class Transposition {
    public static void main(String[] args) {
        Random random = new Random();
        int m = random.nextInt(3) + 3;
        int n = random.nextInt(3) + 3;
        int[][] sourceArray = new int[m][n];

        for (int i = 0; i < sourceArray.length; i++) {
            for (int j = 0; j < sourceArray[i].length; j++) {
                sourceArray[i][j] = random.nextInt(100);
            }
        }
        for (int[] row : sourceArray) {
            for (int cell : row) {
                System.out.print(String.format("%3d", cell));
            }
            System.out.println();
        }
        System.out.println();

        int[][] targetArray = new int[n][m];
        for (int i = 0; i < sourceArray.length; i++) {
            for (int j = 0; j < sourceArray[i].length; j++) {
                targetArray[j][i] = sourceArray[i][j];
            }
        }
        for (int[] row : targetArray) {
            for (int cell : row) {
                System.out.print(String.format("%3d", cell));
            }
            System.out.println();
        }
    }
}


