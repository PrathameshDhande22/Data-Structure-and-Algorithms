package tutorial.Linkedlist;

public class MergeSort_LinkedList {

	/**
	 * Head of the Linked List.
	 */
	public Node head;

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

	/**
	 * Used to find the Middle Node of the Linked List.
	 * 
	 * @param head of the Linked List.
	 * @return Middle Node of the Linked List for the given Head Node.
	 */
	private Node getMid(Node head) {
		Node slow = head;
		Node fast = head.next;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	/**
	 * Used to merge the left part and right part of the linked List.
	 * 
	 * @param left  Part of the Linked List.
	 * @param right Part of the Linked List
	 * @return sorted head of the Linked List.
	 */
	private Node merge(Node left, Node right) {
		Node sorted = new Node(-1);
		Node temp = sorted;

		while (left != null && right != null) {

			if (left.data <= right.data) {
				temp.next = left;
				left = left.next;
				temp = temp.next;
			} else {
				temp.next = right;
				right = right.next;
				temp = temp.next;
			}
		}

		while (left != null) {
			temp.next = left;
			left = left.next;
			temp = temp.next;
		}

		while (right != null) {
			temp.next = right;
			right = right.next;
			temp = temp.next;
		}

		return sorted.next;
	}

	/**
	 * Sorts the Linked List according to the data given in the Node
	 * 
	 * @param head of the Linked List
	 * @return head of the Sorted and Merged Linked List.
	 */
	public Node mergeSort(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node mid = getMid(head);
		Node rightPart = mid.next;
		mid.next = null;
		Node left = mergeSort(head);
		Node right = mergeSort(rightPart);

		return merge(left, right);
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
		MergeSort_LinkedList ll = new MergeSort_LinkedList();
		ll.head = new Node(4);
		ll.head.next = new Node(6);
		ll.head.next.next = new Node(1);
		ll.head.next.next.next = new Node(7);
		ll.head.next.next.next.next = new Node(2);
		ll.print();
		ll.head = ll.mergeSort(ll.head);
		ll.print();
	}

}
