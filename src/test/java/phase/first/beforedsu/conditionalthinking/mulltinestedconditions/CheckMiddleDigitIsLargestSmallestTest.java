package phase.first.beforedsu.conditionalthinking.mulltinestedconditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckMiddleDigitIsLargestSmallestTest {

    @Test
    void checkMiddleDigitIsLargestSmallestOrNeither() {
        CheckMiddleDigitIsLargestSmallest checker = new CheckMiddleDigitIsLargestSmallest();

        // Case: Middle digit is the largest
        assertEquals("largest", checker.checkMiddleDigitIsLargestSmallestOrNeither(132));
        assertEquals("largest", checker.checkMiddleDigitIsLargestSmallestOrNeither(582));

        // Case: Middle digit is the smallest
        assertEquals("smallest", checker.checkMiddleDigitIsLargestSmallestOrNeither(312));
        assertEquals("smallest", checker.checkMiddleDigitIsLargestSmallestOrNeither(924));

        // Case: Middle digit is neither largest nor smallest
        assertEquals("neither largest nor smallest", checker.checkMiddleDigitIsLargestSmallestOrNeither(123));
        assertEquals("neither largest nor smallest", checker.checkMiddleDigitIsLargestSmallestOrNeither(321));
        assertEquals("neither largest nor smallest", checker.checkMiddleDigitIsLargestSmallestOrNeither(111));

        // Case: Not a three digit number
        assertEquals("not a three digit number", checker.checkMiddleDigitIsLargestSmallestOrNeither(99));
        assertEquals("not a three digit number", checker.checkMiddleDigitIsLargestSmallestOrNeither(1000));
    }
}
