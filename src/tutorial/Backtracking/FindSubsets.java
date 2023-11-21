package tutorial.Backtracking;

public class FindSubsets {

	/**
	 * It finds the subsets with time complexity of O(n*2^n)
	 * 
	 * @param str = String to be passed
	 * @param ans = Empty String to be passed
	 * @param i   = Index of the string pass the 0 as default
	 */
	public static void findSubsets(String str, String ans, int i) {
		if (i == str.length()) {
			System.out.println(ans);
			return;
		}
		// yes choice
		findSubsets(str, ans + str.charAt(i), i + 1);
		// NO choice
		findSubsets(str, ans, i + 1);
	}

	/**
	 * Optimized Subsets using {@code StringBuilder}
	 * 
	 * @param str   = String to be passed
	 * @param sb    = Stringbuilder Object to be passed
	 * @param index = Index always set to 0
	 */
	public static void optimizedFindSubsets(String str, StringBuilder sb, int index) {
		if (index == str.length()) {
			System.out.println(sb.toString());
			return;
		}
		// Yes choice
		optimizedFindSubsets(str, sb.append(str.charAt(index)), index + 1);
		// No choice
		optimizedFindSubsets(str, sb.deleteCharAt(sb.length() - 1), index + 1);
	}

	public static void main(String[] args) {
		String str = "abc";
		findSubsets(str, "", 0);
		optimizedFindSubsets(str, new StringBuilder(), 0);
	}
}
