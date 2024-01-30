package tutorial.Stack;

public class Stack_LinkedList {

	/**
	 * Node class for storing the data and next reference node.
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
	 * Stack Class using the LinkedList.
	 */
	public static class Stack {
		/**
		 * Also works as the top of the stack.
		 */
		private Node head = null;

		/**
		 * Checks if the Stack is empty or not.
		 * 
		 * @return true if Stack is empty otherwise false.
		 */
		public boolean isEmpty() {
			return head == null;
		}

		/**
		 * Adds the data in the top of the stack.
		 * 
		 * @param data to be added in the stack.
		 */
		public void push(int data) {
			Node nNode = new Node(data);

			if (isEmpty()) {
				head = nNode;
				return;
			}
			nNode.next = head;
			head = nNode;
		}

		/**
		 * Removes the top element from the stack.
		 * 
		 * @return the top element or removed element.
		 */
		public int pop() {
			if (isEmpty()) {
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;
		}

		/**
		 * top of the stack element.
		 * 
		 * @return data of the top of the stack.
		 */
		public int peek() {
			if (isEmpty()) {
				return -1;
			}
			return head.data;
		}
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);

		while (!st.isEmpty()) {
			System.out.println(st.peek());
			st.pop();
		}
	}

}
