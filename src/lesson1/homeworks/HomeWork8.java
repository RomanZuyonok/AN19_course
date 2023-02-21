package lesson1.homeworks;

import java.util.Scanner;

public class HomeWork8 {

    public static void main(String[] args) {
        System.out.println("First implementation");
        int a = 1;
        int b = 0;
        int number = 13;

        for (int i = 3; i <= number; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(" " + b);
        }
        System.out.println(" ");
        System.out.println("Second implementation");
        Scanner numberIn = new Scanner(System.in);
        final double goldenRation = 1.618034d;
        double resault = 0.00d;
        int fineshNumber = 0;
        System.out.print("Enter number :");
        double numberFibon = numberIn.nextDouble();

        for (int i = 0; i <= numberFibon; i++) {
            resault = (Math.pow(goldenRation, i) - Math.pow((1 - goldenRation), i)) / Math.sqrt(5.00d);
            fineshNumber = (int) Math.round(resault);
            System.out.print(i + " = " + fineshNumber + " : ");
        }

    }
}
