package lesson10.homeworks.lesson1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contract {

    public String inputNumberContract() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the contract number in the following sequence: xxxx-yyy-xxxx-yyy-xyxy");
        System.out.println("where x is a number and y is a letter!");
        System.out.print("Enter the contract number:");
        String contractNumber = scanner.next();
        String reg = "\\d{4}\\p{Punct}\\p{Alpha}{3}\\p{Punct}\\d{4}\\p{Punct}\\p{Alpha}{3}\\p{Punct}\\p{Alnum}{4}";
        // (contractNumber != null && !contractNumber.isEmpty())
        if (contractNumber != null && contractNumber.length() != 0) {
            if (contractNumber.matches(reg)) {
                scanner.close();
                return contractNumber;
            } else {
                System.out.println("Invalid input !");
            }
        }
        System.out.println("Number not entered !");
        return null;
    }

    public void printBlockNumber(String contractNumber) {
        if (contractNumber != null) {
            String reg = "\\d{4}";
            Pattern pattern = Pattern.compile("-");
            pattern = Pattern.compile(reg);
            Matcher matcher = pattern.matcher(contractNumber);
            while (matcher.find()) {
                System.out.print(" " + matcher.group());
            }
            matcher.reset();
        } else {
            System.out.println("Number not entered !");
        }
    }

    public void replaceChars(String contractNumber) {
        if (contractNumber != null) {
            System.out.println(contractNumber.replaceAll("\\p{Alpha}{1}", "*"));
            System.out.println(contractNumber.replaceAll("\\p{Alpha}{3}", "***"));
        }
    }

    public void printUpperChar(String contractNumber) {
        if (contractNumber != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.delete(0, stringBuilder.length());
            String[] tempArray = contractNumber.split("-");
            System.out.print(stringBuilder.append(tempArray[1].toUpperCase()).append("/").append(tempArray[3].toUpperCase()).
                    append(tempArray[4].toUpperCase().replaceAll("\\d{1}", "/")));

        } else {
            System.out.println("Number not entered !");
        }

    }

    public static void findChar(String contractNumber, String findWord) {
        if (contractNumber != null && findWord.length() != 0) {
            boolean flag = false;
            String[] words = contractNumber.split("-");
            for (int i = 1; i < words.length - 1; i++) {
                if (words[i].equalsIgnoreCase(findWord)) {
                    flag = true;
                }
            }
            if (flag)
                System.out.println("Found");
            else
                System.out.println("Not found");
        } else {
            System.out.println("Number not entered !");
        }
    }

    public static void checkNumber(String contractNumber, String number) {
        if (contractNumber != null && number != null) {
            if (contractNumber.startsWith(number)) {

                System.out.println("Found");
            } else {
                System.out.println("Not found");

            }
        } else {
            System.out.println("Number not entered !");
        }
    }

    public static void lastNumber(String contractNumber, String number){
        if (contractNumber != null && number != null) {
            if (contractNumber.endsWith(number)) {

                System.out.println("Found");
            } else {
                System.out.println("Not found");

            }
        } else {
            System.out.println("Number not entered !");
        }
    }
}
