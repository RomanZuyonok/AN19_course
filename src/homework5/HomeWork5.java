package homework5;

import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        int[][] array = new int[5][5];

        array = myArray.arrayfilling(array, 1);

        System.out.println("Array before sorting");
        myArray.printarray(array);

        for (int i = 0; i < array.length; i++){
            Arrays.sort(array[i]);
        }
        System.out.println("Array after sorting");
        myArray.printarray(array);

    }
}
