package lessons.lesson10.task4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class SalaryDocument implements Generatable<SalaryDocument>, Save {
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT;

    private UUID uuid;
    private String operationDate;
    private List<Employee> employees;
    private double totalSalary;

    static {
        String format = Config.getProperty("salary.date.format", String.class);
        SIMPLE_DATE_FORMAT = new SimpleDateFormat(format);
    }

    @Override
    public SalaryDocument generate() {
        uuid = UUID.randomUUID();
        Date date = Date.from(Instant.now().plus(Duration.ofDays(1)));
        operationDate = SIMPLE_DATE_FORMAT.format(date);
        int employeeCount = Config.getProperty("salary.employee.count", Integer.class);
        employees = new ArrayList<>(employeeCount);
        totalSalary = 0;
        for (int i = 0; i < employeeCount; i++) {
            Employee employee = new Employee().generate();
            employees.add(employee);
            totalSalary += employee.getSalary();
        }
        return this;
    }

    @Override
    public void save() throws IOException {
        String fileName = Config.getProperty("salary.output.file", String.class);
        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(toString());
        fileWriter.close();
    }

    @Override
    public String toString() {
        return "Зарплатная ведомость\n" +
                "uuid: " + uuid + "\n\n" +
                "Время операции: " + operationDate + "." + "\n\n" +
                "Список сотрудников:\n" +
                employees.stream()
                        .map(Employee::toString)
                        .collect(Collectors.joining("\n")) + "\n" +
                String.format("Общая сумма: %.2f", totalSalary);
    }
}
