package lessons.lesson9.task4.food;

public abstract class Food {
    protected int cookingTime;

    public int getCookingTime() {
        return cookingTime;
    }

    @Override
    public String toString() {
        return "Food{" +
                "cookingTime=" + cookingTime +
                '}';
    }
}
