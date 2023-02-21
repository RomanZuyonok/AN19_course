package lesson1.homeworks;

import java.util.Scanner;

public class HomeWork7 {

    public static void main(String[] args) {
        System.out.println("First implementation");
        for (int i = 1; i < 100; i = i + 2) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.println("Second implementation");
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(" ");
        System.out.println("Next task");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.println("Next task");
        Scanner numberHold = new Scanner(System.in);
        System.out.print("Enter number: ");
        int numberUser = numberHold.nextInt();
        int sum = 0;
        if (numberUser >= 1) {
            for (int i = 1; i <= numberUser; i++) {
                sum = sum + i;
                // System.out.print("Sum = " + sum);
            }
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("Set value out of range! Try again!");
        }

        System.out.println(" ");
        System.out.println("Next task");

        int numberSeven = 0;
        //System.out.print(" " + numberSeven);
        while (numberSeven != 98) {
            numberSeven += 7;
            System.out.print(" " + numberSeven);
        }

        System.out.println(" ");
        System.out.println("Next task");
        int j = 5;
        for (int i = 0; i < 10; i++) {
            j -= 5;
            System.out.print(j + ", ");
        }

        System.out.println(" ");
        for (int i = 0; i > -50; i = i - 5) {
            System.out.print(i + ", ");
        }

    }
}
