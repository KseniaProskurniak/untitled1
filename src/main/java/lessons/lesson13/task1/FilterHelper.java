package lessons.lesson13.task1;

import java.util.List;
import java.util.stream.Collectors;

public class FilterHelper {
    public static List<Integer> doFilter(List<Integer> integers, Filter filter) {
        return integers.stream()
                .filter(integer -> filter.filter(integer))
                .collect(Collectors.toList());
    }
}
