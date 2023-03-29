package lesson12;

import java.util.*;

public class Task2 {

    public List<Integer> arrayFilling(int lenght) {
        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < lenght; i++) {
            integerList.add(i, random.nextInt(10));
        }
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(" " + integerList.get(i));
        }
        System.out.println('\n');
        return integerList;
    }

    public void searchRepeats(List<Integer> integerList) {
        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < integerList.size(); i++) {
            Integer temp = integerList.get(i);
            if(!integerMap.containsKey(temp)){
                integerMap.put(temp,1);
            } else {
                integerMap.put(temp, integerMap.get(temp) + 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: integerMap.entrySet()
        ) {
            System.out.printf("Number: %s   Quantity: %s \n", entry.getKey(), entry.getValue());
        }

    }

    public static void main(String[] args) {

        Task2  task2 = new Task2();

        task2.searchRepeats(task2.arrayFilling(25));


    }


}
