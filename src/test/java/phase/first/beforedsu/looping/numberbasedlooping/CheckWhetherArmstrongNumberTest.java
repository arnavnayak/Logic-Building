package phase.first.beforedsu.looping.numberbasedlooping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckWhetherArmstrongNumberTest {

    @Test
    void countTheNumberOfDigit() {
        CheckWhetherArmstrongNumber validator = new CheckWhetherArmstrongNumber();
        
        assertEquals(1, validator.countTheNumberOfDigit(5));
        assertEquals(3, validator.countTheNumberOfDigit(153));
        assertEquals(4, validator.countTheNumberOfDigit(1634));
        assertEquals(1, validator.countTheNumberOfDigit(0));
        assertEquals(-1, validator.countTheNumberOfDigit(-100));
    }

    @Test
    void checkWhetherArmstrongNumberOrNot() {
        CheckWhetherArmstrongNumber validator = new CheckWhetherArmstrongNumber();

        // Test Armstrong numbers
        assertEquals("Armstrong number : number given : 153 sum of digits raised to power : 153", 
                validator.checkWhetherArmstrongNumberOrNot(153));
        assertEquals("Armstrong number : number given : 1634 sum of digits raised to power : 1634", 
                validator.checkWhetherArmstrongNumberOrNot(1634));
        assertEquals("Armstrong number : number given : 370 sum of digits raised to power : 370", 
                validator.checkWhetherArmstrongNumberOrNot(370));

        // Test negative number
        assertEquals("negative number should be ignored for validating Armstrong number",
                validator.checkWhetherArmstrongNumberOrNot(-153));

        // Test non-Armstrong numbers
        assertEquals("not an Armstrong number : number given : 123 sum of digits raised to power : 36", 
                validator.checkWhetherArmstrongNumberOrNot(123));
        assertEquals("not an Armstrong number : number given : 10 sum of digits raised to power : 1", 
                validator.checkWhetherArmstrongNumberOrNot(10));
    }
}
