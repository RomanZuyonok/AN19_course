package lesson12;

import java.util.*;

public class Task4 {

    public static List<Integer> arrayFilling() {
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            integerList.add(i, random.nextInt(10));
        }
        for (Integer integer : integerList) {
            System.out.print(" " + integer);
        }
        System.out.println('\n');
        return integerList;
    }

    public static void sumArray(List<Integer> integerList, int number) {
        if (integerList != null & integerList.size() != 0 & number > 2) {
            Map<Integer, Integer> integerMap = new HashMap<>();
            Integer temp = integerList.get(0);

            for (int i = 1; i < integerList.size(); i++) {

                if (temp + integerList.get(i) == number) {

                    if(!integerMap.containsKey(temp)){
                        integerMap.put(temp, i-1);
                    }
                    if (!integerMap.containsKey(integerList.get(i))) {
                        integerMap.put(integerList.get(i), i);
                    }
                    temp = integerList.get(i);
                } else {
                    temp = integerList.get(i);
                }
            }
            displayingMap(integerMap);
        }else{
            System.out.println("The List is empty or not number!");

        }
    }
    public static void displayingMap(Map<Integer, Integer> integerMap) {
        if (integerMap != null) {
            for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
                System.out.printf("Number: %s   Index to array: %s \n", entry.getKey(), entry.getValue());
            }
        }else{
            System.out.println("The Map is empty!");
        }
    }


    public static void main(String[] args) {

        Task4.sumArray(Task4.arrayFilling(),10);
    }


}
