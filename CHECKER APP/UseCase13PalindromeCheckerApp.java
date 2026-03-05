import java.util.Scanner;

/**
 * UseCase13PalindromeCheckerApp
 *
 * Palindrome checker that ignores spaces,
 * punctuation, and letter case.
 *
 * @author Anish
 * @version 1.0
 */

class PalindromeUtil {

    public static boolean checkPalindrome(String input) {

        // Remove non-alphanumeric characters
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {

            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("      Advanced Palindrome Checker");
        System.out.println("==================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (PalindromeUtil.checkPalindrome(input)) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a PALINDROME.");
        }

        scanner.close();
    }
}