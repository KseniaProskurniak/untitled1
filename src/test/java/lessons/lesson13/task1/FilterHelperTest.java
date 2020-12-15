package lessons.lesson13.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilterHelperTest {
    @Test
    @DisplayName("Фильтрует, оставляя значения, которые меньше 5")
    void test1() {
        List<Integer> given = Arrays.asList(-20, 0, 4, 5, 7, 9);
        List<Integer> expected = Arrays.asList(-20, 0, 4);
        List<Integer> actual = FilterHelper.doFilter(given, i -> i < 5);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Фильтрует, оставляя значения, которые больше 10")
    void test2() {
        List<Integer> given = Arrays.asList(-20, 0, 4, 5, 7, 9, 10, 15, 25);
        List<Integer> expected = Arrays.asList(15, 25);
        List<Integer> actual = FilterHelper.doFilter(given, i -> i > 10);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Фильтрует, оставляя значения, содержащиеся в списке (-20, 4, 9, 12, 15)")
    void test3() {
        List<Integer> given = Arrays.asList(-20, 0, 4, 5, 7, 9, 10, 15, 25);
        List<Integer> expected = Arrays.asList(-20, 4, 9, 15);
        List<Integer> actual = FilterHelper.doFilter(given, i -> Arrays.asList(-20, 4, 9, 12, 15).contains(i));
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("фильтрует, оставляя значения, содержащиеся в списке (-20, 4, 9, 12, 15)")
    void test4() {
        List<Integer> given = Arrays.asList(-10, -7, 5, 15, 5, -2, 4, 15);
        List<Integer> expected = Arrays.asList(-10, -7, -2, 4);
        List<Integer> actual = FilterHelper.doFilter(given, i -> given.indexOf(i) == given.lastIndexOf(i));
        assertEquals(expected, actual);
    }
}