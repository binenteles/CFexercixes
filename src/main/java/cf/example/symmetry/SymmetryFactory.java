package cf.example.symmetry;

import cf.example.symmetry.options.ForBased;
import cf.example.symmetry.options.RegexBased;
import cf.example.symmetry.options.StackBased;
import cf.example.symmetry.options.WhileBased;

public final class SymmetryFactory {

    public Evaluator getEvaluator(Type symmetricEvaluatorType) {
        return switch (symmetricEvaluatorType) {
            case FOR -> new ForBased();
            case WHILE -> new WhileBased();
            case STACK -> new StackBased();
            case REGEX -> new RegexBased();
        };

    }
}
