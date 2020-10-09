package main.lesson5.task2;

public class Application {
    public static void main(String[] args) {
        Cat cat0 = new Cat("Мурзик", 2);
        Cat cat1 = new Cat("Барсик", 6);
        Cat cat3 = new Cat("Пушок", 5);
        Cat cat4 = new Cat("Леопольд", 4);
        Cat[] cats = new Cat[]{cat0, cat1, null, cat3, cat4};

        for (Cat cat : cats) {
            try {
                System.out.println(cat.toString());
            } catch (NullPointerException npe){
                System.out.println("Неккоректное значение");
                break;
            }


        }
    }
}
