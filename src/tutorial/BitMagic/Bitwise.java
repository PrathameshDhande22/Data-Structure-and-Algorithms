package tutorial.BitMagic;

/**
 * Bit magic operators tutorials are implemented here.
 * 
 * @author Prathamesh
 *
 */
public class Bitwise {

	public static void main(String[] args) {
		bitwise();
		System.out.println(getBit(2, 14));
		System.out.println(setBit(3, 14));
		System.out.println(isEven(5));
		System.out.println(clearIthBits(10, 3));
		System.out.println(clearRangeBits(10, 2, 4));
		System.out.println(fastExpo(4, 4));
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

	/**
	 * This function clear the I<sup>th</sup> Bits from the number.
	 * 
	 * @param n : Number
	 * @param i : till where
	 * @return Cleared bits from i
	 */
	public static int clearIthBits(int n, int i) {
		int mask = (~0) << i;
		System.out.println("Binary : " + Integer.toBinaryString(n));
		System.out.println("Mask : " + Integer.toBinaryString(mask));
		System.out.println("Answer : " + Integer.toBinaryString(n & mask));
		return n & mask;
	}

	/**
	 * This function clears the bits from the given range i to j
	 * 
	 * @param n : Number
	 * @param i : from where
	 * @param j : till
	 * @return Cleared bits from the specified range (i,j).
	 */
	public static int clearRangeBits(int n, int i, int j) {
		int a = (~0) << j + 1;
		int b = (1 << i) - 1;
		int mask = a | b;
		System.out.println("Binary : " + Integer.toBinaryString(n));
		System.out.println("Mask : " + Integer.toBinaryString(mask));
		System.out.println("Answer : " + Integer.toBinaryString(n & mask));
		return n & mask;
	}

	/**
	 * This function calculates the a<sup>n</sup>
	 * 
	 * @param a
	 * @param n
	 * @return a<sup>n</sup>
	 */
	public static int fastExpo(int a, int n) {
		int ans = 1;
		while (n > 0) {
			if ((n & 1) != 0) {
				ans = ans * a;
			}
			a = a * a;
			n = n >> 1;
		}
		return ans;
	}
}
