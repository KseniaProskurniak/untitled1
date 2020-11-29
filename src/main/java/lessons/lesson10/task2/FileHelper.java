package lessons.lesson10.task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHelper {
   public static void write(List<String> content) throws IOException {
      FileWriter fileWriter = new FileWriter(Config.OUTPUT_FILE);
      StringBuilder stringBuilder = new StringBuilder();
      for (String line : content) {
         stringBuilder.append(line).append("\n");
      }
      fileWriter.write(stringBuilder.toString());
      fileWriter.close();
   }
}
