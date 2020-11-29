package lessons.lesson4.task3.workers;

public class ServiceDesk {
    private static int ticketNumber = 1;

    public static void createTicket(String description) {
        System.out.printf("Заявка %d была создана: %s\n", ticketNumber, description);
        if (description.matches(".*(справо?к[аиу]|отчет|бюджет).*")) {
            Accountant.takeTicket(ticketNumber++);
        } else if (description.matches(".*(доставка|курьер[аыо]?в?).*")) {
            Logistical.takeTicket(ticketNumber++);
        }else if (description.matches(".*(компьютер|принтер|сервер).*")) {
            SysAdmin.takeTicket(ticketNumber++);
        } else if (description.matches(".*уборк[ауо]?к?.*")) {
            Cleaner.takeTicket(ticketNumber++);
        } else {
            System.out.printf("Специалист по выполнению заявки %d не найден\n", ticketNumber++);
        }
    }
}
