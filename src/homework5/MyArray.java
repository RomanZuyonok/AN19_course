package homework5;

import java.util.Random;

public class MyArray {
    public static void main(String[] args) {
    }

    public static void printarray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] arrayfilling(int[][] array, int step) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10) / step;
            }
        }
        return array;
    }

    public static void printarray3(int[][][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int h = 0; h < array.length; h++) {
                    System.out.print(array[i][j][h] + " ");
                }
                //System.out.println();
            }
            System.out.println();
        }
    }

    public static int[][][] arrayfilling3(int[][][] array, int step) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int h = 0; h < array.length; h++) {
                    array[i][j][h] = random.nextInt(100) / step;
                }

            }
        }
        return array;
    }

}
