package main.lesson9.task4;

import java.util.List;

public class BusyTimeDistributor extends Distributor {

    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        Cooker chosenCooker = null;
        for (Cooker cooker : cookers) {
            if (chosenCooker == null) {
                chosenCooker = cooker;
                continue;
            }
            if (chosenCooker.getTotalTime() > cooker.getTotalTime()) {
                chosenCooker = cooker;
            }
        }
        return chosenCooker;
    }
}
