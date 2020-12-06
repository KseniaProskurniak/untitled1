package lessons.lesson11.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomIntegerTest {

    @Test
    @DisplayName("Тестирование генерации случайных чисел")
    public void randomInteger() {
        for (int i = 0; i < 10000; i++) {
            int from = new Random().nextInt(100);
            int to = new Random().nextInt(100) + 100;
            int number = Generator.randomInteger(from, to);
            Assertions.assertEquals(100, number, 100);
        }
    }
}
