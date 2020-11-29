package lessons.lesson8.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Application {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            persons.add(new Person());
            //    System.out.println(persons.get(i));

        }

        Set<Person> duplicates = new HashSet<>();
        for (int i = 0; i < persons.size(); i++) {
            for (int j = i + 1; j < persons.size(); j++) {
                Person first = persons.get(i);
                Person second = persons.get(j);
                if (first.equals(second)) duplicates.add(first);
            }
        }
        System.out.println("Люди с уникальными именем и фамилией:");

        for (Person p : duplicates) {
            System.out.printf("%s %s\n", p.getSurname(), p.getName());
        }

        System.out.println();

        Set<Person> persons2 = new HashSet<>();
        for (int i = 0; i < 2000; i++) {
            persons2.add(new Person());
        }
        System.out.println("Число элементов : " + persons2.size());
    }


}


