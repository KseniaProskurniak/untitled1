package main.lesson5.task5;

import main.lesson5.task5.exeptions.*;

public class Application {
    public static void main(String[] args) {
        createPassport(null, "123456");
        createPassport("1234", null);
        createPassport("123", "125479");
        createPassport("1234", "125");

    }

    public static Passport createPassport(String series, String number) {
        try {
            Passport pasport = new Passport(series, number);
            return pasport;

        } catch (PassportSeriesArgumentException |
                PassportNumberArgumentException |
                PassportSeriesNullPointerException |
                PassportNumberNullPointerException exeption) {
            System.out.println("Введите верные значения серии и номера паспорта");

            return null;
        } catch (PassportAlreadyExistsException pae) {
            System.out.println("Данные серия и номер паспорта уже существуют");
            return null;
        }

    }
}
