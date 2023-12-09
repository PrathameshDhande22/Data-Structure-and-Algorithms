package tutorial.Linkedlist;

class llist {
	public LNode head;
	public LNode tail;

	static class LNode {
		int data;
		LNode next;

		public LNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * Adds the data to last of the Linked List
	 * 
	 * @param data to add in the linked List.
	 */
	public void addLast(int data) {
		LNode nNode = new LNode(data);
		if (head == null) {
			head = tail = nNode;
		} else {
			tail.next = nNode;
			tail = nNode;
		}
	}

	/**
	 * Traversing the Linked List.
	 */
	public void traverse() {
		LNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("NULL\n");
	}

	/**
	 * Finds the Middle Node from the Linked List using Slow-Fast Method, in which
	 * slow increments by 1 and fast increments by 2 Node.
	 * 
	 * @param head of the Linked List to be Passed.
	 * @return Middle Node.
	 */
	public LNode findMid(LNode head) {
		// using slow - fast method
		LNode slow = head;
		LNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	/**
	 * Checks if the Linked List is Palindrome or Not.
	 * 
	 * @return true if Linked List is Palindrome otherwise false.
	 */
	public boolean checkPalindrome() {
		if (head == null || head.next == null) {
			return true;
		}
		// finding the Middle Node
		LNode mid = findMid(head);

		// reversing the 2nd Half of the Linked List
		LNode prev = null;
		LNode curr = mid;
		LNode next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		// checking if it's palindrome
		LNode left = head;
		LNode right = prev;
		while (right != null) {
			if (left.data != right.data) {
				return false;
			}
			left = left.next;
			right = right.next;
		}
		return true;
	}
}

public class Palindrom_in_linkedList {
	public static void main(String[] args) {
		llist ll = new llist();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(2);
		ll.addLast(2);
		ll.addLast(1);
		ll.traverse();
		System.out.println("Middle Node -> " + ll.findMid(ll.head).data);
		System.out.println(ll.checkPalindrome());

	}
}
