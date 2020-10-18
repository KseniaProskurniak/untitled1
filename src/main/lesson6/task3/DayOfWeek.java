package main.lesson6.task3;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота");

    private String description;

    DayOfWeek(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
