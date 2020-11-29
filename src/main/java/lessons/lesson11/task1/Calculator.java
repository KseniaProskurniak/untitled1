package lessons.lesson11.task1;

public class Calculator {
    public static int sum(int... values) {
        int resultSum = 0;
        for (int int1 : values) {
            resultSum += int1;
        }
        return resultSum;
    }

    public static int multiply(int... values) {
        int resultMultiple = 1;
        for (int int1 : values) {
            resultMultiple *= int1;
        }
        return resultMultiple;
    }

}
