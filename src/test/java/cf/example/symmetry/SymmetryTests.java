package cf.example.symmetry;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class SymmetryTests {
    SymmetryFactory symmetryFactory = SymmetryFactory.getInstance();

    @ParameterizedTest
    @CsvFileSource(resources = "/entries.csv", numLinesToSkip = 1)
    public void checkBracketsWithFor_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = symmetryFactory.getEvaluator(Type.FOR).evaluate(str);
        System.out.println(symmetryFactory);
        assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/entries.csv", numLinesToSkip = 1)
    public void checkBracketsWithRegex_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = symmetryFactory.getEvaluator(Type.REGEX).evaluate(str);
        System.out.println(symmetryFactory);
        assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/entries.csv", numLinesToSkip = 1)
    public void checkBracketsWithStack_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = symmetryFactory.getEvaluator(Type.STACK).evaluate(str);
        System.out.println(symmetryFactory);
        assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/entries.csv", numLinesToSkip = 1)
    public void checkBracketsWithWhile_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = symmetryFactory.getEvaluator(Type.WHILE).evaluate(str);
        assertEquals(expected, actualValue);
    }

}
