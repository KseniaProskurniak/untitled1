package lessons.lesson13.task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsTest {
    @Test
    @DisplayName("Использование Object в toStringFunction")
    void test1() {
        Object given = new Object() {
            @Override
            public String toString() {
                return "Test1";
            }
        };
        String expected = "Test1";
        String actual = Functions.toStringFunction.execute(given);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Использование String в toStringFunction")
    void test2() {
        String given = "Test2";
        String expected = "Test2";
        String actual = Functions.toStringFunction.execute(given);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Использование локального класса Cat в toStringFunction")
    void test3() {
        Cat given = new Cat("Мурзик", 5);
        String expected = "Имя: Мурзик, Возраст: 5";
        String actual = Functions.toStringFunction.execute(given);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Список целых чисел [1, 2, 3, 4, 5, 10, 9, 8, 7, 6] в sumFunction")
    void test4() {
        List<Integer> given = Arrays.asList(1, 2, 3, 4, 5, 10, 9, 8, 7, 6);
        Integer expected = 55;
        Integer actual = Functions.sumFunction.execute(given);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Object в onlyEqualsObjects. Все объекты одинаковые, должен вернуть true")
    void test5() {
        Cat cat1 = new Cat("Барсик", 4);
        Cat cat2 = new Cat("Барсик", 4);
        Cat cat3 = new Cat("Барсик", 4);
        Cat cat4 = new Cat("Барсик", 4);
        List<Cat> given = Arrays.asList(cat1, cat2, cat3, cat4);
        Boolean actual = Functions.onlyEqualsObjects.execute(given);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Object в onlyEqualsObjects. Один объект отличается, должен вернуть false")
    void test6() {
        Cat cat1 = new Cat("Мурзик", 2);
        Cat cat2 = new Cat("Барсик", 4);
        Cat cat3 = new Cat("Барсик", 4);
        Cat cat4 = new Cat("Барсик", 4);
        List<Cat> given = Arrays.asList(cat1, cat2, cat3, cat4);
        Boolean actual = Functions.onlyEqualsObjects.execute(given);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Object в onlyEqualsObjects. Пустой список, должен вернуть true")
    void test7() {
        List<Object> given = Collections.emptyList();
        Boolean actual = Functions.onlyEqualsObjects.execute(given);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Object в onlyEqualsObjects. Один объект, должен вернуть true")
    void test8() {
        Cat cat = new Cat("Мурзик", 2);
        List<Cat> given = Collections.singletonList(cat);
        Boolean actual = Functions.onlyEqualsObjects.execute(given);
        assertTrue(actual);
    }

    @Test
    @DisplayName("String в onlyEqualsObjects. Три одинаковые строки, должен вернуть true")
    void test9() {
        String str1 = "qwerty";
        String str2 = "qwerty";
        String str3 = "qwerty";
        List<String> given = Arrays.asList(str1, str2, str3);
        Boolean actual = Functions.onlyEqualsObjects.execute(given);
        assertTrue(actual);
    }

    @Test
    @DisplayName("String в onlyEqualsObjects. Одна строка отличается, должен вернуть false")
    void test10() {
        String str1 = "qwerty1";
        String str2 = "qwerty";
        String str3 = "qwerty";
        List<String> given = Arrays.asList(str1, str2, str3);
        Boolean actual = Functions.onlyEqualsObjects.execute(given);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Проверка, что возвращается максимальный элемент для типа Double.")
    void test11() {
        List<Double> given = Arrays.asList(2.5, 4.3, 2.1, 1.5, -0.5);
        Double expected = 4.3;
        Double actual = Functions.maxObject.execute(given);
        assertFalse(actual);
    }


    static class Cat {
        private final String name;
        private final int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Cat cat = (Cat) o;

            if (age != cat.age) return false;
            return Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + age;
            return result;
        }

        @Override
        public String toString() {
            return String.format("Имя: %s, Возраст: %d", name, age);
        }
    }
}