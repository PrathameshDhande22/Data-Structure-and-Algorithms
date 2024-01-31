package tutorial.Stack;

import java.util.Stack;

public class Reverse_String {

	/**
	 * Reversing the String using Stack.
	 * 
	 * @param str to reverse.
	 * @return reversed str.
	 */
	public static String reverseString(String str) {
		Stack<Character> st = new Stack<Character>();
		for (char c : str.toCharArray()) {
			st.push(c);
		}
		StringBuilder sb = new StringBuilder();
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(reverseString("abc"));
	}

}
