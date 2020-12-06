package lessons.lesson11.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class FileHelperTest {

    String path = "src/main/java/lessons/lesson11/task4/persons.xlsx";

    @Test
    @DisplayName("Тестирование парсинга файла 1 листа")
    public void parseSheet1() throws IOException {
        String sheetName = "Persons1";
        List<Person> persons = FileHelper.getPersonsFromExcel(path, sheetName);
        Assertions.assertEquals(6, persons.size());
    }

    @Test
    @DisplayName("Тестирование парсинга файла 2 листа")
    public void parseSheet2() throws IOException {
        String sheetName = "Persons2";
        var persons = FileHelper.getPersonsFromExcel(path, sheetName);
        Assertions.assertEquals(5, persons.size());
    }

    @Test
    @DisplayName("Тестирование парсинга из несуществующего листа")
    public void parseNonExistingSheet() throws IOException {
        String sheetName = "Persons3";
        var persons = FileHelper.getPersonsFromExcel(path, sheetName);
        Assertions.assertEquals(null, persons);
    }

    @Test
    @DisplayName("Тестирование парсинга из несуществующего файла")
    public void parseNonExistingFile() throws IOException {
        String sheetName = "Persons1";
        var persons = FileHelper.getPersonsFromExcel(path + "x", sheetName);
        Assertions.assertEquals(null, persons);
    }
}
