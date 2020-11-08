package main.lesson9.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        int renaultCount = 0;
        int nissantCount = 0;
        int mitsubishiCount = 0;
        int mercedesCount = 0;
        int regularCount = 0;
        int premiumCount = 0;

        for (int i = 0; i < 1000; i++) {
            Car car = Factory.make();
            if (car instanceof Renault)
                renaultCount++;
            if (car instanceof Nissan)
                nissantCount++;
            if (car instanceof Mitsubishi)
                mitsubishiCount++;
            if (car instanceof Mercedes)
                mercedesCount++;
            if (car instanceof Regular)
                regularCount++;
            if (car instanceof Premium)
                premiumCount++;
            cars.add(car);
        }

        System.out.printf("Renault: %d\n", renaultCount);
        System.out.printf("Nissan: %d\n", nissantCount);
        System.out.printf("Mitsubishi: %d\n", mitsubishiCount);
        System.out.printf("Mercedes: %d\n", mercedesCount);
        System.out.printf("Regular: %d\n", regularCount);
        System.out.printf("Premium: %d\n", premiumCount);

    }
}
