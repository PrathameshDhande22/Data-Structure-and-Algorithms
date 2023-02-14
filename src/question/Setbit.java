package question;

public class Setbit {

	/**
	 * This function counts the bits 1 in the no
	 * @param no 
	 * @return Number of bit 1 in nof
	 */
	public static int countbits(int no) {
		int count = 0;
		while (no > 0) {
			if ((no & 1) == 1) {
				count++;
			}
			no = no >> 1;

		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countbits(8));
	}
}
