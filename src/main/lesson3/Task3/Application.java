
package main.lesson3.Task3;


public class Application {
    public static void main(String[] args) {
        Human valeriy = new Human("Валерий", 62, null, null);
        Human aleksandra = new Human("Александра", 61, null, null);
        Human ivan = new Human("Иван", 64, null, null);

        Human sergey = new Human("Сергей", 38, aleksandra, valeriy);
        Human marina = new Human("Марина", 36, null, ivan);

        Human vitaliy = new Human("Виталий", 8, marina, sergey);
        Human elena = new Human("Елена", 5, marina, sergey);

        elena.printGrandParents();

    }
}
