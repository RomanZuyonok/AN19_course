package lesson1.homeworks;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner tempEnt = new Scanner(System.in);
        Float temperature = 0.00f;
        System.out.print("Enter the outside temperature (For example -15,8):");
        temperature = tempEnt.nextFloat();
         System.out.println(temperature);

        if (temperature >= -5.00f) {
            System.out.println("It is normal outside");
        }
        else if (temperature >= -15.00f) {
            System.out.println("It is cold outside");
        }
        else if (temperature >= -25.00f) {
            System.out.println("It is very cold outside");
        }
        else {
            System.out.println("Are you sure you entered the temperature value ;)");
        }
    }
}
