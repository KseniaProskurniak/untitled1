package lessons.lesson10.task4;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static final Properties PROPERTIES = new Properties();
    private static final String PROPERTIES_FILE_NAME = "src/main/java/lessons/lesson10/task4/application.properties";

    static {
        try {
            PROPERTIES.load(new FileReader(PROPERTIES_FILE_NAME));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T getProperty(String key, Class<T> cls) {
        String value = PROPERTIES.getProperty(key);
        if (String.class == cls) {
            return (T) value;
        }
        if (Integer.class == cls) {
            return (T) Integer.valueOf(value);
        }
        if (Double.class == cls) {
            return (T) Double.valueOf(value);
        }
        throw new IllegalArgumentException("Unsupported class: " + cls.getSimpleName());
    }
}
