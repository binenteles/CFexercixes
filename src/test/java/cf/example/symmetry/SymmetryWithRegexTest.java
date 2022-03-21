package cf.example.symmetry;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class SymmetryWithRegexTest {
    CheckSymmetryUsingRegex checkSymmetryUsingRegex = new CheckSymmetryUsingRegex();


    @ParameterizedTest
    @CsvFileSource(resources = "/entries.csv", numLinesToSkip = 1)
    void checkBalancedBrackets_ShouldHaveExpectedOutcome(String str, boolean expected) {
        boolean actualValue = checkSymmetryUsingRegex.evaluate(str);
        assertEquals(expected, actualValue);
    }
}
