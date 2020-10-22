package main.lesson6.task4;

public class IdGenerator {

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

    private static String generateMilitaryId() {
        return " ";
    }

    private static String generateDiplomaticId() {
        return " ";
    }

    private static String generateForeignCitizenId() {
        return " ";
    }

    private static String generateCitizenId() {
        return " ";
    }

    private static String generateInternationId() {
        return " ";
    }
}
