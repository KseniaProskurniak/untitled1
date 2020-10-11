package main.lesson6.task1;


import java.util.ArrayList;
import java.util.List;

public class Application {
    private static final int MAX_HUMANS = 500;

    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>(MAX_HUMANS);
        for (int i = 0; i < MAX_HUMANS; i++) {
            Human human = new Human();
            humans.add(human);
        }
        for (Human human : humans) {
            if (human.isBalsakAge()) {
                System.out.println(human);
            }
        }
    }
}
