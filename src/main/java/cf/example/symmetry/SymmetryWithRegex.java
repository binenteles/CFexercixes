package cf.example.symmetry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SymmetryWithRegex {
        String rule = "(...); [...]; \\{...} ";
    public boolean isSymmetric(String str) {
        Pattern pattern = Pattern.compile(rule);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
