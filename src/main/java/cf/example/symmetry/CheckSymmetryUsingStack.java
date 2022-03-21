package cf.example.symmetry;

import java.util.Stack;

public class CheckSymmetryUsingStack extends Constants implements SymmetricParenthesesEvaluator {


    @Override
    public boolean evaluate(String str) {


        Stack<Character> stack = new Stack<>();
        if (str.length() % 2 != 0 || str.isEmpty()) {
            return false;
        }

        for (int i = str.length() / 2; i < str.length(); i++) {
            if (isOpenBracket(str, i)) {
                return false;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (isOpenBracket(str, i)) {
                stack.push(str.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (str.charAt(i) == CLOSED_ROUND_BRACKET && stack.pop() != OPEN_ROUND_BRACKET) {
                        return false;
                    } else if (str.charAt(i) == CLOSED_SQUARE_BRACKET && stack.pop() != OPEN_SQUARE_BRACKET) {
                        return false;
                    } else if (str.charAt(i) == CLOSED_CURLY_BRACKET && stack.pop() != OPEN_CURLY_BRACKET) {
                        return false;
                    }
                }
            }

        }
        return true;
    }


    private boolean isOpenBracket(String str, int i) {
        return str.charAt(i) == OPEN_ROUND_BRACKET || str.charAt(i) == OPEN_SQUARE_BRACKET || str.charAt(i) == OPEN_CURLY_BRACKET;
    }
}
