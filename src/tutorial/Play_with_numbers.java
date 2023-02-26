package tutorial;

public class Play_with_numbers {

	/**
	 * This function extract the digits from the given Integer no
	 * 
	 * @param no = To extract the digits from it.
	 */
	public static void getDigits(int no) {
		while (no > 0) {
			int rem = no % 10;
			System.out.println(rem);
			no = no / 10;
			System.out.println("Number = " + no);
		}
	}

	/**
	 * Given no is reversed
	 * 
	 * @param no = Which want to be reversed
	 * @return the reversed Number
	 */
	public static int reverseNo(int no) {
		int sum = 0;
		while (no > 0) {
			int rem = no % 10;
			sum = (sum * 10) + rem;
			System.out.println("Sum = " + sum);
			no = no / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		getDigits(11124);
		System.out.println("Number after Reversing = " + reverseNo(11124));
	}

}
