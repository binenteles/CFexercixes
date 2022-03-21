package cf.example.symmetry;

import java.util.Objects;

public class ValidateString {
    public static boolean isInvalidString(String str) {
        if (Objects.isNull(str)) {
            return false;
        }

        return str.trim().length() < 2;


    }
}

