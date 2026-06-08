package phase.first.beforedsu.looping.basiclooping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindProductOfTheDigitsOfANumberTest {

    @Test
    void returnProductOfDigitsOfANumber() {
        FindProductOfTheDigitsOfANumber calculator = new FindProductOfTheDigitsOfANumber();

        // Test negative number
        assertEquals("should be a positive number to calculate product of digits", calculator.returnProductOfDigitsOfANumber(-5));

        // Test zero
        assertEquals("product of digits of 0 is 0", calculator.returnProductOfDigitsOfANumber(0));

        // Test single digit
        assertEquals("product of digits of 5 is 5", calculator.returnProductOfDigitsOfANumber(5));

        // Test multiple digits
        assertEquals("product of digits of 123 is 6", calculator.returnProductOfDigitsOfANumber(123));
        assertEquals("product of digits of 543 is 60", calculator.returnProductOfDigitsOfANumber(543));

        // Test with zero in digits
        assertEquals("product of digits of 102 is 0", calculator.returnProductOfDigitsOfANumber(102));
    }
}
