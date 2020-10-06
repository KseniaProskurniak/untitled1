package main.lesson4.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passport {
    private String series;
    private String number;

    public String getSeries() {
        return series;
    }

    public Passport setSeries(String series) {
        String regex = "^\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(series);

        if (matcher.matches()) {
            this.series = series;

        } else {
            System.out.println("Серия паспорта некорректна " + series);
        }
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Passport setNumber(String number) {
        String regex = "^\\d{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            this.number = number;
        } else {
            System.out.println("Номер паспорта некорректен " + number);
        }

        return this;
    }

    public static class Builder{
        Passport newPassport;
        static Passport[] passports = new Passport[100];
        int itemsCount = 0;

        public Builder() {
            this.newPassport = new Passport();
        }
        public Builder withSeries(String value){
            this.newPassport.setSeries(value);
            return this;
        }
        public Builder withNumber(String value){
            this.newPassport.setNumber(value);
            return this;
        }
        public Passport build(){
            // если есть номер и серия у паспорта, который сейчас будем возвращать, то проверяем по ранее созданным паспортам на совпадение
            if (this.newPassport.getNumber() != null || this.newPassport.getSeries() != null) {
                for (Passport passport : passports) {
                    if (passport == null)
                        break;
                    if (passport.getSeries() == this.newPassport.getSeries() && passport.getNumber() == newPassport.getNumber()) {
                        System.out.println("Серия и номер паспорта не уникальны");
                        return  null;
                    }
                }
            }
            passports[itemsCount] = this.newPassport;
            itemsCount++;
            return this.newPassport;
        }
    }

}