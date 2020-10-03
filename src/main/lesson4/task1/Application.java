package main.lesson4.task1;

import java.text.ParseException;
import java.util.Date;

public class Application {

    public static void main(String[] args) throws ParseException {
        Human human = new Human();
        human.setLastName("Иванова");
        human.getLastName();
        human.setFirstName("Ася");
        human.getFirstName();
        Date date = Human.DATE_FORMAT.parse("01.10.2020");
        human.setBirthDate(date);
        human.getBirthDate();
        Human human1 = new Human();
        human1.setLastName("Ivanova");
        human1.getLastName();
        human1.setFirstName("acz");
        human1.getFirstName();
        Date date1 = Human.DATE_FORMAT.parse("01.10.2021");
        human1.setBirthDate(date1);
        human1.getBirthDate();
    }
}
