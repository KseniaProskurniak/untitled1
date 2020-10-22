package main.lesson6.task4;

import java.util.Random;

public class IdentityDocument {
    private IdentityDocumentType docType;
    private String seriesNumber;

    public IdentityDocument(IdentityDocumentType docType, String seriesNumber) {
        this.docType = docType;
        this.seriesNumber = seriesNumber;
    }

    public static IdentityDocument random() {
        IdentityDocumentType documentType = getRandomDocumentType();
        String seriesNumber = IdGenerator.generate(documentType);
        IdentityDocument doc = new IdentityDocument(documentType, seriesNumber);
        return doc;
    }

    private static IdentityDocumentType getRandomDocumentType() {
        int pick = new Random().nextInt(IdentityDocumentType.values().length);
        return IdentityDocumentType.values()[pick];
    }
}
