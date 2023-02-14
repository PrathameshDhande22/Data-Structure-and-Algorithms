package tutorial;

public class Bitwise {

	public static void main(String[] args) {
		bitwise();
		System.out.println(getBit(2, 14));
		System.out.println(setBit(3, 14));
		System.out.println(isEven(5));
	}

	// problems on bitwise

	/**
	 * Returns the Bit at a Specified Number from a given Number.
	 * 
	 * @param no  : Number of bit you want to get.
	 * @param bit : Number in which you want ot get the bit at specified no.
	 * @return {@link Integer} : Returns the bit at a Specified Number.
	 */
	public static int getBit(int no, int bit) {
		int mask = 1 << no - 1;
		System.out.println(String.format("Binary of %d : %s", bit, Integer.toBinaryString(bit)));
		System.out.println("Mask : " + Integer.toBinaryString(mask));
		String bits = Integer.toBinaryString(bit & mask);
		if ((bit & mask) != 0) {
			return (Integer.valueOf(bits.replace("0", "")));
		}
		return bit & mask;
	}

	// tutorial on bitwise operators
	public static void bitwise() {
		int a = 10;
		System.out.println("Left Shift Operator of 10 is " + (a << 2)); // left shift operator
		System.out.println("Left Shift Operator of 10 is " + (a >> 2)); // right shift operator
		System.out.println("Bitwise And Operator on 10&5 gives " + (10 & 5)); // bitwise and Operator
		System.out.println("Bitwise Or Operator on 10|5 gives " + (10 | 5)); // bitwise or operator
		System.out.println("Complement of 10 is " + (~10)); // complement of a number
		System.out.println("Bitwise XOR Operator on 10^12 gives " + (10 ^ 12)); // xor operator
		// some concepts
		System.out.println("Binary String of 10 is " + Integer.toBinaryString(a));
		System.out.println("HexaDecimal String of 10 is " + Integer.toHexString(a));
		System.out.println("Octal String of 10 is " + Integer.toOctalString(a));
		System.out.println("Returns the Number of 1's in the binary String " + Integer.bitCount(a));
	}

	/**
	 * This Function Set the bit <code>1</code> to <code>0</code> or <code>0</code>
	 * to <code>1</code> at the specified Number and given Number as bit also
	 * returns the Binary String of setted Bit.
	 * 
	 * @param no  : Number at which the bit is to be setted
	 * @param bit : Number in which the bit is set
	 * @return {@link String} : Returns the setted bit.
	 */
	public static String setBit(int no, int bit) {
		int mask = 1 << no - 1;
		System.out.println(String.format("Binary of %d : %s", bit, Integer.toBinaryString(bit)));
		System.out.println("Mask : " + Integer.toBinaryString(mask));
		return Integer.toBinaryString(bit ^ mask);
	}

	/**
	 * This Function checks if the Number is even or not using bitwise And operator
	 * 
	 * @param no
	 * @return True if no is even else false if no is odd
	 */
	public static boolean isEven(int no) {
		return (no & 1) == 0;
	}
}
