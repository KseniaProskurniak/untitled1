package lessons.lesson9.task4;

import java.util.List;

public class RoundRobinDistributor extends Distributor {
    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        Cooker chosenCooker = null;
        for (Cooker cooker : cookers) {
            if (chosenCooker == null) {
                chosenCooker = cooker;
                continue;
            }
            if (chosenCooker.getFoodCount() > cooker.getFoodCount()) {
                chosenCooker = cooker;
            }
        }
        return chosenCooker;

    }
}
