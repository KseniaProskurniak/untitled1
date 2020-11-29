package lessons.lesson7.task4;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        BaseCredit baseCredit = new BaseCredit(300_000d, 16.9d, 12);
        List<Double> basePayments = baseCredit.getMonthPayments();
        DifferentiateCredit differentiateCredit = new DifferentiateCredit(300_000d, 16.9d, 12);
        List<Double> diffPayments = differentiateCredit.getMonthPayments();
        AnnuityCredit annuityCredit = new AnnuityCredit(300_000d, 16.9d, 12);
        List<Double> annuityPayments = annuityCredit.getMonthPayments();

        System.out.println("Вывод графика платежей:");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%d: %.2f %.2f %.2f\n", i + 1, basePayments.get(i), diffPayments.get(i), annuityPayments.get(i));
        }

        System.out.println();
        System.out.println("Переплата по типам кредита:");
        System.out.printf("%.2f %.2f %.2f\n", baseCredit.calculateOverpayment(),
                differentiateCredit.calculateOverpayment(), annuityCredit.calculateOverpayment());

    }
}
