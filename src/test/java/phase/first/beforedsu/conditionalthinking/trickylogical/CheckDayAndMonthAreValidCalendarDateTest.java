package phase.first.beforedsu.conditionalthinking.trickylogical;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckDayAndMonthAreValidCalendarDateTest {

    @Test
    void isValidCalendarDateIgnoringLeapYears() {
        CheckDayAndMonthAreValidCalendarDate checker = new CheckDayAndMonthAreValidCalendarDate();

        // Valid dates
        assertTrue(checker.isValidCalendarDateIgnoringLeapYears(1, 31));   // January
        assertTrue(checker.isValidCalendarDateIgnoringLeapYears(2, 28));   // February
        assertTrue(checker.isValidCalendarDateIgnoringLeapYears(4, 30));   // April
        assertTrue(checker.isValidCalendarDateIgnoringLeapYears(12, 31));  // December

        // Invalid months/days
        assertFalse(checker.isValidCalendarDateIgnoringLeapYears(0, 15));
        assertFalse(checker.isValidCalendarDateIgnoringLeapYears(13, 15));
        assertFalse(checker.isValidCalendarDateIgnoringLeapYears(5, 0));
        assertFalse(checker.isValidCalendarDateIgnoringLeapYears(5, 32));

        // Month specific limits (Ignoring Leap Years)
        assertFalse(checker.isValidCalendarDateIgnoringLeapYears(2, 29));  // Feb 29 invalid
        assertFalse(checker.isValidCalendarDateIgnoringLeapYears(4, 31));  // April 31 invalid
        assertFalse(checker.isValidCalendarDateIgnoringLeapYears(6, 31));  // June 31 invalid
        assertFalse(checker.isValidCalendarDateIgnoringLeapYears(9, 31));  // Sept 31 invalid
        assertFalse(checker.isValidCalendarDateIgnoringLeapYears(11, 31)); // Nov 31 invalid
    }

    @Test
    void isValidCalendarDateWithLeapYears() {
        CheckDayAndMonthAreValidCalendarDate checker = new CheckDayAndMonthAreValidCalendarDate();

        // Leap Year cases (February)
        assertTrue(checker.isValidCalendarDateWithLeapYears(2, 29, 2000)); // Divisible by 400
        assertTrue(checker.isValidCalendarDateWithLeapYears(2, 29, 2024)); // Divisible by 4
        assertFalse(checker.isValidCalendarDateWithLeapYears(2, 29, 1900)); // Divisible by 100 but not 400
        assertFalse(checker.isValidCalendarDateWithLeapYears(2, 29, 2023)); // Not a leap year

        // General validation
        assertTrue(checker.isValidCalendarDateWithLeapYears(1, 31, 2023));
        assertTrue(checker.isValidCalendarDateWithLeapYears(4, 30, 2023));
        assertFalse(checker.isValidCalendarDateWithLeapYears(4, 31, 2023));

        // Invalid inputs
        assertFalse(checker.isValidCalendarDateWithLeapYears(13, 1, 2023));
        assertFalse(checker.isValidCalendarDateWithLeapYears(5, 0, 2023));
        assertFalse(checker.isValidCalendarDateWithLeapYears(5, 32, 2023));
    }
}
