package tutorial.Stack;

import java.util.Stack;

public class Valid_Parenthesis {

	/**
	 * Given a string s containing just the characters
	 * {@code '(',')','[',']','{','}'} determine if the input string is valid. The
	 * string is valid only if opening and closing brackets are closing properly.
	 * 
	 * @param str of brackets to be check if its' valid or not
	 * @return true if valid otherwise false.
	 */
	public static boolean isValid(String str) {
		Stack<Character> s = new Stack<Character>();

		// looping through each character
		for (int i = 0; i < str.length(); i++) {
			// getting the current character
			char ch = str.charAt(i);

			// opening bracket condition
			if (ch == '(' || ch == '[' || ch == '{') {
				s.push(ch);
			} else {
				// closing bracket condition
				if (s.isEmpty()) {
					return false;
				} else if ((ch == '}' && s.peek() == '{') || (ch == ']' && s.peek() == '[')
						|| (ch == ')' && s.peek() == '(')) {
					s.pop();
				} else {
					return false;
				}
			}
		}

		return s.isEmpty() ? true : false;
	}

	public static void main(String[] args) {
		String s = "(([{}])())";
		System.out.println(isValid(s));
	}

}
