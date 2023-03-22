package lesson11.homeworks.addition3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class ValidationBrackets {
    public static boolean validateBrackets( HashMap<String, Integer> openBrackets,
                                            HashMap<String, Integer> closeBrackets,
                                            String example){

        String[] strings = example.split("\\s");

        Deque<String> stack = new ArrayDeque<>();

        for (String inLine: strings) {

            for (int i = 0; i < inLine.length(); i++) {

                char character = inLine.charAt(i);
                String symbol = Character.toString(character);

                if (openBrackets.containsKey(symbol)) {
                    stack.push(symbol);
                } else if (closeBrackets.containsKey(symbol)) {

                    if(!stack.isEmpty()) {

                        Integer ordinalNumberForCheckedSymbol = closeBrackets.get(symbol);

                        String firstElemFromStack = stack.pop();
                        Integer ordinalLastAddedNumberElemFromStack = openBrackets.get(firstElemFromStack);
                        boolean isPairTheBrackets =  ordinalLastAddedNumberElemFromStack.equals(ordinalNumberForCheckedSymbol);

                        if(isPairTheBrackets) break;
                    }

                    return false;
                }
            }
        }

        return stack.isEmpty();
    }}
