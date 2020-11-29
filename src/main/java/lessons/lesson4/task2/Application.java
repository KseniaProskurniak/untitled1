package lessons.lesson4.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) throws IOException, ParseException {
        Validator validator = new Validator();
        Human[] humans = new Human[3];
        int index = 0;

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите строку в формате [%s %s %s]:");
            String input = reader.readLine();

            if (!validator.checkTwoSpaces(input)) {
                continue;
            }
            String[] humanFields = validator.splitBySpaces(input);
            Human human = new Human();
            human.setLastName(humanFields[0]);
            human.setFirstName(humanFields[1]);
            human.setBirthDate(Human.DATE_FORMAT.parse(humanFields[2]));
            if (!validator.validateHuman(human)) {
                continue;
            }
            humans[index] = human;
            index++;
            System.out.println(Arrays.toString(humans));
            if (validator.validateHumanArray(humans)) {
                break;
            }
        }
    }
}
