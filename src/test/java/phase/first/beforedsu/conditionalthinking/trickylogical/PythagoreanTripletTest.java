package phase.first.beforedsu.conditionalthinking.trickylogical;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PythagoreanTripletTest {

    @Test
    void isPythagoreanTriplet() {
        PythagoreanTriplet checker = new PythagoreanTriplet();

        // Valid Pythagorean triplets
        assertTrue(checker.isPythagoreanTriplet(3, 4, 5));
        assertTrue(checker.isPythagoreanTriplet(5, 12, 13));
        assertTrue(checker.isPythagoreanTriplet(8, 15, 17));

        // Invalid triplets
        assertFalse(checker.isPythagoreanTriplet(1, 2, 3));
        assertFalse(checker.isPythagoreanTriplet(3, 4, 6));

        // Note: The current implementation specifically checks a^2 + b^2 == c^2.
        // It does not check other permutations or validity as a triangle unless passed in that order.
        assertFalse(checker.isPythagoreanTriplet(5, 3, 4));
    }
}
