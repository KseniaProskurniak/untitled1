package lessons.lesson2.Task4;

import java.util.Arrays;

public class SumString {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "world";

        char[] string1AsChars = first.toCharArray();
        Arrays.sort(string1AsChars);
        String result = " ";

        for (int i = 0; i < first.length(); i++) {
            char symbol = first.toCharArray()[i];
            if (result.contains(String.valueOf(symbol)))
                continue;
            for (int j = 0; j < second.length(); j++) {
                char symbol2 = second.toCharArray()[j];
                if (symbol == symbol2) {
                    result += symbol2;
                    break;
                }
            }
        }

        System.out.println(result);

    }
}


