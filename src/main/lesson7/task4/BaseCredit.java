package main.lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class BaseCredit {
    protected double amount;
    protected double rate;
    protected int duration;


    public BaseCredit(double amount, double rate, int duration) {
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
    }

    public List<Double> getMonthPayments() {
        List<Double> result = new ArrayList<>(duration);
        double payment = amount / duration;
        for (int i = 0; i < duration; i++) {
            result.add(payment);
        }
        return result;
    }

    public double calculateOverpayment() {
        double sum = 0;
        for (Double d : getMonthPayments()) {
            sum += d;
        }
        return sum - amount;
    }

    @Override
    public String toString() {
        return "BaseCredit{" +
                "amount=" + amount +
                ", rate=" + rate +
                ", duration=" + duration +
                '}';
    }
}
