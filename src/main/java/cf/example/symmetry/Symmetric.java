package cf.example.symmetry;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Symmetric {
    private Symmetric(){

    }



    public static boolean withStack(String str) {
        Stack<Character> stack = new Stack<>();
        if (str.length() % 2 != 0 || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (str.charAt(i) == ')' && stack.pop() != '(') {
                        return false;
                    } else if (str.charAt(i) == ']' && stack.pop() != '[') {
                        return false;
                    } else if (str.charAt(i) == '}' && stack.pop() != '{') {
                        return false;
                    }
                }
            }

        }
        return true;

    }

    public static boolean withFor(String str) {
        if (str.length() % 2 != 0 || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '(' && str.charAt(str.length()-1-i) != ')') {
                return false;
            } else if (str.charAt(i) == '[' && str.charAt(str.length()-1-i) != ']') {
                return false;
            } else if (str.charAt(i) == '{' && str.charAt(str.length()-1-i) != '}') {
                return false;
            }
        }
        return true;
    }

    public static boolean withRegex(String str) {
        String rule = "(...); [...]; \\{...} ";
        Pattern pattern = Pattern.compile(rule);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public static boolean withWhile(String str) {
        char[] arr = str.toCharArray();
        if (arr.length % 2 != 0) {
            return false;
        }
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            char start = arr[i];
            char end = arr[j];

            if (start == '(' && end != ')') {
                return false;
            } else if (start == '[' && end != ']' ) {
                return false;
            } else if (start == '{' && (end != '}')) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
