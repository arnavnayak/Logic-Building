package phase.first.beforedsu.conditionalthinking.simpleconditions;

public class CharacterTypeChecker {

    public static void checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an Uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Lowercase letter.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit.");
        } else {
            // If it's not an uppercase letter, lowercase letter, or digit, it must be a special character
            System.out.println(ch + " is a Special character.");
        }
    }
}