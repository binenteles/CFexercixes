package cf.example.symmetry.options;

import cf.example.symmetry.prerequisite.Evaluator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBased extends Evaluator {


    @Override
    public boolean isStringSymmetric(String str) {
        Pattern pattern = Pattern.compile("(^\\(.*?\\)$)|(^\\[.*?]$)|(^\\{.*?}$)");
        Matcher matcher = pattern.matcher(str);
        if (str.length() == 2) {
            return matcher.matches();
        }
        return matcher.matches() && evaluate(str.substring(1, str.length() - 1));
    }


}



