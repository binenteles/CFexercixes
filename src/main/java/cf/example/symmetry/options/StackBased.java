package cf.example.symmetry.options;

import cf.example.symmetry.Evaluator;
import cf.example.symmetry.requirements.Requirement;
import cf.example.symmetry.requirements.Requirements;

import java.util.Stack;
import java.util.stream.Stream;

public class StackBased extends Evaluator {


    @Override
    public boolean isSymmetric(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = str.length() / 2; i < str.length(); i++) {
            char current = str.charAt(i);
            if (isOpenBracket(current)) {
                return false;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (isOpenBracket(current)) {
                stack.push(current);

            } else {
                if (!stack.isEmpty()) {
                    boolean any = getStream().anyMatch(base -> base.getRightChar() == current &&
                            base.getLeftChar() != stack.pop());
                    if (!any) {
                        return false;
                    }

                }
            }
        }
        return true;

    }

    private Stream<Requirement<Character>> getStream() {
        return Requirements.getRule().stream();
    }


    private boolean isOpenBracket(char input) {
        return Requirements.getRule().stream().map(Requirement::getLeftChar).toList().contains(input);
    }

}
