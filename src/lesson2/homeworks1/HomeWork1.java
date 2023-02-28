package lesson2.homeworks1;

import java.util.Arrays;
import java.util.Scanner;


public class HomeWork1 {
    public static void main(String[] args) {
        int[] array = new int[]{15, 7, 9, 54, 89, 10, 88, 99, 100, 351};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number :");
        int number = scanner.nextInt();
        // Task 1
        boolean flag = false;
        for (int j : array) {
            if (number == j) {
                flag = true;
            }
        }
        System.out.println(flag == true ? "Ваше число есть в массиве " : "Вашего числа нет в массиве");


        System.out.println("");
        System.out.println(Arrays.toString(array));

    }
}


