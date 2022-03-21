package cf.example.symmetry;

public class CheckSymmetryUsingWhile extends Constants implements SymmetricParenthesesEvaluator {
    @Override
    public boolean evaluate(String str) {
        char[] arr = str.toCharArray();
        if (arr.length % 2 != 0) {
            return false;
        }
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            char start = arr[i];
            char end = arr[j];

            if (start == OPEN_ROUND_BRACKET && end != CLOSED_ROUND_BRACKET) {
                return false;
            } else if (start == OPEN_SQUARE_BRACKET && end != CLOSED_SQUARE_BRACKET) {
                return false;
            } else if (start == OPEN_CURLY_BRACKET && (end != CLOSED_CURLY_BRACKET)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
