package cf.example.symmetry;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SymmetryWithForTest {
    CheckSymmetryUsingFor checkSymmetryUsingFor = new CheckSymmetryUsingFor();

    @ParameterizedTest
    @ValueSource(strings = {"([{{[(())]}}])", "()", "[]", "{}"})
    public void caseShouldBeValid(String str) {
        assertTrue(checkSymmetryUsingFor.evaluate(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"{{[]()}}}}", "{[(])}", "[](){}"})
    public void caseShouldBeInvalid(String str) {
        assertFalse(checkSymmetryUsingFor.evaluate(str));
    }
}
