package lesson2.homeworks1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        HomeWork3 homeWork3 = new HomeWork3();

        int[] array = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int arraysize = scanner.nextInt();

        array = new int[arraysize];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int max = array[0];
        int aver = 0;
        int indexmax = 0;
        int indexmin = 0;

        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
                indexmax = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
                indexmin = i;
            }
        }


        System.out.println("max =" + max + "    index =" + indexmax);
        System.out.println("min =" + min + "    index =" + indexmin);
        System.out.println("arithmetic mean ="+HomeWork3.arithmeticMean(array));

    }
}
