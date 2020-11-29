package lessons.lesson4.task4;

public class Application {
    public static void main(String[] args) {
        Passport passport = new Passport().setSeries("4569").setNumber("417896");

        Passport passport2 = new Passport.Builder().withSeries("4569").withNumber("417896").build();
        System.out.println(passport2 != null ? passport2.getSeries() : "null");

        Passport passport3 = new Passport.Builder().withSeries("4569").withNumber("417896").build();
        System.out.println(passport3 != null ? passport3.getSeries() : "null");

        Passport passport4 = new Passport.Builder().withSeries("4569").withNumber("").build();
        Human human1 = new Human.Builder().withFirstName("Вася").withPassport(passport4).build();
        Human human2 = new Human.Builder().withFirstName("Петя").withPassport(passport2).build();
    }
}
