package lessons.lesson13.task3;

import java.util.Comparator;
import java.util.List;

public class Functions {
    public static final Func<Object, String> toStringFunction = o -> o.toString();
    public static final Func<List<Integer>, Integer> sumFunction = l -> l.stream().reduce(0, (a, i) -> a + i);
    public static final Func<List<?>, Boolean> onlyEqualsObjects = l -> l.stream().distinct().count() <= 1;
    public static final Func<List<Comparable>, ?> maxObject = l -> l.stream().sorted(Comparator.reverseOrder()).findFirst().orElse(null);
}
