package tutorial.Stack;

import java.util.ArrayList;

public class Stack_ArrayList {

	/**
	 * Stack Implementation using ArrayList.
	 */
	class Stack {
		/**
		 * Arraylist for storing the data in the form of stack.
		 */
		private ArrayList<Integer> list = new ArrayList<Integer>();

		/**
		 * Checks if the Stack is Empty in simply way it checks if the list is empty or
		 * not.
		 * 
		 * @return true if Stack is Empty else return false.
		 */
		public boolean isEmpty() {
			return list.size() == 0;
		}

		/**
		 * Push the data in to the stack.
		 * 
		 * @param data to be added in the top of the stack.
		 */
		public void push(int data) {
			list.add(data);
		}

		/**
		 * Removes the top of the stack element from the stack and returns the removed
		 * element.
		 * 
		 * @return data removed from top of the stack.
		 */
		public int pop() {
			if (isEmpty()) {
				return -1;
			}
			int top = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			return top;
		}

		/**
		 * Top of the stack element.
		 * 
		 * @return data at top of the stack.
		 */
		public int peek() {
			if (isEmpty()) {
				return -1;
			}
			return list.get(list.size() - 1);
		}
	}

	public static void main(String[] args) {
		Stack_ArrayList sarr = new Stack_ArrayList();
		Stack st = sarr.new Stack();
		st.push(1);
		st.push(2);
		st.push(3);

		while (!st.isEmpty()) {
			System.out.println(st.peek());
			st.pop();
		}

	}

}
