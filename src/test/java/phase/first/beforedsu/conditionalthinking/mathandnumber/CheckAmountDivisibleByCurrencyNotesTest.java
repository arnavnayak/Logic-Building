package phase.first.beforedsu.conditionalthinking.mathandnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckAmountDivisibleByCurrencyNotesTest {

    @Test
    void amountDivisibleByCurrencyNotes() {
        CheckAmountDivisibleByCurrencyNotes checker = new CheckAmountDivisibleByCurrencyNotes();

        // Case: Perfectly divisible
        String expectedDivisible = "divisible perfectly  - 2000 Notes : 1 - 500 Notes  : 1 - 100 Notes  : 1 - remainder : 0";
        assertEquals(expectedDivisible, checker.amountDivisibleByCurrencyNotes(2600));

        // Case: Not perfectly divisible (has remainder less than 100)
        String expectedNotDivisible = "not divisible perfectly  - 2000 Notes : 1 - 500 Notes  : 1 - 100 Notes  : 1 - remainder : 50";
        assertEquals(expectedNotDivisible, checker.amountDivisibleByCurrencyNotes(2650));

        // Case: Large amount
        String expectedLarge = "divisible perfectly  - 2000 Notes : 5 - 500 Notes  : 0 - 100 Notes  : 0 - remainder : 0";
        assertEquals(expectedLarge, checker.amountDivisibleByCurrencyNotes(10000));

        // Case: Amount less than 100
        String expectedSmall = "not divisible perfectly  - 2000 Notes : 0 - 500 Notes  : 0 - 100 Notes  : 0 - remainder : 75";
        assertEquals(expectedSmall, checker.amountDivisibleByCurrencyNotes(75));
    }
}
