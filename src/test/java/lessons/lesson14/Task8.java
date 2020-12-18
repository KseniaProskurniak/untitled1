package lessons.lesson14;

import lessons.lesson14.helpers.JsonHelper;
import lessons.lesson14.model.Card;
import lessons.lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Task8 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework_task/lesson14/dataset.json");

    @Test
    public void countCards() {
        long total = 0L;
        for (Person person1 : persons) {
            for (Card card1 : person1.getCards()) {
                if (isCardActive(card1)) {
                    total++;
                }
            }
        }

        long visaTotal = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(this::isCardActive)
                .filter(card -> card.getType().equalsIgnoreCase("VISA"))
                .count();

        long mcTotal = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(this::isCardActive)
                .filter(card -> card.getType().equalsIgnoreCase("MasterCard"))
                .count();

        long mirTotal = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(this::isCardActive)
                .filter(card -> card.getType().equalsIgnoreCase("мир"))
                .count();

        System.out.println(total);
        System.out.println(visaTotal);
        System.out.println(mcTotal);
        System.out.println(mirTotal);

        Assertions.assertEquals(total, visaTotal + mirTotal + mcTotal);
    }

    private boolean isCardActive(Card card) {
        try {
            Date cardDate = new SimpleDateFormat("MM.yy").parse(card.getEndDateMonth() + "." + card.getEndDateYear());
            return cardDate.after(new Date());
        } catch (ParseException exception) {
            throw new RuntimeException();
        }
    }

}