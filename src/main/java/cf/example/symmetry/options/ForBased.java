package cf.example.symmetry.options;

import cf.example.symmetry.Evaluator;
import cf.example.symmetry.requirements.Requirements;

public class ForBased extends Evaluator {

    @Override
    public boolean isSymmetric(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (Requirements.matchCharactersWithRequirementPair(start, end)) {
                return false;
            }
        }
        return true;
    }

}
