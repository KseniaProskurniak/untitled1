package main.lesson9.task2;

public class Generator {
    private static int state = 1;

    public static Object generate() {
        Object result;
        switch (state) {
            case 1:
                result = new Circle();
                break;
            case 2:
                result = new Square();
                break;
            case 3:
                result = new Box();
                break;
            default:
                result = new Table();
        }
        if (state == 4) {
            state = 1;
        } else {
            state++;
        }
        return result;
    }
}
