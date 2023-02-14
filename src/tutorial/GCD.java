package tutorial;

import java.util.Arrays;

public class GCD {

	/**
	 * <h4>GCD Or Highest Common Factor</h1> This Function Calculates the GCD Of an
	 * Number using while Loop
	 * 
	 * @param a
	 * @param b
	 * @return Greatest Common Divisor
	 */
	public static int gcd(int a, int b) {
		int rem = 0;
		while (b != 0) {
			rem = a % b;
			a = b;
			b = rem;
		}
		return a;
	}

	/**
	 * This function also finds the GCD of an two number by recursive call
	 * 
	 * @param a
	 * @param b
	 * @return GCD Of a and b
	 */
	public static int recursivegcd(int a, int b) {
		if (a == 0) {
			return b;
		} else {
			return recursivegcd(b % a, a);
		}
	}

	/**
	 * This Function calculates the least common multiple of an Number.
	 * 
	 * @param a
	 * @param b
	 * @return Returns the LCM of an Number
	 */
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	/**
	 * Implemented the Extended Euclidean Algorithm to find the gcd of two numbers.
	 * 
	 * @param a
	 * @param b
	 * @return Array of [gcd,s,t] value
	 */
	public static int[] extendedEuclid(int a, int b) {
		int rem = 0, s2 = 0, s1 = 1, s = 0, t1 = 0, t2 = 1, t = 0, quo = 0;
		while (b != 0) {
			quo = (int) Math.abs((double) (a / b));
			rem = a % b;
			s = s1 - (quo * s2);
			t = t1 - t2 * quo;
			System.out.printf("rem=%d,s=%d,t=%d,s1=%d,s2=%d,t1=%d,t2=%d,quo=%d,a=%d,b=%d\n", rem, s, t, s1, s2, t1, t2,
					quo, a, b);
			a = b;
			b = rem;
			s1 = s2;
			s2 = s;
			t1 = t2;
			t2 = t;
		}
		return new int[] { a, s1, t1 };
	}

	/**
	 * This Function is used to verify the extend euclidean algorithm
	 * 
	 * @param ans
	 * @param a
	 * @param b
	 * @return True if is right or false.
	 */
	public static boolean verify(int[] ans, int a, int b) {
		return ans[1] * a + ans[2] * b == gcd(a, b);
	}

	public static void main(String[] args) {
		System.out.println(gcd(3, 9));
		System.out.println(recursivegcd(3, 5));
		System.out.println(lcm(2, 4));
		System.out.println(Arrays.toString(extendedEuclid(161, 28)));
		System.out.println(verify(extendedEuclid(161, 28), 161, 28));
	}

}
