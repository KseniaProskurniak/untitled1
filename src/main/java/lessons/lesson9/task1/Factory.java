package lessons.lesson9.task1;

import java.util.Random;

public class Factory {

    public static Car make() {
        int chance = new Random().nextInt(101);
        if (chance > 0 && chance <= 40)
            return new Renault();

        if (chance > 40 && chance <= 70)
            return new Nissan();

        if (chance > 70 && chance <= 90)
            return new Mitsubishi();

        return new Mercedes();
    }
}