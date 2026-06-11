package phase.first.beforedsu.looping.mathematicallooping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheLCMOfGivenNumbersTest {

    @Test
    void returnLCMOfGivenNumbers() {
        FindTheLCMOfGivenNumbers calculator = new FindTheLCMOfGivenNumbers();

        assertEquals("the LCM of 12 and 18 is 36", calculator.returnLCMOfGivenNumbers(12, 18));
        assertEquals("the LCM of 5 and 7 is 35", calculator.returnLCMOfGivenNumbers(5, 7));
        assertEquals("the LCM of 10 and 10 is 10", calculator.returnLCMOfGivenNumbers(10, 10));
        assertEquals("the LCM of 0 and 5 is 0", calculator.returnLCMOfGivenNumbers(0, 5));
        assertEquals("the LCM of 5 and 0 is 0", calculator.returnLCMOfGivenNumbers(5, 0));
        assertEquals("the LCM of 0 and 0 is 0", calculator.returnLCMOfGivenNumbers(0, 0));
        assertEquals("the LCM of 12 and 18 is 36", calculator.returnLCMOfGivenNumbers(-12, 18));
    }
}