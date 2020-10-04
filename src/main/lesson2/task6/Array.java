package main.lesson2.task6;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Random random = new Random();
        int m = random.nextInt(5) + 3;
        int n = random.nextInt(5) + 3;
        int[][] array = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(2);
            }
        }
        int i2 = 1 + random.nextInt(m - 2);
        int j2 = 1 + random.nextInt(n - 2);
        array[i2][j2] = 2;

        printArray(array);
        System.out.println();

        boolean inverse = false;
        int[][] newArray = new int[m][n];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                if (inverse) {
                    newArray[i][j] = array[i][j] == 0 ? 1 : 0;
                } else if (i == i2 && j == j2) {
                    newArray[i][j] = 2;
                    inverse = true;
                } else {
                    newArray[i][j] = array[i][j];
                }
            }
        }
        printArray(newArray);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int cell : row) {
                System.out.printf("%2d", cell);
            }
            System.out.println();
        }
    }
}