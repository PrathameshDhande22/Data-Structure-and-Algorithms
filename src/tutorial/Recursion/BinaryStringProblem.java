package tutorial.Recursion;

public class BinaryStringProblem {

	/**
	 * This function prints the binary string of size N with out the consecutive
	 * ones in it.
	 * 
	 * @param n       - Size of the string to be passed
	 * @param lastidx - lastindex contains the last inserted binary can be 0 or 1
	 *                while calling call by 0 only
	 * @param str     - this parameter contains the binary string.
	 */
	public static void printBinary(int n, int lastidx, String str) {
		if (n == 0) {
			System.out.println(str);
			return;
		}
		printBinary(n - 1, 0, str + "0");
		if (lastidx == 0) {
			printBinary(n - 1, 1, str + "1");
		}
	}

	public static void main(String[] args) {
		int n = 4;
		printBinary(n, 0, "");

	}

}
