package phase.first.beforedsu.looping.basiclooping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintSumOfOddAndEvenNumberTilNGivenNumberTest {

    @Test
    void sumOfAllEvenTillNGivenNumberThroughLoop() {
        PrintSumOfOddAndEvenNumberTilNGivenNumber calculator = new PrintSumOfOddAndEvenNumberTilNGivenNumber();
        assertEquals(30, calculator.sumOfAllEvenTillNGivenNumberThroughLoop(10));
        assertEquals(6, calculator.sumOfAllEvenTillNGivenNumberThroughLoop(5));
        assertEquals(0, calculator.sumOfAllEvenTillNGivenNumberThroughLoop(1));
    }

    @Test
    void sumOfAllOddTillNGivenNumberThroughLoop() {
        PrintSumOfOddAndEvenNumberTilNGivenNumber calculator = new PrintSumOfOddAndEvenNumberTilNGivenNumber();
        assertEquals(25, calculator.sumOfAllOddTillNGivenNumberThroughLoop(10));
        assertEquals(9, calculator.sumOfAllOddTillNGivenNumberThroughLoop(5));
        assertEquals(1, calculator.sumOfAllOddTillNGivenNumberThroughLoop(1));
    }

    @Test
    void sumOfAllEvenTillNGivenNumberThroughFormula() {
        PrintSumOfOddAndEvenNumberTilNGivenNumber calculator = new PrintSumOfOddAndEvenNumberTilNGivenNumber();
        assertEquals(30, calculator.sumOfAllEvenTillNGivenNumberThroughFormula(10));
        assertEquals(6, calculator.sumOfAllEvenTillNGivenNumberThroughFormula(5));
        assertEquals(0, calculator.sumOfAllEvenTillNGivenNumberThroughFormula(1));
    }

    @Test
    void sumOfAllOddTillNGivenNumberThroughFormula() {
        PrintSumOfOddAndEvenNumberTilNGivenNumber calculator = new PrintSumOfOddAndEvenNumberTilNGivenNumber();
        assertEquals(25, calculator.sumOfAllOddTillNGivenNumberThroughFormula(10));
        assertEquals(9, calculator.sumOfAllOddTillNGivenNumberThroughFormula(5));
        assertEquals(1, calculator.sumOfAllOddTillNGivenNumberThroughFormula(1));
    }
}
