package lesson2.homeworks1;

import java.util.Arrays;

public class HomeWork6 {
    public static void main(String[] args) {
        String[] strings = {"Liam","Noah","Oliver","William","Lucas","Olivia","Charlotte","Isabella","Ava","Emma"};

        System.out.print("Unordered array of names:" + Arrays.toString(strings));

        Arrays.sort(strings);

        System.out.println();
        System.out.print("Ordered array of names:" + Arrays.toString(strings));
    }
}
