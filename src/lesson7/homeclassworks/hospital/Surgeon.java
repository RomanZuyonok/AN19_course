package lesson7.homeclassworks.hospital;

public class Surgeon extends Doctor{

    public Surgeon(String nameDoctor, String surNameDoctor, String specialization, int experience) {
        super(nameDoctor, surNameDoctor, specialization, experience);
    }

    public static void treat(){
      System.out.println("Wait! Operating.....");
    }



}
