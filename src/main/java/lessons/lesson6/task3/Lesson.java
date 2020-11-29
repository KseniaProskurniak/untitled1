package lessons.lesson6.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Lesson {
    MATHS("Математика"),
    PHYSICS("Физика"),
    PROGRAMMING("Программирование"),
    HISTORY("История"),
    BIOLOGY("Биология"),
    GEOGRAPHY("География");

    private static Random random = new Random();

    private String description;

    Lesson(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

    public static List<Lesson> getGeneratedLessons() {
        int length = 4 + random.nextInt(3);
        List<Lesson> lessons = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            int count = Lesson.values().length;
            int ordinal = random.nextInt(count);
            Lesson lesson = getLessonByOrdinal(ordinal);
            lessons.add(lesson);
        }
        return lessons;
    }

    private static Lesson getLessonByOrdinal(int ordinal) {
        for (Lesson lesson : Lesson.values()) {
            if (lesson.ordinal() == ordinal) {
                return lesson;
            }
        }
        return null;
    }
}
