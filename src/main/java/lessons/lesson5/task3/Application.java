package lessons.lesson5.task3;

import java.util.Random;

public class Application {
    private static final Random random = new Random();

    public static void main(String[] args) {

        int total = randomFromRange(500, 1000);
        int count = 0;
        for (int i = 0; i < total; i++) {
            int m = randomFromRange(0, 4);
            int n = randomFromRange(0, 4);
            try {
                int a = m / n;
            } catch (ArithmeticException ae) {
                count++;
            }
        }
        System.out.printf("Из %d операций деления %d было выполнено с ошибкой", total, count);
    }

    private static int randomFromRange(int first, int last) {
        return first + random.nextInt(last - first + 1);
    }
}
