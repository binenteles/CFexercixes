import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
public class CaseTest {

    @ParameterizedTest
    @ValueSource(strings = {("([{{[(())]}}])"), "()", "[]", "{}"})
    public void caseShouldBeValid(String str) {
        assertTrue(Case.isSymmetricBalanced(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"{{[]()}}}}", "{[(])}", "[](){}"})
    public void caseShouldBeInvalid(String str) {
        assertFalse(Case.isSymmetricBalanced(str));
    }
}
