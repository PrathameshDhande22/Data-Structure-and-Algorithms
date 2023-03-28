package tutorial.Strings;

public class Palindrome {

	/**
	 * Palindrome Checker
	 * 
	 * @param str - String
	 * @return true if palindrome or false if not a palindrome.
	 */
	public static boolean isPalindrome(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "moon";
		System.out.println(isPalindrome(s));
	}

}
