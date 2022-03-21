package cf.example.symmetry;

public class CheckSymmetryUsingFor extends Constants implements SymmetricParenthesesEvaluator {


    @Override
    public boolean evaluate(String str) {
        if (str.length() % 2 != 0 || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char reducedStr = str.charAt(getIndexForChar(str, i));
            if (getaChar(str, i) == OPEN_ROUND_BRACKET && reducedStr != CLOSED_ROUND_BRACKET) {
                return false;
            } else if (getaChar(str, i) == OPEN_SQUARE_BRACKET && reducedStr != CLOSED_SQUARE_BRACKET) {
                return false;
            } else if (str.charAt(i) == OPEN_CURLY_BRACKET && reducedStr != CLOSED_CURLY_BRACKET) {
                return false;
            }
        }
        return true;
    }

    private int getIndexForChar(String str, int i) {
        return str.length() - 1 - i;
    }

    private char getaChar(String str, int i) {
        return str.charAt(i);
    }
}
