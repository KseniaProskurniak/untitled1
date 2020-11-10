package main.lesson9.task4;

import main.lesson9.task4.food.Food;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        int cookerCount = RANDOM.nextInt(6) + 5;
        List<Cooker> cookers = new ArrayList<>(cookerCount);
        for (int i = 0; i < cookerCount; i++) {
            cookers.add(new Cooker());
        }

        List<Food> foods = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            foods.add(Factory.getRandomFood());
        }

        BusyTimeDistributor busyTimeDistributor = new BusyTimeDistributor();
        List<Cooker> cookers1 = distribute(busyTimeDistributor, foods, cookers);

        int maxTime1 = calculateMaxTime(cookers1);
        System.out.println("BusyTimeDistributor maxTime: " + maxTime1);

        RoundRobinDistributor roundRobinDistributor = new RoundRobinDistributor();
        List<Cooker> cookers2 = distribute(roundRobinDistributor, foods, cookers);

        int maxTime2 = calculateMaxTime(cookers2);
        System.out.println("RoundRobinDistributor maxTime: " + maxTime2);
    }

    private static List<Cooker> distribute(Distributor distributor, List<Food> foods, List<Cooker> cookers) {
        List<Cooker> resultCookers = new ArrayList<>(cookers);
        for (Food food : foods) {
            distributor.addFood(food, resultCookers);
        }
        return resultCookers;
    }

    private static int calculateMaxTime(List<Cooker> cookers) {
        int maxTime = 0;
        for (Cooker cooker : cookers) {
            if (cooker.getTotalTime() > maxTime) {
                maxTime = cooker.getTotalTime();
            }
        }
        return maxTime;
    }
}

