package lessons.lesson11.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HumanFirstNameTest {

    @Test
    @DisplayName("Проверка валидности имени - валидное")
    public void testName1() {
        Human human1 = new Human();
        human1.setFirstName("Иван");
        Assertions.assertEquals("Иван", human1.getFirstName());
    }

    @Test
    @DisplayName("Проверка корректности имени - не валидное (2 символа)")
    public void testName2() {
        Human human2 = new Human();
        try {
            human2.setFirstName("Ив");
            Assertions.fail("Должно быть исключение IllegalArgumentException");
        } catch (IllegalArgumentException exception) {
            Assertions.assertEquals("Некорректное имя: Ив", exception.getMessage());
        }

        Assertions.assertNull(human2.getFirstName());
    }

    @Test
    @DisplayName("Проверка корректности имени - не валидное (18 символов)")
    public void testName3() {
        Human human = new Human();
        try {
            human.setFirstName("Ивансдлиннымименем");
            Assertions.fail("Должно быть исключение IllegalArgumentException");
        } catch (IllegalArgumentException exception) {
            Assertions.assertEquals("Некорректное имя: Ивансдлиннымименем", exception.getMessage());
        }

        Assertions.assertNull(human.getFirstName());
    }

    @Test
    @DisplayName("Проверка корректности имени - не валидное (18 символов)")
    public void testName4() {
        Human human = new Human();
        try {
            human.setFirstName("Иван5аа");
            Assertions.fail("Должно быть исключение IllegalArgumentException");
        } catch (IllegalArgumentException exception) {
            Assertions.assertEquals("Некорректное имя: Иван5аа", exception.getMessage());
        }

        Assertions.assertNull(human.getFirstName());
    }
}
