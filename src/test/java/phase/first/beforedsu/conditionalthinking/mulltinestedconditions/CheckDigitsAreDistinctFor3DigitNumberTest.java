package phase.first.beforedsu.conditionalthinking.mulltinestedconditions;

import org.junit.jupiter.api.Test;
import phase.first.beforedsu.conditionalthinking.mathandnumber.CheckDigitsAreDistinctFor3DigitNumber;

import static org.junit.jupiter.api.Assertions.*;

class CheckDigitsAreDistinctFor3DigitNumberTest {

    @Test
    void checkDigitsAreDistinctIn3DigitNumber() {
        CheckDigitsAreDistinctFor3DigitNumber checker = new CheckDigitsAreDistinctFor3DigitNumber();

        // Case: All digits are distinct
        assertEquals("all digit are distinct", checker.checkDigitsAreDistinctIn3DigitNumber(123));
        assertEquals("all digit are distinct", checker.checkDigitsAreDistinctIn3DigitNumber(987));

        // Case: Digits are not distinct
        assertEquals("all digits are not distinct", checker.checkDigitsAreDistinctIn3DigitNumber(121));
        assertEquals("all digits are not distinct", checker.checkDigitsAreDistinctIn3DigitNumber(112));
        assertEquals("all digits are not distinct", checker.checkDigitsAreDistinctIn3DigitNumber(211));
        assertEquals("all digits are not distinct", checker.checkDigitsAreDistinctIn3DigitNumber(111));

        // Case: Not a three digit number
        assertEquals("not a three digit number", checker.checkDigitsAreDistinctIn3DigitNumber(99));
        assertEquals("not a three digit number", checker.checkDigitsAreDistinctIn3DigitNumber(1000));
        assertEquals("not a three digit number", checker.checkDigitsAreDistinctIn3DigitNumber(0));
        assertEquals("not a three digit number", checker.checkDigitsAreDistinctIn3DigitNumber(-123));
    }
}
