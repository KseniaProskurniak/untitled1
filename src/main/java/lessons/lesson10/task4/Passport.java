package lessons.lesson10.task4;

public class Passport implements Generatable<Passport> {
    private static final String DIGITS = "0123456789";

    private String series;
    private String number;

    @Override
    public Passport generate() {
        int seriesLength = Config.getProperty("passport.series.digits", Integer.class);
        int numberLength = Config.getProperty("passport.number.digits", Integer.class);
        series = StringGenerator.generate(seriesLength, DIGITS);
        number = StringGenerator.generate(numberLength, DIGITS);
        return this;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return series + " " + number;
    }
}
