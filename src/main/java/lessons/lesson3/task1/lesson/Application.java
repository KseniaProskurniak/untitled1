package lessons.lesson3.task1.lesson;

public class Application {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Барсик";
        cat.age = 2;

        cat.move();


        Cat cat3 = new Cat();
        cat3.move();
    }
}

