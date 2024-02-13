package tutorial.Queue;

public class Queue_In_LinkedList {

	/**
	 * Node Class For storing the data and next reference of the node.
	 */
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * Queue Implementation using LinkedList.
	 */
	class QueueLL {
		/**
		 * Queue Front of the linkedlist
		 */
		Node front = null;
		/**
		 * Queue rear position of the linkedlist.
		 */
		Node rear = null;

		/**
		 * Checks if the Queue is empty or not.
		 * 
		 * @return true if empty otherwise false.
		 */
		public boolean isEmpty() {
			return front == null & rear == null;
		}

		/**
		 * Adds the data or Node to the Queue / Linkedlist
		 * 
		 * @param data to be added in the queue.
		 */
		public void add(int data) {
			Node new_node = new Node(data);
			if (front == null) {
				front = rear = new_node;
				return;
			}
			rear.next = new_node;
			rear = new_node;
		}

		/**
		 * Removes the front Node from the Queue.
		 * 
		 * @return removed Front node data.
		 */
		public int remove() {
			if (isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			int result = front.data;
			if (front == rear) {
				front = rear = null;
			} else {
				front = front.next;
			}
			return result;
		}

		/**
		 * Gives the Front data in the queue.
		 * 
		 * @return front data in the Queue.
		 */
		public int peek() {
			if (isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			return front.data;
		}
	}

	public static void main(String[] args) {
		Queue_In_LinkedList q_IN_LL = new Queue_In_LinkedList();
		QueueLL qll = q_IN_LL.new QueueLL();
		qll.add(1);
		qll.add(2);
		qll.add(3);
		while (!qll.isEmpty()) {
			System.out.println(qll.remove());
		}
	}

}
