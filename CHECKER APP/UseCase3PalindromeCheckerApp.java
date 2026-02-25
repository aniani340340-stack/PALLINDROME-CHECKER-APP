public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {
        // Hardcoded string
        String word = "madam";

        // Reverse the string using a loop
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Compare original and reversed strings using equals()
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}