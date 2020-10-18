package main.lesson6.task3;

import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Scholar scholar = new Scholar();
        Map<DayOfWeek, List<Lesson>> diary = scholar.getDiary();
        for (DayOfWeek day : DayOfWeek.values()) {
            diary.put(day, Lesson.getGeneratedLessons());
        }
        System.out.println(scholar);
    }
}
