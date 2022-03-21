package cf.example.symmetry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckSymmetryUsingRegex extends Constants implements SymmetricParenthesesEvaluator {


    @Override
    public boolean evaluate(String str) {
        Pattern pattern = Pattern.compile("(^\\(.*?\\)$)|(^\\[.*?]$)|(^\\{.*?}$)");
        Matcher matcher = pattern.matcher(str);
        if (str.length() == 0) {
            return true;
        }
        return matcher.matches() && evaluate(str.substring(1, str.length() - 1));
    }


}
