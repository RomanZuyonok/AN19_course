package lesson10;

import lesson10.classwork.ClassWork1;
import lesson10.homeworks.additional.Additional;
import lesson10.homeworks.lesson1.Contract;

public class Main {
    public static void main(String[] args) {
        // class work
        System.out.println("Class work lesson 1");


        String[] strings = ClassWork1.inputStr();

        ClassWork1.maxMinPrint(strings);

        System.out.println("Class work lesson 2");

       ClassWork1.aboveAveragePrint(strings);

        System.out.println("Class work lesson 3");

        ClassWork1.threeStringsPrint(strings);

        // homework base

        Contract contract = new Contract();

        String docNum ="1357-wed-5316-ghu-1d3w"; //for fast test
//        String docNum = contract.inputNumberContract();
        contract.printBlockNumber(docNum);
        System.out.println();
        contract.replaceChars(docNum);
        System.out.println();
        contract.printUpperChar(docNum);
        System.out.println();
        Contract.findChar(docNum, "abc");
        System.out.println();
        Contract.checkNumber(docNum, "555");
        System.out.println();
        Contract.lastNumber(docNum, "1a2b");

        // homework additional task 1

        String offer = "A string is a frozen data structure and there is a lot of duplication of process wherever it is passed.";
        Additional.findMax(offer);
        System.out.println();
        Additional.findMin(offer);
        System.out.println();
        Additional.doublecatChar("Hello world");
        System.out.println();
        Additional.checkPalindrome("Go to home Kazak",3);
        System.out.println();
        Additional.nu("ffffff ab f 1234 jkjk");

    }
}
