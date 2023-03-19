package lesson10.homeworks.additional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Additional {
    public static void findMax(String words) {
        if (words != null && words.length() != 0) {
            String[] wordsArray = words.split("\s");
            String maxWord = "";
            for (String word : wordsArray) {
                if (word.length() > maxWord.length()) {
                    maxWord = word;
                }
            }
            System.out.println("Max word = " + maxWord);
        }
    }

    public static void findMin(String words) {
        if (words != null && words.length() != 0) {
            String[] wordsArray = words.split("\s");
            String minWord = "World";
            for (String word : wordsArray) {
                if (word.length() < minWord.length()) {
                    minWord = word;
                }
            }
            System.out.println("Min word = " + minWord);
        }
    }

    public static void doublecatChar(String words) {
        if (words != null && words.length() != 0) {
            String newWords = "";
            for (int i = 0; i < words.length(); i++) {
                newWords += words.charAt(i);
                newWords += words.charAt(i);
            }
            System.out.println(words + " => " + newWords);
        }
    }

    public static void checkPalindrome(String string, int numberWord) {
        if (string != null && !string.isEmpty()) {
            String reversWord = "";
            String[] arrayWords = string.split("\s");
            if (numberWord <= arrayWords.length) {
                for (int i = 0; i < arrayWords[numberWord].length(); i++) {
                    reversWord = arrayWords[numberWord].charAt(i) + reversWord;
                }
                if (arrayWords[numberWord].equalsIgnoreCase(reversWord)) {
                    System.out.println(arrayWords[numberWord] + " <=> " + reversWord);
                } else {
                    System.out.println(arrayWords[numberWord] + " not palindrome");
                }
            }

        } else {
            System.out.println("No word with that number!!!");
        }

    }

    public static void nu(String string){
        String[] words;

        words = string.split ("\s");

        String wordMinCharVar = words[0];
        int sizeMinCharVar = new HashSet<String>(Arrays.asList (words[0].split (""))).size ();

        for (String word :
                words) {
            Set<String> set = new HashSet<String> (Arrays.asList (word.split ("")));
            if (set.size () < sizeMinCharVar) {
                wordMinCharVar = word;
                sizeMinCharVar = set.size ();
            }
        }
        System.out.println (wordMinCharVar);
    }

}
