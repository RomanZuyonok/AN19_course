package lesson10.classwork;

import java.util.Scanner;

public class ClassWork1 {


    public static String[] inputStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько строк планируете вводить?");
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите " + (i + 1) + " строку ->");
            strings[i] = scanner.next().toString();

        }
        // scanner.close();
        return strings;

    }

    public static void maxMinPrint(String[] strings) {
        int min = 0;
        int max = 0;
        int indexMin = 0;
        int indexMax = 0;
        StringBuilder stringBuilder = new StringBuilder();

        if (strings != null) {
            min = strings[0].length();
            max = strings[0].length();
            for (int i = 0; i < strings.length; i++) {
                if (min > strings[i].length()) {
                    min = i;
                    indexMin = i;
                }
                if (max < strings[i].length()) {
                    max = i;
                    indexMax = i;
                }

            }

            System.out.println(stringBuilder.append("Min length ").append(strings[indexMin].length()).append(" String -> ").append(strings[indexMin]).append('\n')
                    .append("Max length ").append(strings[indexMax].length()).append(" String -> ").append(strings[indexMax]));

        }
    }

    public static void aboveAveragePrint(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        int average = 0;
        int allLeght = 0;
        stringBuilder.delete(0, stringBuilder.length());
        if (strings != null) {
            for (int i = 0; i < strings.length; i++) {
                allLeght += strings[i].length();
            }
            average = allLeght / strings.length;
            System.out.println("Average =" + average);
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length() > average) {
                    System.out.println(stringBuilder.append(" -> ").append(strings[i].length()).append(" => ")
                            .append(strings[i]).append('\n'));
                }

            }
        }
    }

    public static void threeStringsPrint(String[] strings) {
        if (strings != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.delete(0, stringBuilder.length());
            if (strings.length >= 3) {
                System.out.println(stringBuilder.append(strings[0]).append('\n')
                        .append(strings[1].toUpperCase()).append('\n')
                        .append(strings[2].toLowerCase()));
            } else {
                System.out.println("For the method to work, three lines are needed!!!");
            }
        }
    }

}
