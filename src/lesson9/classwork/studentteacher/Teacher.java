package lesson9.classwork.studentteacher;

public class Teacher extends Human{

    private String subject;

    public Teacher(String name, String surname, String subject) {
        super(name, surname);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.getName() +" "+ super.getSurname()+
                " jobTitle='" + subject + '\'';
    }
}
