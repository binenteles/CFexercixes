package cf.example.symmetry;

import java.util.Stack;

public class SymmetricWithStack {
    boolean isSymmetric = true;

    public boolean isSymmetricBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    isSymmetric = false;
                } else {
                    if (str.charAt(i) == ')' && stack.pop() != '(') {
                        isSymmetric = false;
                    } else if (str.charAt(i) == ']' && stack.pop() != '[') {
                        isSymmetric = false;
                    } else if (str.charAt(i) == '}' && stack.pop() != '{') {
                        isSymmetric = false;
                    }
                }
            }

        }
        return isSymmetric;

    }
}