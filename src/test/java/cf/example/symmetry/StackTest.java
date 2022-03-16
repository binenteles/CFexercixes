package cf.example.symmetry;

import cf.example.symmetry.stackCase.SymmetricWithStack;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {

    @ParameterizedTest
    @ValueSource(strings = {("([{{[(())]}}])"), "()", "[]", "{}"})
    public void caseShouldBeValid(String str) {
        assertTrue(Symmetric.withStack(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"{{[]()}}}}", "{[(])}", "[](){}"})
    public void caseShouldBeInvalid(String str) {
        assertFalse(Symmetric.withStack(str));
    }
}
