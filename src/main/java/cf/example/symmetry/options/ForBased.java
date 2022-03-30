package cf.example.symmetry.options;

import cf.example.symmetry.Evaluator;
import cf.example.symmetry.requirements.Requirements;

public class ForBased extends Evaluator {

    @Override
    public boolean isSymmetric(String str) {
        return Requirements.startEndCharactersMeetRequirement(str);
    }

}
