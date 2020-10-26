package main.lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class AnnuityCredit extends BaseCredit {
    private List<Double> monthPayments;

    public AnnuityCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
    public List<Double> getMonthPayments() {
        if (monthPayments != null) {
            return monthPayments;
        }
        List<Double> result = new ArrayList<>(duration);
        double monthRate = rate / 12 / 100;
        double payment = amount * monthRate * Math.pow(monthRate + 1, duration) / (Math.pow(monthRate + 1, duration) - 1);
        for (int i = 0; i < duration; i++) {
            result.add(payment);
        }
        monthPayments = result;
        return result;
    }
}
