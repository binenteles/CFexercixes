package cf.example.symmetry;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class SymmetryTests {
    SymmetryFactory symmetryFactory = new SymmetryFactory();

    @ParameterizedCsvSource
    public void checkBracketsWithFor_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = symmetryFactory.getEvaluator(Type.FOR).evaluate(str);
        assertEquals(expected, actualValue);
    }

    @ParameterizedCsvSource
    public void checkBracketsWithRegex_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = symmetryFactory.getEvaluator(Type.REGEX).evaluate(str);
        assertEquals(expected, actualValue);
    }

    @ParameterizedCsvSource
    @MarkedMethod("Stack symmetry test")
    public void checkBracketsWithStack_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = symmetryFactory.getEvaluator(Type.STACK).evaluate(str);
        assertEquals(expected, actualValue);
    }

    @ParameterizedCsvSource
    @InputTests(value = 13)
    public void checkBracketsWithWhile_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = symmetryFactory.getEvaluator(Type.WHILE).evaluate(str);
        assertEquals(expected, actualValue);
    }


}
