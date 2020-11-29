package lessons.lesson6.task2;

import lessons.lesson6.task2.generators.HumanGenerator;

import java.util.HashSet;
import java.util.Set;

public class Application {
    private static final int MAX_HUMANS = 2000;

    public static void main(String[] args) {
        Set<Human> humans = new HashSet<>(MAX_HUMANS);
        for (int i = 0; i < MAX_HUMANS; i++) {
            Human human = HumanGenerator.generate();
            humans.add(human);
        }
        for (Human human : humans) {
            if (human.isAllPhoneNumbers()) {
                System.out.println(human);
            }
        }
    }
}
