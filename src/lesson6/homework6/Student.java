package lesson6.homework6;

public class Student {
    // task 1 of class practice
    String nameStudent;
    String studyGroup;
    {
        studyGroup = "AN19";
    }
    int diplomaGrade;



    // task 2 of class practice
    public Student() {
    }

    public Student(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public Student(String nameStudent, String studyGroup) {
        this.nameStudent = nameStudent;
        this.studyGroup = studyGroup;
    }

    public Student(String nameStudent, String studyGroup, byte diplomaGrade) {
        this.nameStudent = nameStudent;
        this.studyGroup = studyGroup;
        this.diplomaGrade = diplomaGrade;
    }

    // task 3 of class practice
    void printInfoStudent() {
        System.out.println("Group " + studyGroup + " student " + nameStudent + " grade for diploma " + diplomaGrade);
    }


}
