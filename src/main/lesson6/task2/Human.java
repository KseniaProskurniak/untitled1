package main.lesson6.task2;

import java.util.Map;

public class Human {
    private String lastName;
    private String firstName;
    private int age;
    private Map<PhoneType, String> phoneNumbers;

    public Human(String lastName, String firstName, int age, Map<PhoneType, String> phoneNumbers) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return String.format("Фамилия: %s, имя: %s, возраст: %d, телефоны: %s", lastName, firstName, age, phoneNumbers);
    }

    public boolean isAllPhoneNumbers() {
        return PhoneType.values().length == phoneNumbers.size();
    }


}
