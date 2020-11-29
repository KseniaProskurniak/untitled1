package lessons.lesson8.task3;

public enum CompanyType {
    QIWI("ООО «Киви»"),
    ELEKSNET("ООО «Элекснет»"),
    TINKOFF("АО «Тинькофф»");

    private String title;

    CompanyType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
