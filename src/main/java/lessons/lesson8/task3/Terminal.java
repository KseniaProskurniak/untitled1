package lessons.lesson8.task3;

public abstract class Terminal implements TopUpBalance {
    protected String address;
    protected CompanyType owner;
    protected double tax;
    protected double taxFree;

    public Terminal(String address, CompanyType owner, double tax, double taxFree) {
        this.address = address;
        this.owner = owner;
        this.tax = tax;
        this.taxFree = taxFree;
    }

    @Override
    public void upBalance(String phoneNumber, double amount) {
        double amountWithTax = amount;
        if (amount < taxFree) {
            amountWithTax -= amount * tax / 100;
        }
        System.out.printf("Внесена сумма %.2f для пополнения телефона %s. Баланс пополнен на сумму %.2f. " +
                "С уважением, ваш %s, %s\n", amount, phoneNumber, amountWithTax, owner.getTitle(), address);
    }
}
