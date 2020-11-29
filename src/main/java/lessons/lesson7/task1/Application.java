package lessons.lesson7.task1;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> list1 = new MyArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(0, 3);
        list1.contains(4);
        list1.contains(25);
        list1.size();
        list1.get(-1);
    }
}


