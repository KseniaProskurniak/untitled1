package main.lesson3.task3;

public class Human {
    String name;
    int age;
    Human[] parents = new Human[2];


    Human(String name, int age, Human mather, Human father) {
        this.name = name;
        this.age = age;
        this.parents[0] = mather;
        this.parents[1] = father;


    }

    public void printGrandParents() {
        for (Human parent : this.parents) {
            if (parent !=null)
            for (Human grandParent : parent.parents)
                if (grandParent !=null)
                    System.out.printf("%s (%d лет)%n", grandParent.name, grandParent.age);
        }


    }

}
