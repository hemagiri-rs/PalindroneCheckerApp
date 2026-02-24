public class PalindromeCheckerApp {
    public static void main(String[] args){
        String str = "level";
        Stack<Character> stack = new Stack<>();
        for (int i=0;i< str.length();i++){
            stack.psuh(str.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()){
            reversed = reversed + stack.pop();
        }


        if(isPalindrome){
            System.out.println(str + "is a palindrome");

        } else {
            System.out.println(str + " is not a palindrome");

        }

    }

}
