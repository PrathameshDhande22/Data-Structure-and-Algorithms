package tutorial.Linkedlist;

public class Detect_Cycle_in_LL {
	public static Node head;
	public static Node tail;

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
	 * Detecting if there is a cycle in the linked List or not.
	 * 
	 * @return true if there is a cycle otherwise false.
	 */
	public static boolean isCyclic() {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
//		head.next.next.next.next = head.next;
		head.next.next.next.next = new Node(5);
//		print();
		System.out.println(isCyclic());
	}

}
