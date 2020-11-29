package lessons.lesson10.task4;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        Passport passport = new Passport().generate();
        System.out.println(passport);

        Employee employee = new Employee().generate();
        System.out.println(employee);

        SalaryDocument salaryDocument = new SalaryDocument().generate();
        System.out.println(salaryDocument);
        salaryDocument.save();
    }
}
