package tutorial.Stack;

import java.util.Stack;

public class Push_At_Bottom {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);
		pushAtBottom(s, 4);
		System.out.println(s);
	}

	/**
	 * Push the data at the bottom of the stack.
	 * 
	 * @param s    Stack to be Passed in the Parameter
	 * @param data to be pushed in the bottom of the stack.
	 */
	public static void pushAtBottom(Stack<Integer> s, int data) {
		if (s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pushAtBottom(s, data);
		s.push(top);
	}

}
