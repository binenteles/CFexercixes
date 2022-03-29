package cf.example.symmetry;

import java.util.Objects;

@ComponentInfo(name = "Balanced Brackets", date = "29-03-2022", currentRevision = 17)
public abstract class Evaluator {

    public abstract boolean isSymmetric(String str);

    public final boolean evaluate(String str) {
        return isStringNullOrEmpty(str) && isValidWithoutSpaces(str)
                && isEven(str) && isSymmetric(str);
    }

    private boolean isStringNullOrEmpty(String str) {
        return (Objects.isNull(str) || str.isEmpty());
    }

    private boolean isValidWithoutSpaces(String str) {
        return str.trim().length() < 2;
    }

    private boolean isEven(String str) {
        return str.length() % 2 == 0;
    }


}