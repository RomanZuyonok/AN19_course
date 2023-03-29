package lesson13.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Exercise1 {

    public static void main(String[] args) {

        List<Integer> integerList = fillingArray();

        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(" " + integerList.get(i));
        }
        System.out.println('\n');

        integerList.stream().distinct().sorted().forEach(n-> System.out.print(n + " "));
        System.out.println('\n');

        integerList.stream().distinct().sorted().filter(n -> n >= 7 & n <= 17).forEach(n-> System.out.print(n + " "));
        System.out.println('\n');

        integerList.stream().distinct().filter(n -> n >= 7 & n <= 17).map(n-> n*2).sorted().forEach(n-> System.out.print(n + " "));
        System.out.println('\n');
        long number = integerList.stream().distinct().filter(n -> n >= 7 & n <= 17).map(n-> n*2).count();
        System.out.printf("Number of items in the collection = %s",number);

        System.out.println('\n');
        double avr = integerList.stream().distinct().filter(n -> n >= 7 & n <= 17).map(n-> n*2).mapToInt(n-> n).average().orElse(0);
        System.out.println("Arithmetic mean = "+ avr);

    }

    public static List<Integer> fillingArray(){
        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            integerList.add(random.nextInt(20));
        }
        return integerList;
    }
}
