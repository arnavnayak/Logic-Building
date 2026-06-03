package phase.first.beforedsu.conditionalthinking.mathandnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckForPerfectSquareWithoutSqrRootTest {

    @Test
    void checkPerfectSquare() {
        CheckForPerfectSquareWithoutSqrRoot checker = new CheckForPerfectSquareWithoutSqrRoot();

        // Positive cases: Perfect squares
        assertTrue(checker.checkPerfectSquare(0));
        assertTrue(checker.checkPerfectSquare(1));
        assertTrue(checker.checkPerfectSquare(4));
        assertTrue(checker.checkPerfectSquare(16));
        assertTrue(checker.checkPerfectSquare(25));
        assertTrue(checker.checkPerfectSquare(100));

        // Negative cases: Not perfect squares
        assertFalse(checker.checkPerfectSquare(2));
        assertFalse(checker.checkPerfectSquare(3));
        assertFalse(checker.checkPerfectSquare(10));
        assertFalse(checker.checkPerfectSquare(26));

        // Negative input
        assertFalse(checker.checkPerfectSquare(-1));
        assertFalse(checker.checkPerfectSquare(-16));
    }
}
