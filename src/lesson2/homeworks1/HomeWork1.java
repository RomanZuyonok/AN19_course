package lesson2.homeworks1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HomeWork1 {
    public static void main(String[] args) {
        int[] array = new int[]{15, 7, 9, 54, 89, 10, 88, 99, 100, 351};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number :");
        int number = scanner.nextInt();
        // Task 1

        for (int j : array) {
            if (number == j) {
                System.out.println("Ваше число есть в массиве");
                break;
            } else {
                System.out.println("Вашего числа нет в массиве");
            }

            boolean found = Arrays.stream(array).boxed().collect(Collectors.toSet()).contains(number);
            if (found) {
                System.out.println("Ваше число есть в массиве");
            } else {
                System.out.println("Вашего числа нет в массиве");
            }

        }
        System.out.println("");
        System.out.println(Arrays.toString(array));

    }

}
