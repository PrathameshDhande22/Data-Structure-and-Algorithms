package tutorial.Stack;

import java.util.Stack;

/**
 * Implementing Stack using Java Collection Framework
 */
public class Stack_JCF {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st);
		while (!st.isEmpty()) {
			System.out.println(st.peek());
			st.pop();
		}
	}

}
