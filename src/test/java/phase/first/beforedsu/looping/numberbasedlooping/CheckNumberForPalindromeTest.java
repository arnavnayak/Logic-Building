package phase.first.beforedsu.looping.numberbasedlooping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckNumberForPalindromeTest {

    @Test
    void validateForPalindrome() {
        CheckNumberForPalindrome validator = new CheckNumberForPalindrome();

        // Test negative number
        assertEquals("negative number not to validate for palindrome", validator.validateForPalindrome(-10));

        // Test single digit
        assertEquals("single digit not to validate for palindrome", validator.validateForPalindrome(5));

        // Test palindrome
        // Note: Based on current logic in CheckNumberForPalindrome.java, 
        // the loop results need to be consistent with the implementation provided.
        assertEquals("palindrome : number given : 121 number after reversing : 121", validator.validateForPalindrome(121));

        // Test not a palindrome
        assertEquals("not a palindrome : number given : 123 number after reversing : 321", validator.validateForPalindrome(123));
    }
}