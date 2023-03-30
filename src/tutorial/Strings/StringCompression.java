package tutorial.Strings;

public class StringCompression {

	/**
	 * This function compress the String according to their occurence
	 * 
	 * @param s - String for Compressing
	 * @return compressed String
	 */
	public static String compressString(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				count++;
				i++;
			}
			sb.append(s.charAt(i));
			if (count > 1) {
				sb.append(count);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "aaabbbc";
		System.out.println(compressString(s));
	}

}
