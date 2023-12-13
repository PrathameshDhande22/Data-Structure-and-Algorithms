package tutorial.Linkedlist;

public class ZigZag_LinkedList {

	/**
	 * Node class for storing the data and next reference.
	 */
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head;

	/**
	 * Printing the Linked List in the Zig-Zag Form.
	 */
	public void zigZag() {
		// finding the middle Node's last node
		Node slow = head;
		Node fast = head.next;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// middle Node
		Node mid = slow;

		// Reversing the 2nd Half of the Linked List
		Node next;
		Node curr = mid.next;
		mid.next = null;
		Node prev = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		// alternate merge or zig zag merge
		Node left = head;
		Node right = prev;
		Node nextL, nextR;

		while (left != null && right != null) {
			nextL = left.next;
			left.next = right;
			nextR = right.next;
			right.next = nextL;

			left = nextL;
			right = nextR;
		}
	}

	/**
	 * Traversing the Linked List.
	 */
	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("NULL\n");
	}

	public static void main(String[] args) {
		ZigZag_LinkedList ll = new ZigZag_LinkedList();
		ll.head = new Node(1);
		ll.head.next = new Node(2);
		ll.head.next.next = new Node(3);
		ll.head.next.next.next = new Node(4);
		ll.head.next.next.next.next = new Node(5);
		ll.print();
		ll.zigZag();
		ll.print();
	}

}
