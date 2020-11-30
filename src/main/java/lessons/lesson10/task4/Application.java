package lessons.lesson10.task4;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 5; i++) {
            SalaryDocument salaryDocument = new SalaryDocument().generate();
            salaryDocument.save();
            DocumentQueue.FIFO.offer(salaryDocument);
        }
        while (true) {
            CashDocument cashDocument = new CashDocument().generate();
            if (cashDocument == null) {
                break;
            }
            cashDocument.save();
            System.out.println(cashDocument);
            System.out.println();
        }
    }
}
