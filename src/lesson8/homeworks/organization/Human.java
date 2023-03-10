package lesson8.homeworks.organization;

public abstract class Human {

    private String name;
    private String surname;
    private String jobTitle;

    public Human(String name, String surname, String jobTitle) {
        this.name = name;
        this.surname = surname;
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract void work();
}
