package phase.first.beforedsu.conditionalthinking.mulltinestedconditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckTheTypeOfTriangleTest {

    @Test
    void checkTypeOfTriangle() {
        CheckTheTypeOfTriangle checker = new CheckTheTypeOfTriangle();

        // Equilateral triangle
        assertEquals("Equilateral triangle", checker.checkTypeOfTriangle(5, 5, 5));

        // Isosceles triangle
        assertEquals("Isosceles triangle", checker.checkTypeOfTriangle(5, 5, 3));
        assertEquals("Isosceles triangle", checker.checkTypeOfTriangle(3, 5, 5));
        assertEquals("Isosceles triangle", checker.checkTypeOfTriangle(5, 3, 5));

        // Scalene triangle
        assertEquals("Scalene triangle", checker.checkTypeOfTriangle(3, 4, 5));

        // Not a valid triangle
        assertEquals("not a valid triangle", checker.checkTypeOfTriangle(1, 2, 3));
        assertEquals("not a valid triangle", checker.checkTypeOfTriangle(0, 0, 0));
        assertEquals("not a valid triangle", checker.checkTypeOfTriangle(-1, 2, 2));
    }
}
