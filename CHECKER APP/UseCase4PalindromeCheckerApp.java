public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "racecar";

        // Convert string to character array
        char[] chars = word.toCharArray();

        // Two-pointer approach
        boolean isPalindrome = true;
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}
