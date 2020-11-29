package lessons.lesson11.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTestMultiply {

    @Test
    @DisplayName("Проверка метода умножения с 2 числами")
    public void testMultiply2() {
        int value1 = 3;
        int value2 = 2;

        int result = Calculator.multiply(value1, value2);
        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("Проверка метода умножения с 6 числами")
    public void testMultiply6() {
        int[] values = {1, 2, 3, 4, 5, 6};
        int result = Calculator.multiply(values);
        Assertions.assertEquals(720, result);
    }
}
