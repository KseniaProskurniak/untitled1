package main.lesson6.task2.generators;


import main.lesson6.task2.Chance;
import main.lesson6.task2.Human;
import main.lesson6.task2.PhoneType;

import java.util.HashMap;
import java.util.Map;

public class HumanGenerator {
    public static Human generate() {
        String lastName = NameGenerator.generate();
        String firstName = NameGenerator.generate();
        int age = AgeGenerator.generate();
        Map<PhoneType, String> phoneNumbers = new HashMap<>();
        for (PhoneType type : PhoneType.values()) {
            if (Chance.calculateChance(20)) {
                String number = PhoneGenerator.generate();
                phoneNumbers.put(type, number);
            }
        }
        return new Human(lastName, firstName, age, phoneNumbers);
    }

}
