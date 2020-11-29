package lessons.lesson10.task1;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Application {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("src/main/lesson10/task1/input.txt");
        Map<String, Object> map = FileHelper.readFile(inputFile);
        System.out.println(map);
        File outputFile = new File("src/main/lesson10/task1/output.txt");
        FileHelper.saveFile(outputFile, map);
    }
}
