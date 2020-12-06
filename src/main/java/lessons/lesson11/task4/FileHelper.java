package lessons.lesson11.task4;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class FileHelper {


    public static List<Person> getPersonsFromExcel(String path, String sheetName) throws IOException {
        FileInputStream file = null;
        try {
            file = new FileInputStream(new File(path));
        } catch (FileNotFoundException ex) {
            return null;
        }
        Workbook workbook = null;
        try {
            workbook = new XSSFWorkbook(file);
        } catch (IOException ex) {
            return null;
        }
        Sheet sheet = null;
        try {
            sheet = workbook.getSheet(sheetName);
        } catch (Exception ex) {
            return null;
        }

        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.printf("cell %s; value '%s'\n", cell.getAddress(), cell.getStringCellValue());
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        String path = "src/main/java/lessons/lesson11/task4/persons.xlsx";
        String sheetName = "Persons1";
        var xx = getPersonsFromExcel(path, sheetName);
    }
}
