class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeCheckerApp {
    // Convert string to linked list
    private static Node convertToLinkedList(String str) {
        Node head = null, tail = null;
        for (int i = 0; i < str.length(); i++) {
            Node newNode = new Node(str.charAt(i));
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Reverse a linked list
    private static Node reverse(Node head) {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Check palindrome using linked list
    private static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Find middle using slow/fast pointers
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow.next);

        // Compare halves
        Node firstHalf = head;
        Node temp = secondHalf;
        boolean palindrome = true;
        while (temp != null) {
            if (firstHalf.data != temp.data) {
                palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        // Optional: restore list
        slow.next = reverse(secondHalf);

        return palindrome;
    }

    public static void main(String[] args) {
        String str = "level";  // Hardcoded string
        Node head = convertToLinkedList(str);

        if (isPalindrome(head)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
