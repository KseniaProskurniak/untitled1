package lessons.lesson3.task4;

public class Human2 {
    String name;
    Human2[] friends = new Human2[3];

    Human2(String name) {
        this.name = name;
    }

    void addFriend(Human2 friend) {
        int index = 0;
        while (friends[index] != null) {
            if (friends[index] == friend) return;
            index++;
        }
        friends[index] = friend;
        friend.addFriend(this);
    }
}