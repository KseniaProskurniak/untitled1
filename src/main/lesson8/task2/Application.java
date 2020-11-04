package main.lesson8.task2;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        for (int i = 10; i <= 30; i++) {
            int count = 0;
            for (int j = 0; j < 100_000; j++) {
                List<Person> persons = new ArrayList<>(i);
                for (int k = 0; k < i; k++) {
                    persons.add(new Person());
                }
                if (matchBirthDate(persons)) {
                    count++;
                }
            }
            System.out.printf("%d: %.2f%%\n", i, count / 1000f);
        }
    }

    private static boolean matchBirthDate(List<Person> persons) {
        for (int i = 0; i < persons.size() - 1; i++) {
            for (int j = i + 1; j < persons.size(); j++) {
                if (persons.get(i).getBirthDate() == persons.get(j).getBirthDate()) {
                    return true;
                }
            }
        }
        return false;
    }
}

