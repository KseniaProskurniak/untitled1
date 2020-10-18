package main.lesson5.task4;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) throws AgeTooHighException {
        try {
            if (age < 0) {
                throw new AgeUnderZeroException();
            }
            if (age > 20) {
                throw new AgeTooHighException();
            }
        } catch (AgeUnderZeroException e) {
            String msg = e.getStackTrace()[0].toString();
            System.out.println("Error: " + msg);
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Возраст: %d", name, age);
    }
}
