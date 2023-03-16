package lesson9.classwork.schedule;

import java.time.LocalDate;

public class Lesson {

    private String lessonName;

    private String group;

    private LocalDate date;

    public Lesson(String lessonName, String group, LocalDate date) {
        this.lessonName = lessonName;
        this.group = group;
        this.date = date;
    }

    public String getLessonName() {
        return lessonName;
    }

    public String getGroup() {
        return group;
    }

    public LocalDate getLocalDate() {
        return date;
    }

    @Override
    public String toString() {
        return " " +
                "lessonName='" + lessonName + '\'' +
                ", group='" + group + '\'' +
                ", date=" + date ;
    }

}
