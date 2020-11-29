package lessons.lesson6.task3;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Scholar {
    private Map<DayOfWeek, List<Lesson>> diary = new TreeMap<>();

    public Map<DayOfWeek, List<Lesson>> getDiary() {
        return diary;
    }

    @Override
    public String
    toString() {
        String result = "";
        for (Map.Entry<DayOfWeek, List<Lesson>> entry : diary.entrySet()) {
            result += String.format("%s: %s\n", entry.getKey(), entry.getValue());
        }
        return result;
    }
}
