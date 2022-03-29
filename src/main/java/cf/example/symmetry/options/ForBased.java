package cf.example.symmetry.options;

import cf.example.symmetry.Evaluator;
import cf.example.symmetry.requirements.Requirements;

public class ForBased extends Evaluator {

    @Override
    public boolean isSymmetric(String str) {
        boolean anyMatch = false;

        for (int i = 0; i < str.length(); i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            anyMatch = Requirements.getRule().stream().
                    anyMatch(base -> base.compareChars(start, end));
        }

        return anyMatch;
    }


}
