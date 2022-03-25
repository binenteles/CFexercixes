package cf.example.symmetry;

import cf.example.symmetry.prerequisite.Evaluator;
import cf.example.symmetry.options.ForBased;
import cf.example.symmetry.options.RegexBased;
import cf.example.symmetry.options.StackBased;
import cf.example.symmetry.options.WhileBased;

public final class SymmetryFactory {

    private static SymmetryFactory INSTANCE;

    private SymmetryFactory(){

    }

    public static SymmetryFactory getInstance(){
        if (INSTANCE == null){
            INSTANCE = new SymmetryFactory();
        }
        return INSTANCE;
    }
    public Evaluator getEvaluator (Type symmetricEvaluatorType) {
        return switch (symmetricEvaluatorType) {
            case FOR -> new ForBased();
            case WHILE -> new WhileBased();
            case STACK -> new StackBased();
            case REGEX -> new RegexBased();
        };

    }
}
