package lessons.lesson5.task5;

import lessons.lesson5.task5.exeptions.*;

import java.util.ArrayList;
import java.util.List;

public class Passport {

    private static List<Passport> uniquePassport = new ArrayList<>();

    private String series;
    private String number;


    public Passport(String series, String number) throws PassportIllegalArgumentException, NullPointerException, PassportAlreadyExistsException {
        if (series == null)
            throw new PassportSeriesNullPointerException();
        if (number == null)
            throw new PassportNumberNullPointerException();
        if (!series.matches("^\\d{2}\\s\\d{2}$"))
            throw new PassportSeriesArgumentException();
        if (!number.matches("^\\d{6}$"))
            throw new PassportNumberArgumentException();
        for (Passport passport : uniquePassport)
            if (passport.series.equals(series) && passport.number.equals(number)) {
                throw new PassportAlreadyExistsException();
            }

        this.series = series;
        this.number = number;
        uniquePassport.add(this);
    }

}

