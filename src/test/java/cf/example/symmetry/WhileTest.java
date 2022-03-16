package cf.example.symmetry;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WhileTest {


    @ParameterizedTest
    @ValueSource(strings = {("([{{[(())]}}])"), "()", "[]", "{}"})
    public void caseShouldBeValid(String str) {
        assertTrue(Symmetric.withWhile(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"{{[]()}}}}", "{[(])}", "[](){}"})
    public void caseShouldBeInvalid(String str) {
        assertFalse(Symmetric.withWhile(str));
    }
}
