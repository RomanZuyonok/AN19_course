package lesson6.homework6;

import java.util.Random;

public class ClassPractice {

    public static void main(String[] args) {

       /* Student[] studentsArray = new Student[14];

        // task 1 of class practice
        for (int i = 0; i < studentsArray.length; i++) {
            studentsArray[i] = new Student();
        }

        // task 2 of class practice
        Random random = new Random();

        for (int i = 0; i < studentsArray.length; i++) {
            studentsArray[i].diplomaGrade = random.nextInt(10) + 1;
            studentsArray[i].studyGroup = "2020RMC";
            if (i % 2 == 0) {
                studentsArray[i].nameStudent = "Elon Musk " + i;
            } else if (i % 3 == 0) {
                studentsArray[i].nameStudent = "Tucker Carlson " + i;
            } else if (i % 5 == 0) {
                studentsArray[i].nameStudent = "Donald Trump Jr." + i;
            } else {
                studentsArray[i].nameStudent = "Donald Trump " + i;
            }
        }
         // task 3 of class practice
        for (int i = 0; i < studentsArray.length; i++) {
            studentsArray[i].printInfoStudent();
        }
        System.out.println("The best boyz)");
        // task 4 of class practice
        for (int i = 0; i < studentsArray.length; i++) {
            if(9 <= studentsArray[i].diplomaGrade){
            studentsArray[i].printInfoStudent();
            }
        }

        ATMMachine atmMachine = new ATMMachine(50,20,100);
        atmMachine.addingMoney(2000);

        if(atmMachine.paymentMoney(150) == true){
            System.out.println("\n Operation went well.");
        }else{
            System.out.println("Incorrect amount");
        }*/


        Computer computer1 = new Computer("T480", "Lenovo", 1200.00d);

        computer1.outputInformationComputer();
        CPU cpu = new CPU();
        HDD hdd = new HDD();
        RAM ram = new RAM();
        Computer computer2 = new Computer("XPS 13 7390 ОС","DELL",1100.00d,cpu,ram,hdd);
        computer2.outputAllInformationComputer();

    }
}
