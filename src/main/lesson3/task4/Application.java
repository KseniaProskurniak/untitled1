package main.lesson3.task4;

public class Application {
    public static void main(String[] args) {

        Human2 sergey = new Human2("Сергей");
        Human2 mixail = new Human2("Михаил");
        Human2 aleksandr = new Human2("Александр");
        Human2 egor = new Human2("Егор");
        Human2 grigoriy = new Human2("Григорий");
        Human2 stanislav = new Human2("Станислав");
        Human2 valeriy = new Human2("Валерий");


        sergey.addFriend(valeriy);
        sergey.addFriend(grigoriy);
        mixail.addFriend(aleksandr);
        mixail.addFriend(stanislav);
        stanislav.addFriend(valeriy);
        grigoriy.addFriend(egor);
        egor.addFriend(aleksandr);

        System.out.println(areFriends(sergey, grigoriy));
        System.out.println(areFriends(sergey, aleksandr));
        System.out.println(areFriends(stanislav, mixail));
        System.out.println(areFriends(mixail, valeriy));

    }

    static boolean areFriends(Human2 first, Human2 second) {
        for (Human2 firstFriend : first.friends)
            if (firstFriend == second) return true;
        return false;

    }
}