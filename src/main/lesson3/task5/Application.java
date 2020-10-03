/*package main.lesson3.task5;

public class Application {
    public static void main(String[] args) {
        Human3[] humans = new Human3[20];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human3();
        }

        for (Human3 human : humans) {
            for (Human3 otherHuman : humans) {
                if (human != otherHuman && human.cats.length == otherHuman.cats.length && human.dogs.length == otherHuman.dogs.length)
                    System.out.printf("%s: %d кошек, %d собак%n", human.nameHuman, human.cats.length, human.dogs.length);
            }
        }
    }

}

*/