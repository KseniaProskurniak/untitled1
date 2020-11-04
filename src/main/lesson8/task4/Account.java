package main.lesson8.task4;

public class Account extends Entity {
    private String accountNumber;

    public Account(String name, String accountNumber) {
        super(name);
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Account client = (Account) o;

        return accountNumber.equals(client.accountNumber);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + accountNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
