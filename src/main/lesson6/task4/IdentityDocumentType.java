package main.lesson6.task4;

public enum IdentityDocumentType {
    MILITARY_ID("07", "Военный билет"),
    DIPLOMATIC_ID("09", "Дипломатический паспорт"),
    FOREIGN_CITIZEN_ID("10", "Паспорт иностранного гражданина"),
    CITIZEN_ID("21", "Паспорт гражданина Российской Федерации"),
    INTERNATION_ID("22", "Загранпаспорт гражданина Российской Федерации");

    private String code;
    private String title;

    IdentityDocumentType(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

}

