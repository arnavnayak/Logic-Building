package phase.first.beforedsu.looping.basiclooping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintSumOfNNaturalNumbersTest {

    @Test
    void printSumOfNNaturalNumbersThroughLoops() {
        PrintSumOfNNaturalNumbers calculator = new PrintSumOfNNaturalNumbers();

        assertEquals(15, calculator.printSumOfNNaturalNumbersThroughLoops(5));
        assertEquals(55, calculator.printSumOfNNaturalNumbersThroughLoops(10));
        assertEquals(1, calculator.printSumOfNNaturalNumbersThroughLoops(1));
        assertEquals(0, calculator.printSumOfNNaturalNumbersThroughLoops(0));
    }

    @Test
    void printSumOfNNaturalNumbersThroughFormula() {
        PrintSumOfNNaturalNumbers calculator = new PrintSumOfNNaturalNumbers();

        assertEquals(15, calculator.printSumOfNNaturalNumbersThroughFormula(5));
        assertEquals(55, calculator.printSumOfNNaturalNumbersThroughFormula(10));
        assertEquals(1, calculator.printSumOfNNaturalNumbersThroughFormula(1));
        assertEquals(0, calculator.printSumOfNNaturalNumbersThroughFormula(0));
    }
}
