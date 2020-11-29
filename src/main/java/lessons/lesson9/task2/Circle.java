package lessons.lesson9.task2;

public class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Фигура " + this.getClass().getSimpleName() + " нарисована.");
    }
}
