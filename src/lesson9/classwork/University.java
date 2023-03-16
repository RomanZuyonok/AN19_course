package lesson9.classwork;
import lesson9.classwork.schedule.Lesson;
import lesson9.classwork.studentteacher.Student;
import lesson9.classwork.studentteacher.Teacher;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;

public class University {
    private LocalDate localDate = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();


    private Teacher[] teachers = {new Teacher("Sergey", "Teacher1", "Mathematics"),
            new Teacher("Anna", "Teacher2", "English"),
            new Teacher("Irina", "Teacher3", "Chemistry"),
            new Teacher("Dmitriy", "Teacher4", "Computer science")
    };

    private Lesson[] tableLesson = {new Lesson("Mathematics", "417", localDate),
            new Lesson("English", "427", localDate),
            new Lesson("Chemistry", "427", localDate),
            new Lesson("Computer science", "417", localDate)};


    private Student[] students = {new Student("Ivan", "Student1", "417"),
            new Student("Oleg", "Student2", "417"),
            new Student("Dima", "Student3", "417"),
            new Student("Vasya", "Student3", "427")};


    public void getTimeTable(String name, LocalDate date) throws NullPointerException {
        if (name != null && date != null) {
            String groupTemp = null;
            for (int i = 0; i < students.length; i++) {
                if (students[i].getName().equals(name)) {
                    groupTemp = students[i].getGroup();
                }
            }
            if (groupTemp != null) {
                System.out.println("Student: " + name + " lessons " + date);
                for (int i = 0; i < tableLesson.length; i++) {
                    if (tableLesson[i].getGroup().equals(groupTemp) && tableLesson[i].getLocalDate().equals(date)) {
                        for (int j = 0; j < teachers.length; j++) {
                            if (tableLesson[i].getLessonName().equals(teachers[j].getSubject())) {
                                System.out.println("-> " + tableLesson[i].getLessonName() + " teacher names: " + teachers[j].getName() + " " + teachers[j].getSurname());
                            }
                        }

                    }
                }
            } else {
                System.out.println("No such student!");
            }
        } else {
            System.out.println("Incomplete information!!!");
        }
    }

    public void printStudent() {
        System.out.println(Arrays.toString(students));

    }

    public void printTableLesson() {
        System.out.print(Arrays.toString(tableLesson));

    }

}
