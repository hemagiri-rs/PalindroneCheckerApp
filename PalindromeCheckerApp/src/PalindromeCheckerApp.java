public class PalindromeCheckerApp {

    // Recursive function to check palindrome
    private static boolean isPalindrome(String str, int start, int end) {
        // Base condition: if start >= end, it's a palindrome
        if (start >= end) {
            return true;
        }

        // If mismatch found, return false
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call: move inward
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "madam";  // Hardcoded string

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
