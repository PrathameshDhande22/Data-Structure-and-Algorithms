package tutorial.Linkedlist;

public class Remove_Cycle_in_LinkedList {
	public static Node head;

	/**
	 * Node class for storing the data and next reference node.
	 */
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * Traversing the Linked List.
	 */
	public static void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("NULL\n");
	}

	/**
	 * Remove's the cycle from the linked list if it exits.
	 */
	public static void removeCycle() {
		Node fast = head;
		Node slow = head;
		Node prevtrack = null;
		boolean cycle = false;

		// detecting the cycle
		while (fast != null && fast.next != null) {
			prevtrack = slow;
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				cycle = true;
				break;
			}
		}

		if (slow == head && fast == head) {
			prevtrack.next = null;
			print();
		}
		// removing the cycle
		else if (cycle) {
			Node prev = null;
			slow = head;
			while (slow != fast) {
				prev = fast;
				slow = slow.next;
				fast = fast.next;
			}
			prev.next = null;
			print();
		} else {
			System.out.println("No Cycle Exists");
		}
	}

	public static void main(String[] args) {
		head = new Node(1);
		Node temp = new Node(2);
		head.next = temp;
		head.next.next = new Node(3);
		head.next.next.next = head;
//		head.next.next.next.next = head;
//		print();
		removeCycle();

	}

}
