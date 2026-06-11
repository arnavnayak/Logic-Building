package phase.first.beforedsu.looping.mathematicallooping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheHCFOrGCDOfGivenNumbersTest {

    @Test
    void returnHCFOfGivenNumbers() {
        FindTheHCFOrGCDOfGivenNumbers calculator = new FindTheHCFOrGCDOfGivenNumbers();

        assertEquals("the HCF of 12 and 18 is 6", calculator.returnHCFOfGivenNumbers(12, 18));
        assertEquals("the HCF of 13 and 7 is 1", calculator.returnHCFOfGivenNumbers(13, 7));
        assertEquals("the HCF of 5 and 0 is 5", calculator.returnHCFOfGivenNumbers(5, 0));
        assertEquals("the HCF of 0 and 5 is 5", calculator.returnHCFOfGivenNumbers(0, 5));
        assertEquals("the HCF of 10 and 10 is 10", calculator.returnHCFOfGivenNumbers(10, 10));
        assertEquals("the HCF of 24 and 36 is 12", calculator.returnHCFOfGivenNumbers(24, 36));
        assertEquals("the HCF of 148 and 132 is 4", calculator.returnHCFOfGivenNumbers(148, 132));
        assertEquals("the HCF of 0 and 0 is undefined", calculator.returnHCFOfGivenNumbers(0, 0));
    }
}
