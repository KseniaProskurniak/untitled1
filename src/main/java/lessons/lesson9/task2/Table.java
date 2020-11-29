package lessons.lesson9.task2;

public class Table implements Movable {
    @Override
    public void move() {
        System.out.println("Предмет " + this.getClass().getSimpleName() + " перемещен.");
    }
}
