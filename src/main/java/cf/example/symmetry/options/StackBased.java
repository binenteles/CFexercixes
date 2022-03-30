package cf.example.symmetry.options;

import cf.example.symmetry.Evaluator;
import cf.example.symmetry.requirements.Requirement;
import cf.example.symmetry.requirements.Requirements;

import java.util.Stack;

public class StackBased extends Evaluator {

    @Override
    public boolean isSymmetric(String str) {
        Stack<Character> stack = new Stack<>();

        if (hasOpenBracketsInTheRightSide(str)) return false;
        if (hasClosedBracketsInTheLeftSide(str)) return false;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (isOpenBracket(current)) {
                stack.push(current);

            } else {
                if (!stack.isEmpty()) {
                    char popCharFromStack = stack.pop();
                    boolean anyMatch = Requirements.getRule().stream()
                            .anyMatch(requirement -> requirement.getRightChar() == current &&
                                    requirement.getLeftChar() == popCharFromStack);

                    if (!anyMatch) {
                        return false;
                    }

                }
            }
        }
        return true;

    }

    private boolean hasOpenBracketsInTheRightSide(String str) {
        boolean status = false;
        for (int i = str.length() / 2; i < str.length(); i++) {
            char current = str.charAt(i);
            if (isOpenBracket(current)) {
                status = true;
            }
        }
        return status;
    }

    private boolean hasClosedBracketsInTheLeftSide(String str) {
        boolean status = false;
        for (int i = 0; i < str.length() / 2; i++) {
            char current = str.charAt(i);
            if (isClosedBracket(current)) {
                status = true;
            }
        }
        return status;
    }

    private boolean isOpenBracket(char input) {
        return Requirements.getRule().stream().map(Requirement::getLeftChar).toList().contains(input);
    }


    private boolean isClosedBracket(char input) {
        return Requirements.getRule().stream().map(Requirement::getRightChar).toList().contains(input);
    }



}
