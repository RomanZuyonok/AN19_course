package lesson11.homeworks;

public class Group {
    private String numberGroup;

    private int numberStudents;

    public Group() {
    }

    public Group(String numberGroup, int numberStudents) {
        this.numberGroup = numberGroup;
        this.numberStudents = numberStudents;
    }

    public String getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(String numberGroup) {
        this.numberGroup = numberGroup;
    }

    public int getNumberStudents() {
        return numberStudents;
    }

    public void setNumberStudents(int numberStudents) {
        this.numberStudents = numberStudents;
    }

    @Override
    public String toString() {
        return "Group =" +
                "numberGroup='" + numberGroup + '\'' +
                ", numberStudents=" + numberStudents;
    }
}
