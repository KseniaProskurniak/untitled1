package lessons.lesson9.task2;

public class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Фигура " + this.getClass().getSimpleName() + " нарисована.");
    }
}
