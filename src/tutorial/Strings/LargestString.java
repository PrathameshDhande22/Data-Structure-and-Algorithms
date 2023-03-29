package tutorial.Strings;

public class LargestString {

	/**
	 * Gets the largest String from the Array of String compare with its
	 * lexicographically
	 * 
	 * @param st - Array of String for Comparing
	 * @return Largest String compare to other string in lexicographicallys
	 */
	public static String getLargestString(String[] st) {
		String largest = st[0];
		for (int i = 1; i < st.length; i++) {
			if (largest.compareTo(st[i]) < 0) {
				largest = st[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		String[] st = { "apple", "banana", "mango" };
		System.out.println(getLargestString(st));
	}

}
