package tutorial.Queue;

import java.util.Stack;

public class Queue_using_2Stacks {

	/**
	 * Queue Implementation using Two stacks
	 */
	class Queue {
		private Stack<Integer> s1 = new Stack<Integer>();
		private Stack<Integer> s2 = new Stack<Integer>();

		/**
		 * Checks if the queue is empty or not
		 * 
		 * @return true if empty else false.
		 */
		public boolean isEmpty() {
			return s1.isEmpty();
		}

		/**
		 * Adds the data into the queue.
		 * 
		 * @param data to be added in the queue.
		 */
		public void add(int data) {
			// if s1 stack is full then add all the elements from s1 stack to s2 stack.
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}

			// add the data when the stack1 is empty.
			s1.push(data);

			// add all the data from stack2 to stack1.
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}

		/**
		 * Remove function of Queue
		 * 
		 * @return removed data from the queue.
		 */
		public int remove() {
			if (this.isEmpty()) {
				System.out.println("Stack is Empty");
				return -1;
			}
			return s1.pop();
		}

		/**
		 * Peek function of Queue
		 * 
		 * @return data in front part of the Queue.
		 */
		public int peek() {
			if (this.isEmpty()) {
				System.out.println("Stack is Empty");
				return -1;
			}
			return s1.peek();
		}

	}

	public static void main(String[] args) {
		Queue_using_2Stacks q2 = new Queue_using_2Stacks();
		Queue qs = q2.new Queue();
		qs.add(1);
		qs.add(2);
		qs.add(3);
		while (!qs.isEmpty()) {
			System.out.println(qs.peek());
			qs.remove();
		}
	}

}
