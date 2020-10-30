package main.lesson8.task1;

import java.util.Random;

public class Person {
    private String Surname;
    private String Name;

    public String getSurname() {
        return Surname;
    }

    public String getName() {
        return Name;
    }

    public Person() {
        Surname = "Фамилия-" + (new Random().nextInt(20) + 1);
        Name = "Имя-" + (new Random().nextInt(20) + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!Surname.equals(person.Surname)) return false;
        return Name.equals(person.Name);
    }

    @Override
    public int hashCode() {
        int result = Surname.hashCode();
        result = 31 * result + Name.hashCode();
        return result;
    }
}
