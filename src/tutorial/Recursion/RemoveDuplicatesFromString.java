package tutorial.Recursion;

public class RemoveDuplicatesFromString {
	/**
	 * This function removes the Duplicates character from the string using
	 * recursion the same can be achieved using Hashset
	 * 
	 * @param i   - always passed as 0
	 * @param str - String to be passed to remove the duplicates
	 * @param sb  - StringBuilder for adding the unique character in it.
	 * @param map - Boolean of array of size 26 should be passed.
	 */
	public static void removeDuplicates(int i, String str, StringBuilder sb, boolean map[]) {
		if (i == str.length()) {
			System.out.println(sb.toString());
			return;
		}
		char currentChar = str.charAt(i);
		if (map[currentChar - 'a']) {
			removeDuplicates(i + 1, str, sb, map);
		} else {
			map[currentChar - 'a'] = true;
			removeDuplicates(i + 1, str, sb.append(currentChar), map);
		}
	}

	public static void main(String[] args) {
		String str = "appnaacooolllege";
		System.out.println("Output Should be : apncoleg");
		removeDuplicates(0, str, new StringBuilder(), new boolean[26]);
	}

}
