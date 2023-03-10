package lesson8.homeworks.organization;

public class Director extends Human implements JobTitle{
    public Director(String name, String surname, String jobTitle) {
        super(name, surname, jobTitle);
    }

    @Override
    public void work() {
        System.out.println("work....");
    }

    @Override
    public void printJodTitle() {
        System.out.println("Job title = " + super.getJobTitle().toString());
    }
}
