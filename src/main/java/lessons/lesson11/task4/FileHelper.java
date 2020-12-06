package lessons.lesson11.task4;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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
        sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
            return null;
        }

        ArrayList<Person> persons = new ArrayList<>();
        for (Row row : sheet) {
            try {
                Person person = new Person();
                person.setFirstName(row.getCell(0).getStringCellValue());
                person.setLastName(row.getCell(1).getStringCellValue());
                person.setPatronymic(row.getCell(2).getStringCellValue());
                SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
                String dateInString = row.getCell(3).getStringCellValue();
                Date date = formatter.parse(dateInString);
                person.setBirthDate(date);
                Passport passport = new Passport();
                passport.setSeries(row.getCell(4).getStringCellValue());
                passport.setNumber(row.getCell(5).getStringCellValue());
                person.setPassport((passport));
                persons.add(person);
            } catch (Exception ex) {
                System.out.println("Ошибка парсинга строки " + row.getRowNum() + ": " + ex.getMessage());
            }
        }
        return persons;
    }
}
