package lessons.lesson6.task4;

public class Person {
    String surname;
    String name;
    IdentityDocument document;

    public static Person random() {
        Person p = new Person();
        p.surname = NameGenerator.generate();
        p.name = NameGenerator.generate();
        p.document = IdentityDocument.random();
        return p;
    }
}
