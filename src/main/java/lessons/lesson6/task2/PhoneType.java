package lessons.lesson6.task2;

public enum PhoneType {
    HOME("Домашний"),
    WORK("Рабочий"),
    MOBILE("Мобильный");

    private String typeName;

    PhoneType(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return typeName;
    }
}
