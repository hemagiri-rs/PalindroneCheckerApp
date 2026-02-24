import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String str = "level";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Corrected for loop
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
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
