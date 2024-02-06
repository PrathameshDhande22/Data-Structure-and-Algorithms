package question.Stack;

import java.util.Stack;

public class Palindrome_LinkedLIst {

    static class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    /**
     * We have a singly linked list of characters, write a function that returns
     * true if the given list is a
     * palindrome, else false.
     * 
     * These Question is solved using Stack.
     * 
     * @param head of the LinkedList.
     * @return true if the list is a palindrome, else false.
     */
    public static boolean isPalindrome(Node head) {
        Stack<Character> stack = new Stack<>();

        Node temp = head;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (!stack.isEmpty()) {
            char top = stack.pop();
            if (top != temp.data) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node list = new Node('A');
        list.next = new Node('B');
        list.next.next = new Node('C');
        list.next.next.next = new Node('B');
        list.next.next.next.next = new Node('A');
        traverse(list);
        System.out.println(isPalindrome(list));
    }
}
