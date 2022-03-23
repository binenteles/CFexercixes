package cf.example.symmetry;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public interface TestInterface {
    @ParameterizedTest
    @CsvFileSource(resources = "/entries.csv", numLinesToSkip = 1)
    void checkBalancedBrackets_ShouldHaveExpectedOutcome(String str, boolean expected);

}
