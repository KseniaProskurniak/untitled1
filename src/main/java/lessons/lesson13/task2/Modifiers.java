package lessons.lesson13.task2;

public class Modifiers {
    public static final Modifier<Boolean> INVERT = b -> !b;
    public static final Modifier<Integer> ABSOLUTE = i -> i < 0 ? -i : i;
    public static final Modifier<String> REVERSE = s -> new StringBuilder(s).reverse().toString();
}
