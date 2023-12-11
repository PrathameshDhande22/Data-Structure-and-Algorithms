package tutorial.Linkedlist;

import java.util.LinkedList;

/**
 * Implementing the Linked List using Java Collection Framework.
 */
public class LinkedList_in_JCF {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		// Linked List Method to add First in the Linked List
		ll.addFirst(1);
		ll.addFirst(2);

		// Linked List Method to add last in the Linked List
		ll.addLast(3);

		// printing the LinkedList
		System.out.println(ll);

		// returns the Head of the Linked List
		System.out.println(ll.element());

		// Methods to remove the first element
		ll.removeFirst();

		// Methods to remove the last element
		ll.removeLast();

		// return the size of the Linked List
		ll.size();

		System.out.println(ll);
	}

}
