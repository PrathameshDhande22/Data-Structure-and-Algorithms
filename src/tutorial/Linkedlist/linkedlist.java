package tutorial.Linkedlist;

/**
 * LinkedList Implementation. Linkedlist is a linear data Structure.
 */
public class linkedlist {
	public Node head;
	public Node tail;

	/**
	 * These will keep Track of the LinkedList Size;
	 */
	private int size = 0;

	/**
	 * Node Class For storing the data and next reference to the node.
	 */
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * Adds the data to the first of the linked List. Works in Time Complexity of
	 * O(1) Constant Time.
	 * 
	 * @param data To add
	 */
	public void addFirst(int data) {
		Node newNode = new Node(data);
		this.size++;
		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	/**
	 * Adds the data to the last of the linked List. it also works in Time
	 * Complexity of Constant Time
	 * 
	 * @param data To add
	 */
	public void addLast(int data) {
		Node newNode = new Node(data);
		this.size++;
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	/**
	 * Traverses the entire linked List.
	 */
	public void traverse() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("NULL\n");
	}

	/**
	 * Adds the Node at the given index if index is more than the size of the linked
	 * list then throws the {@code IndexOutOfBoundsException}.
	 * 
	 * @param index at which the data is to be added
	 * @param data  to add in the given index
	 * @throws IndexOutOfBoundsException when index is more than the size of the
	 *                                   linkedlist
	 */
	public void add(int index, int data) throws IndexOutOfBoundsException {
		if (index == 0) {
			this.addFirst(data);
		} else if (index > this.size) {
			throw new IndexOutOfBoundsException(
					"%d is not valid index for length %d. Index should be less than size.".formatted(index, this.size));
		} else {
			Node newNode = new Node(data);
			Node temp = head;
			int i = 0;
			while (i < index - 1) {
				temp = temp.next;
				i++;
			}
			this.size++;
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	/**
	 * Get the size of the Linked List.
	 * 
	 * @return size of the Linked List.
	 */
	public int getSize() {
		return this.size;
	}

	/**
	 * Removes the first Node or data from the LinkedList.
	 * 
	 * @return the removed Node data.
	 * @throws NullPointerException when Linkedlist has no data.
	 */
	public int removeFirst() throws NullPointerException {
		if (head == null) {
			throw new NullPointerException("The Linked list has no data");
		} else if (this.size == 1) {
			int val = head.data;
			head = tail = null;
			this.size = 0;
			return val;
		} else {
			int val = head.data;
			this.size--;
			head = head.next;
			return val;
		}
	}

	/**
	 * Removes the tail or last node from the Linked list.
	 * 
	 * @return the removed Node data.
	 * @throws NullPointerException when linked list has no Node.
	 */
	public int removeLast() throws NullPointerException {
		if (tail == null) {
			throw new NullPointerException("The Linked list has no data");
		} else if (size == 1) {
			int val = head.data;
			head = tail = null;
			this.size = 0;
			return val;
		} else {
			Node prev = head;
			int val = tail.data;
			for (int i = 0; i < this.size - 2; i++) {
				prev = prev.next;
			}
			prev.next = null;
			tail = prev;
			size--;
			return val;
		}
	}

	public static void main(String[] args) {
		linkedlist ll = new linkedlist();
		ll.addFirst(2);
		ll.addFirst(1);
		ll.addLast(3);
		ll.addLast(4);
		ll.traverse();
		ll.add(3, 5);
		ll.traverse();
		System.out.println(ll.removeFirst());
		ll.traverse();
		System.out.println(ll.removeLast());
		ll.traverse();
		System.out.println(ll.size);
	}

}
