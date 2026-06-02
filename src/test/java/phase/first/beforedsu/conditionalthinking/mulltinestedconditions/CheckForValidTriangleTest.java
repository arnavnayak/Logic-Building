package phase.first.beforedsu.conditionalthinking.mulltinestedconditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckForValidTriangleTest {

    @Test
    void testValidTriangle() {
        CheckForValidTriangle checker = new CheckForValidTriangle();
        // A standard valid triangle (e.g., sides 3, 4, 5)
        assertTrue(checker.checkIDValidTriangle(3, 4, 5));
        assertTrue(checker.checkIDValidTriangle(5, 5, 5)); // Equilateral
    }

    @Test
    void testInvalidTriangleSumOfSides() {
        CheckForValidTriangle checker = new CheckForValidTriangle();
        // Sum of two sides is not greater than the third
        assertFalse(checker.checkIDValidTriangle(1, 2, 3));
        assertFalse(checker.checkIDValidTriangle(10, 2, 3));
    }

    @Test
    void testInvalidTriangleZeroOrNegativeSides() {
        CheckForValidTriangle checker = new CheckForValidTriangle();
        // One or more sides are zero
        assertFalse(checker.checkIDValidTriangle(0, 4, 5));
        assertFalse(checker.checkIDValidTriangle(3, 0, 5));
        assertFalse(checker.checkIDValidTriangle(3, 4, 0));
        assertFalse(checker.checkIDValidTriangle(0, 0, 0));

        // Negative sides
        assertFalse(checker.checkIDValidTriangle(-3, 4, 5));
        assertFalse(checker.checkIDValidTriangle(3, -4, 5));
    }
}
