package phase.first.beforedsu.conditionalthinking.trickylogical;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindThreeNumberIsInArithmeticProgressionTest {

    @Test
    void isThreeDigitsInArithmeticProgression() {
        FindThreeNumberIsInArithmeticProgression checker = new FindThreeNumberIsInArithmeticProgression();

        // Valid Arithmetic Progressions
        assertTrue(checker.isThreeDigitsInArithmeticProgression(1, 2, 3));
        assertTrue(checker.isThreeDigitsInArithmeticProgression(10, 20, 30));
        assertTrue(checker.isThreeDigitsInArithmeticProgression(5, 5, 5));
        assertTrue(checker.isThreeDigitsInArithmeticProgression(10, 5, 0));

        // Invalid Arithmetic Progressions
        assertFalse(checker.isThreeDigitsInArithmeticProgression(1, 2, 4));
        assertFalse(checker.isThreeDigitsInArithmeticProgression(10, 20, 25));

    }
}