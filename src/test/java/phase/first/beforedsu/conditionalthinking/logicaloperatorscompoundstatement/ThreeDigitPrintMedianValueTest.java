package phase.first.beforedsu.conditionalthinking.logicaloperatorscompoundstatement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeDigitPrintMedianValueTest {

    @Test
    void findMedianValueOfTheThreeDigit() {
        ThreeDigitPrintMedianValue calculator = new ThreeDigitPrintMedianValue();

        // Case: Median is b
        assertEquals(20, calculator.findMedianValueOfTheThreeDigit(10, 20, 30));
        assertEquals(20, calculator.findMedianValueOfTheThreeDigit(30, 20, 10));

        // Case: Median is a
        assertEquals(15, calculator.findMedianValueOfTheThreeDigit(15, 10, 20));
        assertEquals(15, calculator.findMedianValueOfTheThreeDigit(15, 20, 10));

        // Case: Median is c
        assertEquals(25, calculator.findMedianValueOfTheThreeDigit(10, 30, 25));
        assertEquals(25, calculator.findMedianValueOfTheThreeDigit(30, 10, 25));

        // Case: Duplicate numbers
        assertEquals(10, calculator.findMedianValueOfTheThreeDigit(10, 10, 20));
        assertEquals(10, calculator.findMedianValueOfTheThreeDigit(10, 20, 10));
        assertEquals(20, calculator.findMedianValueOfTheThreeDigit(10, 20, 20));

        // Case: All numbers same
        assertEquals(5, calculator.findMedianValueOfTheThreeDigit(5, 5, 5));

        // Case: Negative numbers
        assertEquals(-10, calculator.findMedianValueOfTheThreeDigit(-20, -10, 0));
    }
}