package lesson12;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        boolean flag = false;
        Map<String, Integer> studentMap = new HashMap<>();
        //for testing
        studentMap.put("Petrov", 10);
        studentMap.put("Ivanov", 7);
        studentMap.put("Sidorov", 5);
        studentMap.put("Kozlov", 3);


        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1 -> Add of student");
            System.out.println("2 -> Print all students");
            System.out.println("3 -> Print number of students");
            System.out.println("4 -> Print on screen bad student");
            System.out.println("5 -> Exit");
            System.out.print("->");
            int number = scanner.nextInt();
            if (number >= 1 && number <= 5) {
                switch (number) {
                    case 1:
                        // System.out.println('\n');
                        System.out.print("Enter the student's first and last name: ");
                        String name = scanner.next();
                        if (!studentMap.containsKey(name)) {
                            System.out.println('\n');
                            System.out.print("Enter student grade: ");
                            Integer grade = scanner.nextInt();
                            studentMap.put(name, grade);
                            System.out.println("Student saved.");
                        } else {
                            System.out.println("There is such a student!");
                        }
                        break;
                    case 2:
                        if (!studentMap.isEmpty()) {
                            System.out.println("List of all students:");
                            for (Map.Entry<String, Integer> item : studentMap.entrySet()) {
                                System.out.println("Name " + item.getKey() + " grade =" + item.getValue());
                            }
                        } else {
                            System.out.println("The list is empty!");
                        }
                        break;
                    case 3:
                        if (!studentMap.isEmpty()) {
                            System.out.println("Number of students" + studentMap.size());
                        } else {
                            System.out.println("The list is empty!");
                        }
                        break;
                    case 4:
                        Integer min = 5;
                        for (Integer item : studentMap.values()) {
                            if (item < min) {
                                min = item;
                            }
                        }
                        for (Map.Entry<String, Integer> item : studentMap.entrySet()) {
                            if (item.getValue() == min) {
                                System.out.printf("Name: %s   Garde: %s", item.getKey(), item.getValue());
                            }
                        }
                        break;
                    case 5:
                        flag = false;
                        System.out.println("Good bay.");
                        break;
                    default:
                        flag = true;
                }

            }

        } while (flag);

        scanner.close();

    }

}