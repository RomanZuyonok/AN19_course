package lesson11;

import lesson11.homeworks.DeskMark;
import lesson11.homeworks.Group;
import lesson11.homeworks.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Araminta", "01", 8.0f));
        students.add(new Student("Olivia", "01", 9.0f));
        students.add(new Student("Emma", "01", 5.0f));
        students.add(new Student("Charlotte", "01", 6.0f));
        students.add(new Student("Elijah", "01", 3.0f));
        students.add(new Student("Noah", "01", 8.0f));
        students.add(new Student("Anna", "02", 9.0f));
        students.add(new Student("Olivia", "02", 3.0f));
        students.add(new Student("Grate", "02", 8.0f));
        students.add(new Student("Amelia", "02", 7.0f));
        students.add(new Student("Lion", "03", 6.0f));
        students.add(new Student("Maya", "03", 8.0f));
        students.add(new Student("Greg", "03", 7.0f));
        students.add(new Student("Mayk", "03", 4.0f));
        students.add(new Student("Brain", "04", 5.0f));
        students.add(new Student("Jul", "04", 9.0f));

        List<DeskMark> deskMarksList = new ArrayList<>();

        List<Group> groups = new ArrayList<>();


        for (int i = 0; i < students.size(); i++) {
            DeskMark deskMark = getByGroup(deskMarksList, students.get(i).getGroup());

            if (deskMark == null) {
                DeskMark newDeskMark = new DeskMark(students.get(i).getGroup(), 1, students.get(i).getMark());
                deskMarksList.add(newDeskMark);
            } else {
                int currentAmount = deskMark.getStudentsGrade();
                float currentMark = deskMark.getSumGrade();
                deskMark.setStudentsGrade(currentAmount + 1);
                deskMark.setSumGrade(currentMark + students.get(i).getMark());
            }
        }

        float minAvg = Float.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < deskMarksList.size(); i++) {
            float currentAvg = deskMarksList.get(i).getSumGrade() / deskMarksList.get(i).getStudentsGrade();
            if (currentAvg < minAvg) {
                minAvg = currentAvg;
                minIndex = i;
            }
        }

        String minGroup = deskMarksList.get(minIndex).getGroup();

        for (Student student : students
        ) {
            if (student.getGroup().equals(minGroup)) {
                System.out.println(student);
            }

        }

        findPrintMaks(students, 8);

// part 3 min number of students

        for (int i = 0; i < students.size(); i++) {
            Group group = getGroup(groups, students.get(i).getGroup());

            if (group == null) {
                Group newGroup = new Group(students.get(i).getGroup(), 1);
                groups.add(newGroup);
            } else {
                int currentStudent = group.getNumberStudents();
                group.setNumberStudents(currentStudent + 1);
            }
        }

        float minStudent = Integer.MAX_VALUE;
        int indexMin = -1;

        for (int i = 0; i < groups.size(); i++) {
            int currentStudent = groups.get(i).getNumberStudents();
            if (currentStudent < minAvg) {
                minAvg = currentStudent;
                minIndex = i;
            }
        }

        System.out.println("Min number of students in a group N" + groups.get(minIndex).getNumberGroup() +
                " the number of students is = " + groups.get(minIndex).getNumberStudents() + " per");
    }

    private static DeskMark getByGroup(List<DeskMark> deskMarkList, String group) {
        for (DeskMark deskMark : deskMarkList
        ) {
            if (deskMark.getGroup().equals(group)) {
                return deskMark;
            }
        }
        return null;
    }

    private static Group getGroup(List<Group> groupList, String group) {
        for (Group group1 : groupList
        ) {
            if (group1.getNumberGroup().equals(group)) {
                return group1;
            }
        }
        return null;
    }

    private static void findPrintMaks(List<Student> students, int marks) {
        if (students != null && marks > 0 && marks < 11) {
            System.out.println("Students:");
            for (Student student : students
            ) {
                if (student.getMark() >= marks) {
                    System.out.println(student.getName() + " = " + student.getMark());
                }
            }
        }

    }

    private static void minGroup(List<Student> students) {
        int min = 1;
        int counter = 0;
        String group = students.get(0).getGroup();
        for (int i = 0; i < students.size(); i++) {
            if (group.equals(students.get(i).getGroup())) {
                counter += 1;
                if (min > counter) {
                    min = counter;

                }
            }

        }

    }

}
