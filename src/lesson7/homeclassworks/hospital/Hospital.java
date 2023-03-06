package lesson7.homeclassworks.hospital;

public class Hospital {

    public static void main(String[] args) {

        System.out.println("_________________________________HOSPITAL________________________________________");
        // Doctors
        Dentist dentist1 = new Dentist("Oliver", "Williams", "dental medicine", 10);
        Surgeon surgeon1 = new Surgeon("Harry ", "Gibson", "surgical", 10);
        Therapist therapist1 = new Therapist("Thomas ", "Grant", "therapy", 8);

        Doctor.printInfoDoctors(dentist1);
        Doctor.printInfoDoctors(surgeon1);
        Doctor.printInfoDoctors(therapist1);

        System.out.println("________________________________________________________________________________");

        // Patients
        Patient patient1 = new Patient(1, "Jack", "Wolfskin", 35);
        Patient patient2 = new Patient(2, "Sony", "Lightman", 21);

        patient1.printIfo();
        patient2.printIfo();

        patient1.setTreatmentPlan(1);
        patient2.setTreatmentPlan(3);

        Patient.printPlan(patient1);
        Patient.printPlan(patient2);

        // Doctor appointment
        System.out.println("___________________________Doctor appointment___________________________________");
        TreatmentPlan.doctorsAppointment(patient1);
        TreatmentPlan.doctorsAppointment(patient2);


    }
}
