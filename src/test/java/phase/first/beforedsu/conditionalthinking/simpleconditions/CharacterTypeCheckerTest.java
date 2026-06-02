package phase.first.beforedsu.conditionalthinking.simpleconditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTypeCheckerTest {

    @Test
    void checkCharacterType() {
        // Since the method prints to console, we are calling it to ensure no exceptions
        // and to follow the structure of the existing exercise.
        CharacterTypeChecker.checkCharacterType('A');
        CharacterTypeChecker.checkCharacterType('z');
        CharacterTypeChecker.checkCharacterType('5');
        CharacterTypeChecker.checkCharacterType('$');
    }
}