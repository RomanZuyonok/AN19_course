package lesson11.homeworks.addition3;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> openBrackets = new HashMap<>() {{
            put("{", 0);
            put("[", 1);
            put("(", 2);
        }};
        HashMap<String, Integer> closeBrackets = new HashMap<>() {{
            put("}", 0);
            put("]", 1);
            put(")", 2);
        }};

        String example1 = "{[c1] 25}";
        String example2 = "[a1[25 ]";

        Main.validation(openBrackets, closeBrackets, "{ab} g(bfgrrrt) [c]");
        Main.validation(openBrackets, closeBrackets, example1);
        Main.validation(openBrackets, closeBrackets, example2);

    }

    public static void validation(HashMap openBrackets, HashMap closeBrackets, String example){
        if (ValidationBrackets.validateBrackets(openBrackets, closeBrackets, example)) {
            System.out.println("Parentheses are placed correctly.");
        } else {
            System.out.println("Parentheses are placed incorrectly.");
        }
    }
}
