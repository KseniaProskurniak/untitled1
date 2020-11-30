package lessons.lesson11.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HumanAgeTest {

    @Test
    @DisplayName("Проверка валидности возраста - валидный (0)")
    public void testAge() {
        Human human1 = new Human();
        human1.setAge(0);
        Assertions.assertEquals(0, human1.getAge());
    }

    @Test
    @DisplayName("Проверка валидности возраста - валидный(60)")
    public void testAge1() {
        Human human1 = new Human();
        human1.setAge(60);
        Assertions.assertEquals(60, human1.getAge());
    }

    @Test
    @DisplayName("Проверка валидности возраста - валидный(120)")
    public void testAge2() {
        Human human1 = new Human();
        human1.setAge(120);
        Assertions.assertEquals(120, human1.getAge());
    }

    @Test
    @DisplayName("Проверка валидности возраста - не валидный (-1)")
    public void testAge3() {
        Human human2 = new Human();
        try {
            human2.setAge(-1);
            Assertions.fail("Должно быть исключение IllegalArgumentException");
        } catch (IllegalArgumentException exception) {
            Assertions.assertEquals("Некорректный возраст: -1", exception.getMessage());
        }

        Assertions.assertEquals(0, human2.getAge());
    }

    @Test
    @DisplayName("Проверка валидности возраста - не валидный (121)")
    public void testAge4() {
        Human human2 = new Human();
        try {
            human2.setAge(121);
            Assertions.fail("Должно быть исключение IllegalArgumentException");
        } catch (IllegalArgumentException exception) {
            Assertions.assertEquals("Некорректный возраст: 121", exception.getMessage());
        }

        Assertions.assertEquals(0, human2.getAge());

    }

}
