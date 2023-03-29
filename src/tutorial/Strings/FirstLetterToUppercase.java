package tutorial.Strings;

public class FirstLetterToUppercase {

	/**
	 * This Function simply converts the First letter of String to Uppercase.
	 * 
	 * @param s - String To be provided for Converting
	 * @return Converted string with upper case in each Word.
	 */
	public static String firstLetterToUpperCase(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(Character.toUpperCase(s.charAt(0)));
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				sb.append(s.charAt(i));
				i++;
				sb.append(Character.toUpperCase(s.charAt(i)));
			} else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String st = "hii, my name is Prathamesh";
		System.out.println(firstLetterToUpperCase(st));
	}

}
