package lesson1.homeworks;

import java.util.Scanner;

public class HomeWork5 {

    public static void main(String[] args) {

        Scanner readNumber = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = readNumber.nextInt();

        if(number%2 == 0){
            System.out.println("Even number");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}
