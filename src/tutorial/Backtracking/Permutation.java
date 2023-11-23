package tutorial.Backtracking;

import java.util.ArrayList;

public class Permutation {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(findPermutation(str, "", new ArrayList<String>()));
	}

	/**
	 * Finds the Permutation for the given String in Recursion method It takes
	 * O(n*n) Time Complexity
	 * 
	 * @param str String of which find out the permutation
	 * @param ans empty String to be passed
	 * @return ArrayList of String with Permutation
	 */
	public static ArrayList<String> findPermutation(String str, String ans, ArrayList<String> ls) {
		if (str.length() == 0) {
			ls.add(ans);
			return ls;
		}
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			String nStr = str.substring(0, i) + str.substring(i + 1);
			findPermutation(nStr, ans + curr, ls);
		}
		return ls;

	}

}
