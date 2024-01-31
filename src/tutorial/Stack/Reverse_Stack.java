package tutorial.Stack;

import java.util.Stack;

public class Reverse_Stack {

	/**
	 * Reversing stack element using Recursion with the help of the Push at bottom
	 * Function.
	 * 
	 * @param s Stack to be passed to reverse the stack.
	 */
	public static void reverseStack(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}
		int top = s.pop();
		reverseStack(s);
		Push_At_Bottom.pushAtBottom(s, top);
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);

		System.out.println(s);
		reverseStack(s);
		System.out.println(s);
	}

}
