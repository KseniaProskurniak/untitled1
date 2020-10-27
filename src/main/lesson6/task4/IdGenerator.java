package main.lesson6.task4;

import java.util.Random;

public class IdGenerator {

    private static final String DIGITS = "0123456789";
    private static final String RUSSIAN_CAPITALS = "ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
    private static final String LATIN_CAPITALS = "QAZXSWEDCVFRTGBNHYUJMKILOP";

    public static String generate(IdentityDocumentType docType) {

        switch (docType) {
            case MILITARY_ID:
                return generateMilitaryId();
            case CITIZEN_ID:
                return generateCitizenId();
            case DIPLOMATIC_ID:
                return generateDiplomaticId();
            case INTERNATION_ID:
                return generateInternationId();
            default:
                return generateForeignCitizenId();
        }

    }

    private static String generateString(String pattern, int length) {
        char[] patternArray = pattern.toCharArray();
        String result = "";
        for (int i = 0; i < length; i++) {
            int index = new Random().nextInt(patternArray.length);
            result += patternArray[index];
        }
        return result;
    }

    private static String generateStringOrEmpty(String pattern, int length) {
        char[] patternArray = pattern.toCharArray();
        String result = "";
        for (int i = 0; i < length; i++) {
            int index = new Random().nextInt(patternArray.length);
            if (index % 2 == 0) {
                result += patternArray[index];
            }

        }
        return result;
    }

    private static String generateMilitaryId() {
        return generateString(RUSSIAN_CAPITALS, 2) + " " + generateStringOrEmpty(DIGITS, 1)
                + generateString(DIGITS, 6);
    }

    private static String generateDiplomaticId() {
        return generateString(DIGITS, 2) + " " + generateString(DIGITS, 7);
    }

    private static String generateForeignCitizenId() {
        return generateStringOrEmpty(LATIN_CAPITALS + DIGITS, 25);
    }

    private static String generateCitizenId() {
        return generateString(DIGITS, 2) + " " + generateString(DIGITS, 2) + " " +
                generateString(DIGITS, 6);
    }

    private static String generateInternationId() {
        return generateString(DIGITS, 2) + " " + generateString(DIGITS, 6);
    }
}
