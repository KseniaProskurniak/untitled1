package main.lesson6.task1;

public class Human {
    private String lastName;
    private String firstName;
    private int age;
    private String phoneNumber;

    public Human() {
        lastName = NameGenerator.generate();
        firstName = NameGenerator.generate();
        age = AgeGenerator.generate();
        phoneNumber = PhoneGenerator.generate();
    }

    @Override
    public String toString() {
        return String.format("%s %s, возраст %d, тел. %s", lastName, firstName, age, phoneNumber);
    }

    public boolean isBalsakAge() {
        return age == 35;
    }
}
