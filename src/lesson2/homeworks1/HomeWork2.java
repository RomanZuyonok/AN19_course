package lesson2.homeworks1;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        // Task 2
        int[] array = new int[]{15, 7, 9, 54, 89, 10, 88, 99, 100, 351};
        int[] newarray = new int[array.length - 1];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number :");
        int elementToBeDeleted = scanner.nextInt();

        if (elementToBeDeleted < array.length) {
            System.out.println("Original Array is: " + Arrays.toString(array));

            for (var i = 0; i < array.length; i++) {
                if (i != elementToBeDeleted) {
                    int newIndex = i < elementToBeDeleted ? i : i - 1;
                    newarray[newIndex] = array[i];
                }
            }
            System.out.println("New Array after deleting element = " + elementToBeDeleted + " and shifting: "
                    + Arrays.toString(newarray));
        } else {
            System.out.println("Ваше число больше размера массива");
        }
    }
}
