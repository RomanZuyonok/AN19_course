package lesson1.homeworks;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        Scanner montH = new Scanner(System.in);
        System.out.print("Enter number 1-12:");
        String number = montH.nextLine();
        number.trim();

        switch (number) {
            case "1":
                System.out.println("It's Winter");
                break;
            case "2":
                System.out.println("It's Winter");
                break;
            case "3":
                System.out.println("It's Spring");
                break;
            case "4":
                System.out.println("It's Spring");
                break;
            case "5":
                System.out.println("It's Spring");
                break;
            case "6":
                System.out.println("It's Summer");
                break;
            case "7":
                System.out.println("It's Summer");
                break;
            case "8":
                System.out.println("It's Summer");
                break;
            case "9":
                System.out.println("It's Autumn");
                break;
            case "10":
                System.out.println("It's Autumn");
                break;
            case "11":
                System.out.println("It's Autumn");
                break;
            case "12":
                System.out.println("It's Winter");
                break;

            default:
                System.out.println("The entered value does not match the month!!!");
        }
    }
}
