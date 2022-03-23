package cf.example.symmetry;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SymmetryWithWhileTest implements TestInterface {

    SymmetryFactory symmetryFactory = new SymmetryFactory();


    @Override
    public void checkBalancedBrackets_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = symmetryFactory.getSymmetricEvaluator(SymmetricEvaluatorType.WHILE).evaluate(str);
        assertEquals(expected, actualValue);
    }
}
