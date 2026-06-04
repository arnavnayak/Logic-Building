package phase.first.beforedsu.conditionalthinking.trickylogical;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindThreeNumbersIsInGeometricProgressionTest {

    @Test
    void isThreeDigitsInGeometricProgression() {
        FindThreeNumbersIsInGeometricProgression checker = new FindThreeNumbersIsInGeometricProgression();

        // Valid Geometric Progressions
        assertTrue(checker.isThreeDigitsInGeometricProgression(2, 4, 8));
        assertTrue(checker.isThreeDigitsInGeometricProgression(1, 3, 9));
        assertTrue(checker.isThreeDigitsInGeometricProgression(5, 5, 5));
        assertTrue(checker.isThreeDigitsInGeometricProgression(10, 20, 40));

        // Invalid Geometric Progressions
        assertFalse(checker.isThreeDigitsInGeometricProgression(1, 2, 3));
        assertFalse(checker.isThreeDigitsInGeometricProgression(2, 4, 10));
    }
}