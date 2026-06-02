package phase.first.beforedsu.conditionalthinking.simpleconditions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LargestAmongThreeNumbersTest {

    @Test
    void largestAmongThree() {
        LargestAmongThreeNumbers calculator = new LargestAmongThreeNumbers();

        // Test case 1: Largest is at the end
        assertEquals(30, calculator.largestAmongThree(Arrays.asList(10, 20, 30)));

        // Test case 2: Largest is in the middle
        assertEquals(50, calculator.largestAmongThree(Arrays.asList(10, 50, 30)));

        // Test case 3: Largest is at the beginning
        assertEquals(100, calculator.largestAmongThree(Arrays.asList(100, 20, 30)));

        // Test case 4: Negative numbers
        assertEquals(-5, calculator.largestAmongThree(Arrays.asList(-10, -5, -20)));

        // Test case 5: All numbers same
        assertEquals(7, calculator.largestAmongThree(Arrays.asList(7, 7, 7)));
    }
}
