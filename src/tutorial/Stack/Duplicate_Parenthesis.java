package tutorial.Stack;

import java.util.Stack;

public class Duplicate_Parenthesis {

	/**
	 * Given a balanced expression, find if it contains duplicate parenthesis or
	 * not. A set of Parenthesis are duplicate if the same subexpression is
	 * surrounded by multiple parenthesis.
	 * 
	 * @param str Expression to check if the parenthesis is duplicate or not.
	 * @return true if duplicate exists otherwise false.
	 */
	public static boolean isDuplicate(String str) {
		Stack<Character> s = new Stack<Character>();

		// iterating over each character of the string
		for (char curr : str.toCharArray()) {
			// closing condition
			if (curr == ')') {
				int count = 0;
				while (s.pop() != '(') {
					count++;
				}
				// inside bracket there is no statement then duplicate exits.
				if (count < 1) {
					return true;
				}
			} else {
				// pushing all operators, operand, brackets.
				s.push(curr);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "(((a+b)+(c+d)))";
		System.out.println(isDuplicate(str));
	}

}
