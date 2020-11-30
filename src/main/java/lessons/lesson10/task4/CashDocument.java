package lessons.lesson10.task4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CashDocument implements Generatable<CashDocument>, Save {
    private static final List<Double> NOMINALS;

    private UUID uuid;
    private SalaryDocument salaryDocument;
    private Map<Double, Long> nominalCount;

    static {
        NOMINALS = Stream.of(Config.getProperty("cash.nominals", String.class).split("\\s*,\\s*"))
                .map(String::trim)
                .filter(str -> str.matches("^\\d*(\\.\\d*)?$"))
                .map(Double::valueOf)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    @Override
    public CashDocument generate() {
        salaryDocument = DocumentQueue.FIFO.poll();
        if (salaryDocument == null) {
            return null;
        }
        uuid = UUID.randomUUID();
        nominalCount = new TreeMap<>();
        double amount = salaryDocument.getTotalSalary();
        for (Double nominal : NOMINALS) {
            long count = (long) (amount / nominal);
            nominalCount.put(nominal, count);
            amount -= count * nominal;
        }
        return this;
    }

    @Override
    public void save() throws IOException {
        String fileName = Config.getProperty("cash.output.file", String.class);
        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(toString());
        fileWriter.close();
    }

    @Override
    public String toString() {
        return "Заявка на выдачу средств из кассы.\n" +
                "uuid: " + uuid + "\n\n" +
                "Обоснование: Зарплатная ведомость " + salaryDocument.getUuid() + "\n\n" +
                "Время операции: " + salaryDocument.getOperationDate() + "." + "\n\n" +
                String.format("Сумма операции: %.2f\n", salaryDocument.getTotalSalary()) +
                nominalCount.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .map(entry -> String.format("%.2f - %d шт.", entry.getKey(), entry.getValue()))
                        .collect(Collectors.joining("\n"));
    }
}
