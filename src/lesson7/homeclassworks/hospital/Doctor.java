package lesson7.homeclassworks.hospital;

public class Doctor {

    private String nameDoctor;

    private String surNameDoctor;

    private String specialization;
    private int experience;
    public String getNameDoctor() {
        return nameDoctor;
    }
    public String getSurNameDoctor() {
        return surNameDoctor;
    }
    public String getSpecialization() {
        return specialization;
    }
    public int getExperience() {
        return experience;
    }
  /*  public void setNameDoctor(String nameDoctor, String surNameDoctor) {
        this.nameDoctor = nameDoctor;
        this.surNameDoctor = surNameDoctor;
    }*/

    public Doctor(String nameDoctor, String surNameDoctor, String specialization, int experience) {
        this.nameDoctor = nameDoctor;
        this.surNameDoctor = surNameDoctor;
        this.specialization = specialization;
        this.experience = experience;
    }

    public static void treat() {
        System.out.println("Patient examination and general treatment!");
    }

    public static void printInfoDoctors(Doctor doctor){
        System.out.println("Doctor info: Surname: " + doctor.surNameDoctor+ " Name: " + doctor.nameDoctor+"  Specialization: "
                + doctor.specialization + "  Experience: " + doctor.experience +" years");
    }

}
