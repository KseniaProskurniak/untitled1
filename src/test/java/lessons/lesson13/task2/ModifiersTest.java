package lessons.lesson13.task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ModifiersTest {
    @Test
    @DisplayName("Инвертирование переменной")
    void testInvert() {
        Boolean actual = Modifiers.INVERT.modify(true);
        assertEquals(false, actual);
    }

    @Test
    @DisplayName("Абсолютное значение переменной (модуль)")
    void testAbsolute() {
        Integer given = -5;
        Integer expected = 5;
        Integer actual = Modifiers.ABSOLUTE.modify(given);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Возврат строки в обратном порядке")
    void testReverse() {
        String given = "ABCDE";
        String expected = "EDCBA";
        String actual = Modifiers.REVERSE.modify(given);
        assertEquals(expected, actual);
    }
}