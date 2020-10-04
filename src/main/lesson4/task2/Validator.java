package main.lesson4.task2;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Validator {
    private static final Pattern TWO_SPACES_PATTERN = Pattern.compile("^[^\\s]+\\s[^\\s]+\\s[^\\s]+$");

    public boolean checkTwoSpaces(String str) {
        boolean result = TWO_SPACES_PATTERN.matcher(str).matches();
        System.out.println(result);
        return result;
    }

    public String[] splitBySpaces(String str) {
        String[] result = str.split("\\s");
        System.out.println(Arrays.toString(result));
        return result;
    }

    public boolean validateHuman(Human human) {
        boolean result = human.getLastName() != null && human.getFirstName() != null && human.getBirthDate() != null;
        System.out.println(result);
        return result;
    }

    public boolean validateHumanArray(Human[] humans) {
        boolean result = true;
        for (Human human : humans) {
            if (human == null) {
                result = false;
                break;
            }
        }
        System.out.println(result);
        return result;
    }
}
