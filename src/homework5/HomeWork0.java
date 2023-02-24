package homework5;

import java.util.Scanner;

public class HomeWork0 {
    public static void main(String[] args) {

        int[][][] array3 = new int[5][5][5];
        MyArray myArray = new MyArray();

        // Array filling
        array3 = myArray.arrayfilling3(array3, 2);

        myArray.printarray3(array3);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number by which you want to increase the values in the array: ");
        int number = scanner.nextInt();

        // Incrementing array values by a given number
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                for (int h = 0; h < array3.length; h++) {
                    array3[i][j][h] += number;
                }
            }
        }
        // array output with changes

        myArray.printarray3(array3);
    }
}
