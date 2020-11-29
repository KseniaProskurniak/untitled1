package lessons.lesson11.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTestSum {

    @Test
    @DisplayName("Проверка метода суммирования с 2 числами")
    public void testSum2() {
        int value1 = 5;
        int value2 = 3;

        int result = Calculator.sum(value1, value2);
        Assertions.assertEquals(8, result);
    }

    @Test
    @DisplayName("Проверка метода суммирования с 6 числами")
    public void testSum6() {
        int[] values = {1, 2, 3, 4, 5, 6};
        int result = Calculator.sum(values);

        Assertions.assertEquals(21, result);
    }
}
