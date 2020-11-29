package lessons.lesson9.task4;

import lessons.lesson9.task4.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Cooker {
    private final List<Food> foods = new ArrayList<>();

    public int getTotalTime() {
        int timeSum = 0;
        for (Food food : foods) {
            timeSum += food.getCookingTime();
        }
        return timeSum;
    }

    public int getFoodCount() {
        return foods.size();
    }

    public void addFood(Food food) {
        foods.add(food);
    }

    public void clear() {
        foods.clear();
    }
}
