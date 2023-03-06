package lesson7.homeclassworks.hospital;

public class Dentist extends Doctor{
    public Dentist(String nameDoctor, String surNameDoctor, String specialization, int experience) {
        super(nameDoctor, surNameDoctor, specialization, experience);
    }

    public static void treat(){
        System.out.println("Heals teeth........");
    }

}
