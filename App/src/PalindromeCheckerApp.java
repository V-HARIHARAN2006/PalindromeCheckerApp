/**
 * ======================================================
 * MAIN CLASS - PalindromeCheckerApp
 * ======================================================
 *
 * UC4: Check whether a string is a palindrome by reversing it
 * using user input.
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Variable to store reversed string
        String reversed = "";

        // Reverse string using loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Display reversed string
        System.out.println("Reversed String: " + reversed);

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: It is NOT a Palindrome");
        }

        scanner.close();
    }
}