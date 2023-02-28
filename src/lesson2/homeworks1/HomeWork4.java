package lesson2.homeworks1;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int arraySize = 0;

        for (; ; ) {
            System.out.print("Enter the size of the array from 5 to 10:");
            arraySize = scanner.nextInt();
            if (arraySize >= 5 && arraySize <= 10) {
                break;
            } else {
                System.out.println("The number is not in the range of 5 to 10!!!! again please!!! ");
            }
        }

        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("First array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int arraySizeNew = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arraySizeNew ++;
            }
        }
        //arraySizeNew += 1;
        if (arraySizeNew != 0) {
            int[] arrayNew = new int[arraySizeNew];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    arrayNew[j] = array[i];
                    j++;
                }
            }
            System.out.println("");
            System.out.print("New array of even numbers:");
            for (int i = 0; i < arrayNew.length; i++) {
                System.out.print(arrayNew[i] + "  ");
            }


        } else {
            System.out.println("There are no even numbers in the array!");
        }

    }
}
