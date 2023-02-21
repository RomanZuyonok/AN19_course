package lesson1.homeworks;

import java.util.Scanner;

public class HomeWork6 {

    public static void main(String[] args) {
        Scanner readNumber = new Scanner(System.in);
        System.out.print("Enter number (from 1 to 7): ");
        byte number = readNumber.nextByte();

        switch (number) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Sky blue");
                break;
            case 6:
                System.out.println("Blue");
                break;
            case 7:
                System.out.println("Violet");
                break;
            default: System.out.println("Set value out of range! Try again!");
        }
    }
}
