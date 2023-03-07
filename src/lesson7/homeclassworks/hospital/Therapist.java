package lesson7.homeclassworks.hospital;

public class Therapist extends Doctor{

    public Therapist(String nameDoctor, String surNameDoctor, String specialization, int experience) {
        super(nameDoctor, surNameDoctor, specialization, experience);
    }

    public static void treat(){
      System.out.println("Treats diseases...");
    }
}
