package lesson1.homeworks;

public class HomeWork11 {
    public static void main(String[] args) {
        System.out.println("First implementation");
        for (int i = 10; i <= 20; i++) {
            int j = i * i;
            System.out.print(j + "  ");
        }
        System.out.println();
        System.out.println("Second implementation");
        for (int i = 10; i <= 20; i++) {
            System.out.printf("%d  ", Math.round(Math.pow(i, 2)));
        }
    }
}
