package main.lesson2.Task7;

public class Age1 {

    public static void main(String[] args) {
        Age1 example = new Age1();
        System.out.println(example.getAgeDescription(32));
        System.out.println(example.getAgeDescription(52));
        System.out.println(example.getAgeDescription(66));
        System.out.println(example.getAgeDescription(82));
        System.out.println(example.getAgeDescription(25));
        System.out.println(example.getAgeDescription(44));
        System.out.println(example.getAgeDescription(60));
        System.out.println(example.getAgeDescription(75));
        System.out.println(example.getAgeDescription(22));
        System.out.println(example.getAgeDescription(119));
    }

    String getAgeDescription(int age) {
        String value = "";
        if (age >= 25 && age < 44) {
            value = age + " - " + "молодой возраст";
        } else if (age >= 44 && age < 60) {
            value = age + " - " + "средний возраст";
        } else if (age >= 60 && age < 75) {
            value = age + " - " + "пожилой возраст";
        } else if (age >= 75 && age < 90) {
            value = age + " - " + "старческий возраст";
        } else {
            value = age + " - " + "неизвестный возраст";
        }
        return value;
    }
}
