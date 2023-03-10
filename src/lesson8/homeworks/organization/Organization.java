package lesson8.homeworks.organization;

public class Organization {

    public static void main(String[] args) {


        Director director = new Director("Jack", "Adams", "Director");

        director.printJodTitle();

        Accountant accountant = new Accountant("Anna", "Foker","Accountant");

        accountant.printJodTitle();

        Worker worker = new Worker("Alex","Jobs","Worker");

        worker.printJodTitle();
    }
}
