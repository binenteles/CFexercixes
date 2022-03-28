package cf.example.symmetry;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class SymmetryTests {
    SymmetryFactory symmetryFactory = new SymmetryFactory();

    @customAnnotation
    public void checkBracketsWithFor_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = symmetryFactory.getEvaluator(Type.FOR).evaluate(str);
        assertEquals(expected, actualValue);
    }

    @customAnnotation
    public void checkBracketsWithRegex_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = symmetryFactory.getEvaluator(Type.REGEX).evaluate(str);
        assertEquals(expected, actualValue);
    }

    @customAnnotation
    public void checkBracketsWithStack_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = symmetryFactory.getEvaluator(Type.STACK).evaluate(str);
        assertEquals(expected, actualValue);
    }

    @customAnnotation
    public void checkBracketsWithWhile_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = symmetryFactory.getEvaluator(Type.WHILE).evaluate(str);
        assertEquals(expected, actualValue);
    }


}
