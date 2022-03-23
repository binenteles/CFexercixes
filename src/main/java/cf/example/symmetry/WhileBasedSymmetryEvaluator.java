package cf.example.symmetry;

import cf.example.symmetry.Evaluator;
import cf.example.symmetry.Pair;
import cf.example.symmetry.ValidateString;

public class WhileBasedSymmetryEvaluator extends  Evaluator {


    @Override
    public boolean evaluate(String str) {

        if (ValidateString.isInvalidString(str)) {
            return false;
        }

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
