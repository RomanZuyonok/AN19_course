package lesson13.exercise3;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        boolean flag = false;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Menu:\n" +
                    "1. String reversed\n" +
                    "2. Factorial of a number\n" +
                    "3. Exit\n" +
                    ">");
            int menuChoose = scanner.nextInt();
            if (menuChoose > 0 & menuChoose < 4) {
                switch (menuChoose) {
                    case 1:
                        System.out.print("\n Input string:");
                        Scanner scanner1 = new Scanner(System.in);
                        String inStr = scanner1.nextLine();
                        if (inStr != null & !inStr.isEmpty()) {
                            FuncOther<String> reversStr = (str) -> {
                                String resalt = "";

                                for (int i = str.length() - 1; i >= 0; i--) {
                                    resalt += str.charAt(i);
                                }
                                return resalt;
                            };
                            System.out.printf("Revers string: %s", reversStrFunc(reversStr, inStr));
                        }
                        scanner1.close();
                        break;
                    case 2:
                        System.out.println("Input number: ");
                        Scanner scanner2 = new Scanner(System.in);
                        Integer inNumber = scanner2.nextInt();
                        if (inNumber >= 0) {
                            FuncOther<Integer> integerOther = (n) -> {
                                Integer result = n;
                                for (int i = inNumber - 1; i > 1; i--) {
                                    result = result * i;
                                }
                                return result;
                            };
                            System.out.printf("Number %s factorial %d", inNumber, numberFactorialFunc(integerOther, inNumber));
                        }
                        scanner2.close();
                        break;
                    case 3:
                        System.out.println("Good bay!");
                        flag = false;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + menuChoose);
                }
            } else {
                flag = true;
            }
        } while (flag);
        //scanner.close();
    }

    public static String reversStrFunc(FuncOther<String> stringFuncOther, String str) {
        return stringFuncOther.funcOther(str);
    }

    public static Integer numberFactorialFunc(FuncOther<Integer> integerFuncOther, Integer number) {
        return integerFuncOther.funcOther(number);
    }
}