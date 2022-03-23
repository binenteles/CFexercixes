package cf.example.symmetry;

import static org.junit.jupiter.api.Assertions.*;

public class SymmetryWithForTest implements TestInterface {
    SymmetryFactory symmetryFactory = new SymmetryFactory();

    @Override
    public void checkBalancedBrackets_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = symmetryFactory.getSymmetricEvaluator(SymmetricEvaluatorType.FOR).evaluate(str);
        assertEquals(expected, actualValue);

    }
}
