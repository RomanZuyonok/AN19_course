package lesson2.classwork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClassWork1 {
    public static void main(String[] args) {


        int[] arr = {10, 25, 52, 32, 44, 11, 20, 21, 78, 88, 99};
        System.out.print(Arrays.toString(arr));

        //int buf = 0;
       /* for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length-1 -i; j++) {
                if (mass[j] < mass[j+1]){
                   buf = mass[j];
                   mass[j] = mass[j+1];
                   mass[j] = buf;
                }
            }
        }*/
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println();
        System.out.println("min = " + min + "max = " + max);

        Scanner scan = new Scanner(System.in);

        String[] masstr = new String[10];
        for (int i = 0; i < masstr.length; i++) {
            System.out.print("Введите значание " + i + " элемента массива =");
            masstr[i] = scan.next();
        }
        System.out.print(Arrays.toString(masstr));
        Random random = new Random();

       for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(6);
        }


        System.out.println(Arrays.toString(arr));


    }
}
