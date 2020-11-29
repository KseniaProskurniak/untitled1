package lessons.lesson10.task3;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        List<File> files = new FileGen().generate();
        for (File file : files) {
            System.out.printf("%s: %d%n", file.getName(), file.length());
        }
    }
}
