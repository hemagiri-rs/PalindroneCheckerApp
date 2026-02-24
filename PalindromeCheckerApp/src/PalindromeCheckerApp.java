import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Deque;  // ✅ Added import

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String str = "rotor";
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
