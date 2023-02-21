package lesson2.homeworks1;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        int[] array1 = new int[]{10, 20, 30, 40, 50};
        int[] array2 = new int[]{11, 21, 31, 41, 51};

        System.out.print("First array:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(" " + array1[i] + " ");
        }
        System.out.println();
        System.out.print("Second array:" + Arrays.toString(array2));

        System.out.println();
        System.out.println("Arithmetic averages in the array 1 ="+arithmeticMean(array1));
        System.out.println("Arithmetic averages in the array 2 ="+arithmeticMean(array2));

        int average1 = arithmeticMean(array1);
        int average2 = arithmeticMean(array2);

        comparison(average1,average2);

        if (average1 == average2) {
            System.out.println("Arithmetic means in both arrays are equal " + average1 + "=" +average2);
        } else if (average1 > average2) {
            System.out.println("Arithmetic averages in the array 1 are greater! " +average1+">"+average2);
        } else {
            System.out.println("Arithmetic averages in the array 2 are greater! " +average1+ "<"+average2);
        }


    }

    public static int arithmeticMean(int[] arr) {
        int resalt = arr[0];
        for (int i = 1; i < arr.length; i++) {
            resalt += arr[i];
        }
        return resalt / arr.length;
    }

    public static void comparison(int a, int b){
        if (a == b) {
            System.out.println("Arithmetic means in both arrays are equal " + a + "=" +b);
        } else if (a > b) {
            System.out.println("Arithmetic averages in the array 1 are greater! " +a+">"+b);
        } else {
            System.out.println("Arithmetic averages in the array 2 are greater! " +a+ "<"+b);
        }
    }
}
