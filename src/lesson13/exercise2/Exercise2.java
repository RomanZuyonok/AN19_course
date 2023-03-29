package lesson13.exercise2;

import java.util.ArrayList;
import java.util.List;
public class Exercise2 {

    public static void main(String[] args) {

        List<String> stringList = fillingArray();

        System.out.print("The number of times the name occurs: "+stringList.stream().filter(s-> s.equalsIgnoreCase("Roman")).count() + "\n");

        stringList.stream().filter((s)-> s.startsWith("A")).forEach((s) -> System.out.println(" - "+ s));

        System.out.println(stringList.stream().sorted().findFirst().orElse("Empty@"));

    }

    public static List<String> fillingArray(){
        List<String> stringList = new ArrayList<>();

        stringList.add("Ivan");
        stringList.add("Dmitry");
        stringList.add("Maksim");
        stringList.add("Aleksey");
        stringList.add("Masha");
        stringList.add("Jena");
        stringList.add("Roman");
        stringList.add("Ola");
        stringList.add("Sonya");
        stringList.add("Oliver");
        stringList.add("roman");

        return stringList;
    }
}
