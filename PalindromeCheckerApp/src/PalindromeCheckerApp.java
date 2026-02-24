public class PalindromeCheckerApp {
    public static void main(String[] args){
        String str = "racecar";
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length-1;
        boolean isPalindrome = true;

        while(start<end){
            if(charArray[start]!= charArray[end]) {
                isPalindrome = false;
                break;

            }
            start++;
            end--;
        }

        if(isPalindrome){
            System.out.println(str + "is a palindrome");

        } else {
            System.out.println(str + " is not a palindrome");

        }

    }

}
