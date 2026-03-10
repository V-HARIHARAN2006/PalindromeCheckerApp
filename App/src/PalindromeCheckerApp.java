/**
 * ======================================================
 * MAIN CLASS - PalindromeCheckerApp
 * ======================================================
 *
 * UC3: Check whether a string is a palindrome by reversing it
 *
 * Goal:
 * Reverse a string using a loop and compare it with the original.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String original = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Display original and reversed strings
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        // Compare strings using equals()
        if (original.equals(reversed)) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: It is NOT a Palindrome");
        }
    }
}