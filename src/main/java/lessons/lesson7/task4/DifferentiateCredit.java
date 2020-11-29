package lessons.lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class DifferentiateCredit extends BaseCredit {
    private List<Double> monthPayments;

    public DifferentiateCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
    public List<Double> getMonthPayments() {
        if (monthPayments != null) {
            return monthPayments;
        }
        List<Double> result = new ArrayList<>(duration);
        double amountRest = amount;
        double amountMonth = amount / duration;
        for (int i = 0; i < duration; i++) {
            double payment = amountMonth + amountRest * rate / 12 / 100;
            result.add(payment);
            amountRest -= amountMonth;
        }
        monthPayments = result;
        return result;
    }


}
