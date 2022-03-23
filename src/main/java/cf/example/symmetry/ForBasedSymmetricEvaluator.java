package cf.example.symmetry;

import java.util.List;

public class ForBasedSymmetricEvaluator extends ValidateString {


    public boolean evaluate(String str) {
        boolean anyMatch = false;
        List<Pair<Character, Character>> rulePairs;
        rulePairs = PairCreator
                .getRulePairs();

        for (int i = 0; i < str.length(); i++) {
            char startCharFromReducedString = str.charAt(i);
            char endCharFromReducedString = str.charAt(str.length() - 1 - i);
            anyMatch = rulePairs.stream()
                    .anyMatch(characterCharacterPair -> characterCharacterPair.getLeft() == startCharFromReducedString
                            && characterCharacterPair.getRight() == endCharFromReducedString);
        }


        return anyMatch;
    }


}
