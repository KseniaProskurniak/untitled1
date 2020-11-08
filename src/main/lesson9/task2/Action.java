package main.lesson9.task2;

public class Action {
    public static void action(Object object) {
        if (object instanceof Drawable) {
            ((Drawable) object).draw();
        }
        if (object instanceof Movable) {
            ((Movable) object).move();
        }
    }

}
