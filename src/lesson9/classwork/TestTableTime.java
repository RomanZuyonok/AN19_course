package lesson9.classwork;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class TestTableTime {
    public static void main(String[] args) {

        University university = new University();

        LocalDate localDate = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        try {

            university.getTimeTable("Oleg", localDate);
        }
        catch (NullPointerException exception){
            System.out.println("Something went wrong!!!");
        }
        finally {

            university.printStudent();

            university.printTableLesson();

        }

    }
}
