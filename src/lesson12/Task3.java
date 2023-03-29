package lesson12;


import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static Map<Character, Integer> countChar(String str) {
        if (str != null & !str.isEmpty()) {
            str = str.replaceAll("\\p{Punct}+|\\p{Blank}+|\\d+", "").toLowerCase();
            // String str1 = str.toLowerCase().replaceAll("\\p{Punct}+|\\p{Blank}+|\\d+", "");

            Map<Character, Integer> stringIntegerMap = new HashMap<>();
            Character tempChar;
            for (int i = 0; i < str.length(); i++) {
                tempChar = str.charAt(i);
                if (!stringIntegerMap.containsKey(tempChar)) {
                    stringIntegerMap.put(tempChar, 1);
                } else {
                    stringIntegerMap.put(tempChar, stringIntegerMap.get(tempChar) + 1);
                }
            }

            return stringIntegerMap;

        } else {
            System.out.println("The string is empty!");
            return null;
        }
    }

    public static void displayingRepeatedChars(Map<Character, Integer> characterIntegerMap) {
        if (characterIntegerMap != null) {
            for (Map.Entry<Character, Integer> entry : characterIntegerMap.entrySet()) {
                System.out.printf("Char: %s   Quantity: %s \n", entry.getKey(), entry.getValue());
            }
        }else{
            System.out.println("The Map is empty!");
        }
    }


    public static void main(String[] args) {
        String str = "Строка - это застывшая структура данных, и повсюду, куда она передается, происходит значительное дублирование процесса. " +
                "Это идеальное средство для сокрытия информации.";
        String str1 ="A string is a frozen data structure, and there is a lot of duplication of process wherever it is passed. This is the perfect tool for hiding information.";

        Task3.displayingRepeatedChars(Task3.countChar(str1));



    }

}
