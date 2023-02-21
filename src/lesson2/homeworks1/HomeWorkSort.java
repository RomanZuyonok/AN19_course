package lesson2.homeworks1;

import java.util.Arrays;

public class HomeWorkSort {
    public static void main(String[] args) {
        int[] array = new int[20];
        System.out.println("Cocktail sort");
        fillArrayay(array);
        cocktailSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Bubble sort");
        fillArrayay(array);
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    private static void fillArrayay(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(array));
    }

    // Bubble soft
    public static void bubbleSort(int array[]) {
        int buf;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length -1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    buf = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buf;
                }
            }
        }
    }

    // Cocktail sort
    public static void cocktailSort(int array[]) {
        int buff;
        int left = 0;
        int right = array.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    buff = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buff;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    buff = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buff;
                }
            }
            left++;
        } while (left < right);
    }
}
