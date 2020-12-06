package lessons.lesson11.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FileHelperTest {

    String path = "src/main/java/lessons/lesson11/task4/persons.xlsx";

    @Test
    @DisplayName("Тестирование парсинга файла 1 листа")
    public void parseSheet1() throws IOException {
        String sheetName = "Persons1";
        var persons = FileHelper.getPersonsFromExcel(path, sheetName);
        Assertions.assertEquals(6, persons.size());
    }

    @Test
    @DisplayName("Тестирование парсинга файла 2 листа")
    public void parseSheet2() throws IOException {
        String sheetName = "Persons2";
        var persons = FileHelper.getPersonsFromExcel(path, sheetName);
        Assertions.assertEquals(5, persons.size());
    }
}
