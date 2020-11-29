package lessons.lesson10.task2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static final Properties PROPERTIES = new Properties();
    public static File OUTPUT_FILE;
    public static Integer LINES_AMOUNT;
    public static Integer LINES_MIN_LENGTH;
    public static Integer LINES_MAX_LENGTH;
    public static String LINES_MESSAGE;
    public static String LINES_PATTERN;

    static {
        try {

            PROPERTIES.load(new FileReader("src/main/lesson10/task2/application.properties"));
            OUTPUT_FILE = new File(getProperty("output.file", null));
            LINES_AMOUNT = getIntegerProperty("lines.amount", 3);
            LINES_MIN_LENGTH = getIntegerProperty("lines.min.length", 1);
            LINES_MAX_LENGTH = getIntegerProperty("lines.max.length", 2);
            LINES_MESSAGE = getProperty("lines.message", "default");
            LINES_PATTERN = getProperty("lines.pattern", "default");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static String getProperty(String key, String defaultValue) {
        return PROPERTIES.getProperty(key, defaultValue);
    }

    private Boolean getBooleanProperty(String key, Boolean defaultValue) {
        return Boolean.parseBoolean(PROPERTIES.getProperty(key, defaultValue.toString()));
    }

    private static Integer getIntegerProperty(String key, Integer defaultValue) {
        return Integer.parseInt(PROPERTIES.getProperty(key, defaultValue.toString()));
    }
}
