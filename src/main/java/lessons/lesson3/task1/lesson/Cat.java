package lessons.lesson3.task1.lesson;

public class Cat {
   String name;
   int age;

    Cat(){
       name ="Безымянный кот";
       age = 24;
   }


   void voice (){
       System.out.println("Мяу");
   }

    void move (){
        System.out.println( name + " " + "пошёл гулять");
    }

}

