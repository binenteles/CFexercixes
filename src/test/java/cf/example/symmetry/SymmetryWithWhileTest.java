package cf.example.symmetry;

import cf.example.symmetry.SymmetryWithWhile;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class SymmetryWithWhileTest {

    SymmetryWithWhile symmetry = new SymmetryWithWhile();

    @ParameterizedTest
    @ValueSource(strings = {("([{{[(())]}}])"), "()", "[]", "{}"})
    public void caseShouldBeValid(String str) {
        assertTrue(symmetry.isSymmetricBalanced(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"{{[]()}}}}", "{[(])}", "[](){}"})
    public void caseShouldBeInvalid(String str) {
        assertFalse(symmetry.isSymmetricBalanced(str));
    }
}
