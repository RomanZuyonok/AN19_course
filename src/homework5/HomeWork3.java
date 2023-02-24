package homework5;

public class HomeWork3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        MyArray myArray = new MyArray();
        int sumarray = 0;

        array = myArray.arrayfilling(array,1);

        myArray.printarray(array);



        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
               int sum = array[i][j] + array[i+1][j+1];
                sumarray += sum;
            }
        }
        System.out.println();
        System.out.print("Sum of all array elements = " + sumarray);

    }
}
