package lessons.lesson4.task2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Human {
    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    private static final Pattern NAME_PATTERN = Pattern.compile("^[А-Я][а-я]{2,}$");

    private String lastName;
    private String firstName;
    private Date birthDate;

    @Override
    public String toString() {
        return "Human{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthDate=" + DATE_FORMAT.format(birthDate) +
                '}';
    }

    public void getPrint(String fieldName, String fieldValue) {
        System.out.println(String.format("Получено значение %s: %s", fieldName, fieldValue));
    }

    public void setCorrectPrint(String fieldName, String fieldValue) {
        System.out.println(String.format("Установлено корректное значение %s: %s", fieldName, fieldValue));
    }

    public void setIncorrectPrint(String fieldValue) {
        System.out.println(String.format("Введенное значение некорректно: %s", fieldValue));
    }

    public String getLastName() {
        getPrint("фамилии", lastName);
        return lastName;
    }

    public void setLastName(String lastName) {
        if (NAME_PATTERN.matcher(lastName).matches()) {
            this.lastName = lastName;
            setCorrectPrint("фамилии", lastName);
        } else {
            setIncorrectPrint(lastName);
        }

    }

    public String getFirstName() {
        getPrint("имени", firstName);
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (NAME_PATTERN.matcher(firstName).matches()) {
            this.firstName = firstName;
            setCorrectPrint("имени", firstName);
        } else {
            setIncorrectPrint(firstName);
        }
    }

    public Date getBirthDate() {
        String date = birthDate == null ? null : DATE_FORMAT.format(birthDate);
        getPrint("даты рождения", date);
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        Date now = new Date();
        String date = birthDate == null ? null : DATE_FORMAT.format(birthDate);
        if (birthDate != null && birthDate.before(now)) {
            this.birthDate = birthDate;
            setCorrectPrint("даты рождения", date);
        } else {
            setIncorrectPrint(date);
        }

    }
}
