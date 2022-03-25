package cf.example.symmetry.factory;

import cf.example.symmetry.template.Evaluator;
import cf.example.symmetry.algorithms.ForBased;
import cf.example.symmetry.algorithms.RegexBased;
import cf.example.symmetry.algorithms.StackBased;
import cf.example.symmetry.algorithms.WhileBased;

public class SymmetryFactory {
    public Evaluator getEvaluator (Type symmetricEvaluatorType) {
        return switch (symmetricEvaluatorType) {
            case FOR -> new ForBased();
            case WHILE -> new WhileBased();
            case STACK -> new StackBased();
            case REGEX -> new RegexBased();
        };

    }
}
