package cf.example.symmetry;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SymmetryWithStackTest {

    CheckSymmetryUsingStack checkSymmetryUsingStack = new CheckSymmetryUsingStack();

    @ParameterizedTest
    @ValueSource(strings = {("([{{[(())]}}])"), "()", "[]", "{}"})
    public void caseShouldBeValid(String str) {

        assertTrue(checkSymmetryUsingStack.evaluate(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"{{[]()}}}}", "{[(])}", "[](){}"})
    public void caseShouldBeInvalid(String str) {
        assertFalse(checkSymmetryUsingStack.evaluate(str));
    }
}
