package cf.example.symmetry;

public class CheckSymmetryUsingFor extends Constants implements SymmetricParenthesesEvaluator {


    @Override
    public boolean evaluate(String str) {

        if (ValidateString.isInvalidString(str)) {
            return false;
        }


        for (int i = 0; i < str.length(); i++) {
            char startCharFromReducedString = str.charAt(i);
            char endCharFromReducedString = str.charAt(str.length() - 1 - i);

            if (startCharFromReducedString == OPEN_ROUND_BRACKET && endCharFromReducedString != CLOSED_ROUND_BRACKET) {
                return false;
            } else if (startCharFromReducedString == OPEN_SQUARE_BRACKET && endCharFromReducedString != CLOSED_SQUARE_BRACKET) {
                return false;
            } else if (startCharFromReducedString == OPEN_CURLY_BRACKET && endCharFromReducedString != CLOSED_CURLY_BRACKET) {
                return false;
            }
        }
        return true;
    }


}
