package lessons.lesson8.task3;

public class QiwiTerminal extends Terminal {
    public QiwiTerminal(String address) {
        super(address, CompanyType.QIWI, 7, 1000);
    }
}
