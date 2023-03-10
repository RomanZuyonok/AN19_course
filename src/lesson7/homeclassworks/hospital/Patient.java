package lesson7.homeclassworks.hospital;

public class Patient {

    private int idPatient;
    private String namePatient;
    private String surNamePatient;
    private int agePatient;
    private int treatmentPlan;


    public Patient(int idPatient, String namePatient, String surNamePatient, int agePatient) {
        this.idPatient = idPatient;
        this.namePatient = namePatient;
        this.surNamePatient = surNamePatient;
        this.agePatient = agePatient;
    }

    public Patient(int idPatient, String namePatient, String surNamePatient, int agePatient, int treatmentPlan) {
        this.idPatient = idPatient;
        this.namePatient = namePatient;
        this.surNamePatient = surNamePatient;
        this.agePatient = agePatient;
        this.treatmentPlan = treatmentPlan;
    }

    // gets/sets
    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    // methods

    public void printIfo() {
        System.out.println("Surname:" + surNamePatient + " Name:" + namePatient + "   Age:" + agePatient
                + "years  ID:" + idPatient);
    }

    public static void printPlan(Patient patient) {
        if (patient.treatmentPlan >= 1) {
            System.out.println("Treatment plan N" + patient.treatmentPlan + " for " + patient.namePatient + " "
                    + patient.surNamePatient);
        } else {
            System.out.println("Treatment plan for " + patient.namePatient + " " + patient.surNamePatient + " not assigned!");
        }
    }

}
