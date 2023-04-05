package question.Recursion;

public class LengthofString {

	/*
	 * Question 3 : Write a program to find length of a String using Recursion.
	 */
	public static int lengthString(String st, int len) {
		if (st.length() == len) {
			return len;
		}
		return lengthString(st, len + 1);
	}

	public static void main(String[] args) {
		String str = "7d";
		System.out.println(lengthString(str, 0));
	}

}
