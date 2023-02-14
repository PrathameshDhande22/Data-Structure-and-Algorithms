package excercise;

public class Decimal {
	/**
	 * this Method converts the Decimal no to Binary String
	 * @param no : Decimal Number
	 * @return binaryString
	 */
	public static String binaryString(int no) {
		StringBuffer ans = new StringBuffer();
		while (no != 1) {
			ans.append(Integer.toString(no % 2));
			no = no / 2;
		}
		ans.append("1");
		return ans.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(binaryString(120));

	}

}
