package main.lesson4.task4;

public class Human {
    private String lastName;
    private String firstName;
    private int age;
    private Passport passport;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport value) {
        if (value.getSeries() != null && value.getNumber() != null) {
            this.passport = value;
            System.out.println("Паспорт успешно присвоен");
        } else {
            System.out.println("Серия или номер некорректны");
        }
    }

    public static class Builder {
        private Human newHuman;

        public Builder() {
            this.newHuman = new Human();
        }

        public Builder withFirstName(String name) {
            this.newHuman.firstName = name;
            return this;
        }

        public Builder withLastName(String value) {
            this.newHuman.setLastName(value);
            return this;
        }

        public Builder withAge(int value1) {
            this.newHuman.setAge(value1);
            return this;
        }

        public Builder withPassport(Passport value) {
            this.newHuman.setPassport(value);
            return this;
        }

        public Human build() {
            return newHuman;
        }
    }
}
