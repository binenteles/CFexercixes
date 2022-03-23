package cf.example.symmetry;

public class ForBasedSymmetricEvaluator extends ValidateString {


    public boolean evaluate(String str) {
        boolean anyMatch = false;

        for (int i = 0; i < str.length(); i++) {
            char startCharFromReducedString = str.charAt(i);
            char endCharFromReducedString = str.charAt(str.length() - 1 - i);
            anyMatch = PairCreator.getRulePairs().stream()
                    .anyMatch(characterCharacterPair -> characterCharacterPair.getLeft() == startCharFromReducedString
                            && characterCharacterPair.getRight() == endCharFromReducedString);
        }


        return anyMatch;
    }


}
