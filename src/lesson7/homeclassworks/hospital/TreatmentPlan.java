package lesson7.homeclassworks.hospital;

public class TreatmentPlan {

    public static void doctorsAppointment(Patient patient){

        if(patient.getTreatmentPlan() == 1){
        System.out.println("Surgeon Appointed!");
        Surgeon.treat();
        } else if (patient.getTreatmentPlan() == 2) {
            System.out.println("Appointed dentist!");
            Dentist.treat();
        } else if (patient.getTreatmentPlan() >= 3) {
            System.out.println("Therapist Appointed!");
            Therapist.treat();
        } else {
            System.out.println("Build a treatment plan first!!!");
        }
    }

}
