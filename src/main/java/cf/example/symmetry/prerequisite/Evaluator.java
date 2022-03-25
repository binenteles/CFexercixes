package cf.example.symmetry.prerequisite;

import java.util.Objects;

public abstract class Evaluator {

    public abstract boolean isStringSymmetric(String str);

    public final boolean evaluate(String str) {
        return isStringNullOrEmpty(str) && isValidWithoutSpaces(str)
                && hasOddLength(str) && isStringSymmetric(str);
    }

    private boolean isStringNullOrEmpty(String str) {
        return (Objects.isNull(str) || str.isEmpty());
    }

    private boolean isValidWithoutSpaces(String str) {
        return str.trim().length() < 2;
    }

    private boolean hasOddLength(String str) {
        return str.length() % 2 == 0;
    }


}