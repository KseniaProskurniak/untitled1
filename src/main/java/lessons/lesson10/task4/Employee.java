package lessons.lesson10.task4;

import java.util.concurrent.ThreadLocalRandom;

public class Employee implements Generatable<Employee> {
    private String firstName;
    private String lastName;
    private Passport passport;
    private double salary;

    @Override
    public Employee generate() {
        String namePattern = Config.getProperty("employee.name.pattern", String.class);
        int firstNameLength = Config.getProperty("employee.firstname.length", Integer.class);
        int lastNameLength = Config.getProperty("employee.lastname.length", Integer.class);
        firstName = StringGenerator.generate(firstNameLength, namePattern);
        lastName = StringGenerator.generate(lastNameLength, namePattern);
        passport = new Passport().generate();
        double salaryMin = Config.getProperty("employee.salary.min", Double.class);
        double salaryMax = Config.getProperty("employee.salary.max", Double.class);
        salary = ThreadLocalRandom.current().nextDouble(salaryMin, salaryMax);
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Passport getPassport() {
        return passport;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s, %.2f", lastName, firstName, passport, salary);
    }
}
