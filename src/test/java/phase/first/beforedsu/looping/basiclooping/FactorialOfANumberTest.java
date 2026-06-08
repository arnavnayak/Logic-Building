package phase.first.beforedsu.looping.basiclooping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialOfANumberTest {

    @Test
    void returnFactorialOfANumber() {
        FactorialOfANumber calculator = new FactorialOfANumber();

        // Test negative number
        assertEquals("should be a positive number to calculate factorial", calculator.returnFactorialOfANumber(-1));

        // Test base cases
        assertEquals("factorial of 0 is 1", calculator.returnFactorialOfANumber(0));
        assertEquals("factorial of 1 is 1", calculator.returnFactorialOfANumber(1));

        // Test standard cases
        assertEquals("factorial of 5 is 120", calculator.returnFactorialOfANumber(5));

        // Test large number (exceeding long limit)
        assertEquals("factorial of 25 is 15511210043330985984000000", calculator.returnFactorialOfANumber(25));
    }
}