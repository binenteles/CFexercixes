package cf.example.symmetry;

import java.util.Objects;

public abstract class Evaluator {


    public boolean isInvalidString(String str) {
        if (Objects.isNull(str)) {
            return false;
        }

        return str.trim().length() < 2;
    }

    abstract boolean evaluate(String str);


}