package cf.example.symmetry;

public class SymmetryFactory {
    public Evaluator getSymmetricEvaluator(SymmetricEvaluatorType symmetricEvaluatorType) {
        switch (symmetricEvaluatorType) {
            case FOR -> new ForBasedSymmetricEvaluator();
            case WHILE -> new WhileBasedSymmetryEvaluator();
            case STACK -> new StackBasedSymmetryEvaluator();
            case REGEX -> new RegexBasedSymmetryEvaluator();
        }
        return null;
    }
}
