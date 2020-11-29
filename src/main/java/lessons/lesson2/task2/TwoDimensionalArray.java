package lessons.lesson2.task2;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                twoDimArray[i][j] = (i + j) % 2;
            }
        }
        System.out.println("Вывод при помощи 'for':");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" " + twoDimArray[i][j]);
            }
            System.out.println();
        }
        System.out.println("Вывод при помощи 'forEach':");
        for (int[] row : twoDimArray) {
            for (int cell : row) {
                System.out.print(" " + cell);
            }
            System.out.println();
        }
    }
}
