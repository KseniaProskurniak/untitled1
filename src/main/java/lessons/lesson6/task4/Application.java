package lessons.lesson6.task4;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        System.out.println(IdGenerator.generate(IdentityDocumentType.CITIZEN_ID));
        System.out.println(IdGenerator.generate(IdentityDocumentType.INTERNATION_ID));
        System.out.println(IdGenerator.generate(IdentityDocumentType.DIPLOMATIC_ID));

        List<Person> persons = new ArrayList<>();
        TreeMap<IdentityDocumentType, Integer> grouper = new TreeMap<>(
                new Comparator<IdentityDocumentType>() {
                    @Override
                    public int compare(IdentityDocumentType o1, IdentityDocumentType o2) {
                        return o2.getCode().compareTo(o1.getCode());
                    }
                });

        for (int i = 0; i < 500; i++) {
            Person p = Person.random();
            persons.add(p);
            Integer counter = grouper.get(p.document.getDocType());
            if (counter == null)
                counter = 0;
            grouper.put(p.document.getDocType(), counter + 1);
        }

        Set<Map.Entry<IdentityDocumentType, Integer>> entries = grouper.entrySet();
        for (Map.Entry<IdentityDocumentType, Integer> row : entries) {
            System.out.printf("%s (%s): %d\n", row.getKey().getTitle(), row.getKey().getCode(), row.getValue());
        }

//persons.removeIf(person -> person.document.getDocType().getCode() != "21");
        for (Iterator<Person> iterator = persons.iterator(); iterator.hasNext(); ) {
            if (iterator.next().document.getDocType().getCode() != "21")
                iterator.remove();
        }

        for (Person p : persons) {
            System.out.printf("%s %s (%s)\n", p.name, p.surname, p.document.getDocType().getCode());
        }

    }

}
