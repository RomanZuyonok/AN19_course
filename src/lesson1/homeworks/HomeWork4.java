package lesson1.homeworks;

import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {

        Scanner readMonth = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int month = readMonth.nextInt();

        if (2 >= month) {
            System.out.println("It's Winter");
        } else if (5 >= month) {
            System.out.println("It's Spring");
        } else if (8 >= month) {
            System.out.println("It's Summer");
        } else if (11 >= month) {
            System.out.println("It's Autumn");
        } else if (12 == month) {
            System.out.println("It's Winter");
        } else {
            System.out.println("The entered value does not match the month!!!");
        }

    }
}
