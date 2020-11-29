package lessons.lesson10.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileHelper {
    public static final Object EMPTY_ARRAY = new Object() {
        @Override
        public String toString() {
            return "[]";
        }
    };

    public static Map<String, Object> readFile(File file) throws IOException {
        List<String> content = Files.readAllLines(file.toPath());
        Map<String, Object> result = new HashMap<>();
        for (String pair : content) {
            String[] property = pair.split("=");
            String key = null;
            Object value = null;
            if (property.length >= 1 && !property[0].isBlank()) {
                key = property[0].strip();
                if (property.length == 2) {
                    value = parse(property[1]);
                } else {
                    value = EMPTY_ARRAY;
                }
            }
            if (key != null && !key.isBlank()) {
                result.put(key, value);
            }
        }
        return result;
    }

    public static void saveFile(File file, Map<String, Object> map) throws IOException {
        StringBuilder sb = new StringBuilder("{\n");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue() instanceof String ? "\"" + entry.getValue() + "\"" : entry.getValue();
            String property = String.format("\t\"%s\": %s\n", entry.getKey(), value);
            sb.append(property);
        }
        sb.append("}\n");
        FileWriter writer = new FileWriter(file);
        writer.write(sb.toString());
        writer.close();
    }

    private static Object parse(String value) {
        value = value.strip();
        if (value.equals("null")) {
            return null;
        }
        if (value.equals("true")) {
            return true;
        }
        if (value.equals("false")) {
            return false;
        }
        if (value.matches("^\\d+$")) {
            return Long.parseLong(value);
        }
        if (value.matches("^\\d+\\.\\d+$")) {
            return Double.parseDouble(value);
        }
        return value;
    }
}