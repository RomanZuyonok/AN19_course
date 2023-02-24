package homework5;
public class HomeWork4 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        MyArray myArray = new MyArray();
        int sum = 0;

        myArray.arrayfilling(array, 1);

        myArray.printarray(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i==j){
                    sum +=array[i][j];
                }
            }
        }

        System.out.println();
        System.out.print("Diagonal sum = "+ sum);
    }
}
