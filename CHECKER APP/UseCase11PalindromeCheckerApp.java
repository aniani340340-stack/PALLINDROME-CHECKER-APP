import java.util.Scanner;
import java.util.Stack;

/**
 * UseCase11PalindromeCheckerApp
 *
 * Demonstrates Object-Oriented Palindrome checking.
 * The palindrome logic is encapsulated inside a separate class.
 *
 * @author Anish
 * @version 1.0
 */

/* Palindrome Service Class */
class PalindromeChecker {

    // Method to check palindrome using Stack
    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original and reversed
        return input.equalsIgnoreCase(reversed);
    }
}


/* Main Application Class */
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      Palindrome Checker App");
        System.out.println("=================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(input)) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a PALINDROME.");
        }

        scanner.close();
    }
}