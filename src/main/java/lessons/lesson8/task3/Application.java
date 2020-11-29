package lessons.lesson8.task3;

public class Application {
    public static void main(String[] args) {
        QiwiTerminal qiwiTerminal = new QiwiTerminal("г. Москва, ул. Проходчиков, д.3");
        qiwiTerminal.upBalance("+79658795489", 999);
        qiwiTerminal.upBalance("+79658795489", 1001);
        EleksnetTerminal eleksnetTerminal1 = new EleksnetTerminal("г. Москва, Измайловский пр-т, 73/2");
        eleksnetTerminal1.upBalance("+79587963254", 299);
        eleksnetTerminal1.upBalance("+79587963254", 300);
        EleksnetTerminal eleksnetTerminal2 = new EleksnetTerminal("г. Москва, ул. Бакунинская, д.1");
        eleksnetTerminal2.upBalance("+79587963254", 299);
        eleksnetTerminal2.upBalance("+79587963254", 300);
        EleksnetTerminal eleksnetTerminal3 = new EleksnetTerminal("г. Новосибирск, ул. Героев-Десантников, д. 4");
        eleksnetTerminal3.upBalance("+79587963254", 299);
        eleksnetTerminal3.upBalance("+79587963254", 300);
        TinkoffTerminal tinkoffTerminal = new TinkoffTerminal("г. Москва, Ленинградский пр-т, д. 15");
        tinkoffTerminal.upBalance("+798799985623", 599);
        tinkoffTerminal.upBalance("+798799985623", 601);
    }
}
