package phase.first.beforedsu.conditionalthinking.simpleconditions;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckNumberDivisibleBy3Or5Test {


    @Test
    void checkNumberDivisibleBy3Or5() {

        CheckNumberDivisibleBy3Or5 checkNumberDivisibleBy3Or5 = new CheckNumberDivisibleBy3Or5();
        Boolean result = checkNumberDivisibleBy3Or5.checkNumberDivisibleBy3Or5(15);
        assertTrue(result);

        result = checkNumberDivisibleBy3Or5.checkNumberDivisibleBy3Or5(5);
        assertFalse(result);

        result = checkNumberDivisibleBy3Or5.checkNumberDivisibleBy3Or5(2);
        assertFalse(result);

        result = checkNumberDivisibleBy3Or5.checkNumberDivisibleBy3Or5(17);
        assertFalse(result);


    }
}
