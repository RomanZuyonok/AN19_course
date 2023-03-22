package lesson11.homeworks;

public class DeskMark {
    private String group;

    private int studentsGrade;

    private float sumGrade;

    public DeskMark() {
    }

    public DeskMark(String group, int studentsGrade, float sumGrade) {
        this.group = group;
        this.studentsGrade = studentsGrade;
        this.sumGrade = sumGrade;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getStudentsGrade() {
        return studentsGrade;
    }

    public void setStudentsGrade(int studentsGrade) {
        this.studentsGrade = studentsGrade;
    }

    public float getSumGrade() {
        return sumGrade;
    }

    public void setSumGrade(float sumGrade) {
        this.sumGrade = sumGrade;
    }

    @Override
    public String toString() {
        return "DeskMark{" +
                "group='" + group + '\'' +
                ", studentsGrade=" + studentsGrade +
                ", sumGrade=" + sumGrade +
                '}';
    }
}
