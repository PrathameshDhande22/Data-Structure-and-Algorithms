package tutorial.Linkedlist;

/**
 * NullNodeException appears when there is no Node in the Linked List or the
 * Linked List is empty.
 */
class NullNodeException extends Exception {

	public NullNodeException(String msg) {
		super(msg);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

/**
 * Doubly Linked List in which the node have the next Node reference also the
 * previous Node reference.
 */
public class DoublyLinkedList {

	private Node head;
	private Node tail;

	/**
	 * Size of the Doubly linked List or the Total Node in the Doubly Linked List.
	 */
	public int size;

	/**
	 * Node for storing the data and next and prev Node reference.
	 */
	public class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}

	}

	/**
	 * Traversing the Doubly Linked List from head.
	 */
	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " <-> ");
			temp = temp.next;
		}
		System.out.print("null\n");
	}

	/**
	 * Adding the Node in the First, or assigning it as a head in the Doubly Linked
	 * List.
	 * 
	 * @param data to be assigned in the Node.
	 */
	public void addFirst(int data) {
		Node newNode = new Node(data);
		size++;
		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	/**
	 * Removes the First Node from the Doubly Linked List.
	 * 
	 * @return the Node data which was removed.
	 * @throws NullNodeException when Doubly Linked List is empty.
	 */
	public int removeFirst() throws NullNodeException {
		if (head == null) {
			throw new NullNodeException("Empty Node");
		} else if (size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		int val = head.data;
		head = head.next;
		head.prev = null;
		size--;
		return val;
	}

	/**
	 * Adding the Node in the last of the Doubly Linked List or assigning it as a
	 * tail.
	 * 
	 * @param data to be assigned in the Node.
	 */
	public void addLast(int data) {
		Node newNode = new Node(data);
		size++;
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	/**
	 * Clears the Whole Linked List.
	 */
	public void clear() {
		head = tail = null;
		size = 0;
	}

	/**
	 * Removes the last node from the Doubly Linked List.
	 * 
	 * @return the Node data which was removed.
	 * @throws NullNodeException when the Doubly Linked List is Empty.
	 */
	public int removeLast() throws NullNodeException {
		if (head == null) {
			throw new NullNodeException("Empty Node");
		} else if (size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		int val = tail.data;
		tail = tail.prev;
		tail.next.prev = null;
		tail.next = null;
		size--;
		return val;
	}

	/**
	 * Traversing the Doubly Linked List in a Reverse Fashion.
	 */
	public void reverseTraverse() {
		Node temp = tail;
		while (temp != null) {
			System.out.print(temp.data + " <-> ");
			temp = temp.prev;
		}
		System.out.print("null\n");
	}

	/**
	 * Reversing the Doubly Linked List.
	 */
	public void reverseDLL() {
		Node curr = head;
		Node prev = null;
		Node next;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			curr.prev = next;
			prev = curr;
			curr = next;
		}

		head = prev;
	}

	public static void main(String[] args) throws NullNodeException {
		DoublyLinkedList dll = new DoublyLinkedList();
		System.out.println("AddFirst Operations");
		dll.addFirst(2);
		dll.addFirst(1);
		dll.print();
		System.out.println(dll.size);
		System.out.println("RemoveFirst Operations");
		dll.removeFirst();
		dll.print();
		System.out.println(dll.size);
		System.out.println("AddLast Operations");
		dll.addLast(3);
		dll.addFirst(1);
		dll.addLast(4);
		dll.print();
		System.out.println(dll.size);
//		System.out.println("Clear Operations");
//		dll.clear();
//		dll.print();
//		System.out.println(dll.size);
		System.out.println("Remove Last Operations");
		System.out.println(dll.removeLast());
		dll.print();
		System.out.println(dll.size);
		dll.addLast(5);
		dll.addLast(6);
		dll.print();
		System.out.println(dll.size);
		System.out.println("Traversing Reverse");
		dll.reverseTraverse();
		System.out.println("Reversing");
		dll.reverseDLL();
		dll.print();
	}

}
