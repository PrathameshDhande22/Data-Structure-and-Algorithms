package tutorial.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Stack_using_2Queue {

	/**
	 * Implementation of Stack using Two Queues
	 */
	class Stack {
		private Queue<Integer> q1 = new LinkedList<Integer>();
		private Queue<Integer> q2 = new LinkedList<Integer>();

		/**
		 * Checking if the both queues are empty or not.
		 * 
		 * @return true if Empty else false.
		 */
		public boolean isEmpty() {
			return q1.isEmpty() && q2.isEmpty();
		}

		/**
		 * Push data into the stack through Queues
		 * 
		 * @param data to be added into the stack.
		 */
		public void push(int data) {
			if (!q1.isEmpty()) {
				q1.add(data);
			} else {
				q2.add(data);
			}
		}

		/**
		 * Removing data from the top of the stack.
		 * 
		 * @return data removed from the stack.
		 */
		public int pop() {
			int top = -1;
			if (this.isEmpty()) {
				System.out.println("Stack is Empty");
				return top;
			}
			if (!q1.isEmpty()) {
				while (!q1.isEmpty()) {
					top = q1.remove();
					if (q1.isEmpty()) {
						return top;
					}
					q2.add(top);
				}
			} else {
				while (!q2.isEmpty()) {
					top = q2.remove();
					if (q2.isEmpty()) {
						return top;
					}
					q1.add(top);
				}
			}
			return -1;
		}

		/**
		 * Peek Function of the Stack.
		 * 
		 * @return top element from the stack.
		 */
		public int peek() {
			int top = -1;
			if (this.isEmpty()) {
				System.out.println("Stack is Empty");
				return top;
			}
			if (!q1.isEmpty()) {
				while (!q1.isEmpty()) {
					top = q1.remove();
					q2.add(top);
				}
			} else {
				while (!q2.isEmpty()) {
					top = q2.remove();
					q1.add(top);
				}
			}
			return top;
		}

		@Override
		public String toString() {
			return "Stack [q1=" + q1 + ", q2=" + q2 + "]";
		}

	}

	public static void main(String[] args) {
		Stack_using_2Queue s2 = new Stack_using_2Queue();
		Stack s = s2.new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s);
	}

}
