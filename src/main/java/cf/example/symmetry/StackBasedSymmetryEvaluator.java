package cf.example.symmetry;

import java.util.Stack;

public class StackBasedSymmetryEvaluator extends Evaluator {


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
            char current = str.charAt(i);
            if (isOpenBracket(str, i)) {
                stack.push(str.charAt(i));

            } else {
                if (!stack.isEmpty()) {
                    boolean any = PairCreator.getRulePairs().stream().anyMatch(characterCharacterPair -> characterCharacterPair.getRight() == current &&
                            characterCharacterPair.getLeft() != stack.pop());
                    if (!any){
                        return false;
                    }

                }
            }
        }
        return true;
    }


    private boolean isOpenBracket(String str, int i) {
        return PairCreator.getRulePairs().stream().map(Pair::getLeft).toList().contains(str.charAt(i));
    }

}
