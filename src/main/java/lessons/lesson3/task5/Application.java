package lessons.lesson3.task5;

public class Application {
    public static void main(String[] args) {
        Human[] humans = new Human[20];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();
        }
        for (int i = 0; i < humans.length - 1; i++) {
            boolean found = false;
            for (int j = i + 1; j < humans.length; j++) {
                if (humans[i].equals(humans[j])) {
                    if (!found) {
                        System.out.println(humans[i]);
                        found = true;
                    }
                    System.out.println(humans[j]);
                }
            }
            if (found) {
                System.out.println();
                found = false;
            }
        }
    }
}