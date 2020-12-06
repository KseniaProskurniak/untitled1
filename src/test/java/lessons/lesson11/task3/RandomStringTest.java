package lessons.lesson11.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomStringTest {

    @Test
    @DisplayName("Тестирование генерации случайных строк")
    public void randomString() {
        for (int i = 0; i < 10000; i++) {
            int from = new Random().nextInt(10);
            int to = new Random().nextInt(10) + 10;
            String text = Generator.randomString(from, to);
            Assertions.assertTrue(text.matches("^[A-Za-z]{0,20}$"));
        }
    }

}
