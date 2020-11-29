package lessons.lesson5.task1;

import java.util.Random;

public class Application {
    private static final Random random = new Random();

    public static void main(String[] args) {

        int m = getRangeRandom(5, 10);
        int n = getRangeRandom(5, 10);
        int[] dividends = new int[m];
        int[] dividers = new int[n];
        int[][] result = new int[m][n];

        for (int i = 0; i < dividends.length; i++) {
            dividends[i] = getRangeRandom(4, 9);
        }

        for (int i = 0; i < dividers.length; i++) {
            dividers[i] = getRangeRandom(0, 3);
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                try {
                    result[i][j] = dividends[i] / dividers[j];
                } catch (ArithmeticException ae) {
                    result[i][j] = -1;
                }
            }
        }
        for (int[] row : result) {
            for (int cell : row) {
                System.out.printf("%3d", cell);
            }
            System.out.println();
        }

    }

    private static int getRangeRandom(int start, int end) {
        return start + random.nextInt(end - start + 1);
    }
}
