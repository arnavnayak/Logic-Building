package phase.first.beforedsu.looping.mathematicallooping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintSumOfFactorsOfGivenNumberTest {

    @Test
    void sumOfFactorsOfANumber() {
        PrintSumOfFactorsOfGivenNumber calculator = new PrintSumOfFactorsOfGivenNumber();

        assertEquals("sum of factors of 6 is 12", calculator.sumOfFactorsOfANumber(6));
        assertEquals("sum of factors of 10 is 18", calculator.sumOfFactorsOfANumber(10));
        assertEquals("sum of factors of 12 is 28", calculator.sumOfFactorsOfANumber(12));
        assertEquals("sum of factors of 24 is 60", calculator.sumOfFactorsOfANumber(24));
        assertEquals("sum of factors of 1 is 1", calculator.sumOfFactorsOfANumber(1));
        assertEquals("sum of factors of 7 is 8", calculator.sumOfFactorsOfANumber(7));
        assertEquals("sum of factors of 11 is 12", calculator.sumOfFactorsOfANumber(11));
        assertEquals("number not valid for factors", calculator.sumOfFactorsOfANumber(-5));
    }
}