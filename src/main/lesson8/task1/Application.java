package main.lesson8.task1;

import java.util.ArrayList;
import java.util.List;


public class Application {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            persons.add(new Person());
            //    System.out.println(persons.get(i));

        }
        for (Person p : persons) {
            System.out.printf("%s %s\n", p.getSurname(), p.getName());
        }
    }
}

