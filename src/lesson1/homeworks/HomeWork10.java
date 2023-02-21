package lesson1.homeworks;

public class HomeWork10 {

    public static void main(String[] args) {
        int res = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("");
            if (i <= 2) {
                System.out.println("Multiplication table by " + i);
            } else {
                System.out.println("Multiplication table for " + i);
            }
            for (int j = 1; j <= 10; j++) {
                res = i * j;
                System.out.print(i + "*" + j + "=" + res + "    ");
            }
        }
    }
}
