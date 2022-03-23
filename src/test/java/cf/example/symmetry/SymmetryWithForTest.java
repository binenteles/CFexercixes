package cf.example.symmetry;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class SymmetryWithForTest implements TestInterface {
    SymmetryFactory symmetryFactory = new SymmetryFactory();


    @Override
    @ParameterizedTest
    @CsvFileSource(resources = "/entries.csv", numLinesToSkip = 1)
    public void checkBalancedBrackets_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = symmetryFactory.getSymmetricEvaluator(SymmetricEvaluatorType.FOR).evaluate(str);
        assertEquals(expected, actualValue);
    }
}
