package lessons.lesson13.task1;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(-20, 0, 4, 5, 7, 9, 10, 15, 25);
        System.out.println(integers);
        Filter filter = i -> Arrays.asList(-20, 4, 9, 12, 15).contains(i);
        List<Integer> filtered = FilterHelper.doFilter(integers, filter);
        System.out.println(filtered);
    }
}
