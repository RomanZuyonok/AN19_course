package lesson2.homeworks1;

import java.util.Arrays;
import java.util.Random;

public class HomeWork5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.print("Created and populated array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
           if(array[i]%2 !=0){
               array[i] = 0;
               counter++;
           }
        }
        System.out.println();
        System.out.println("the number of odd numbers in the array = " + counter);
        System.out.print("Edited and populated array: " + Arrays.toString(array));
    }
}
