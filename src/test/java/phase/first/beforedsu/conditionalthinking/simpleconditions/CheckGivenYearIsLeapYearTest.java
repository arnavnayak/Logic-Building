package phase.first.beforedsu.conditionalthinking.simpleconditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckGivenYearIsLeapYearTest {

    @Test
    void checkGivenYearIsLeapYear() {
        CheckGivenYearIsLeapYear checker = new CheckGivenYearIsLeapYear();

        // Leap year: divisible by 400
        assertTrue(checker.checkGivenYearIsLeapYear(2000));
        assertTrue(checker.checkGivenYearIsLeapYear(2400));

        // Not a leap year: divisible by 100 but not 400
        assertFalse(checker.checkGivenYearIsLeapYear(1900));
        assertFalse(checker.checkGivenYearIsLeapYear(2100));

        // Leap year: divisible by 4 but not 100
        assertTrue(checker.checkGivenYearIsLeapYear(2024));
        assertTrue(checker.checkGivenYearIsLeapYear(2016));

        // Not a leap year: not divisible by 4
        assertFalse(checker.checkGivenYearIsLeapYear(2023));
        assertFalse(checker.checkGivenYearIsLeapYear(2018));
    }
}
