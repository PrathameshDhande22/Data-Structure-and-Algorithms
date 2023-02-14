package tutorial;

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

	public static void main(String[] args) {
		System.out.println(gcd(3, 9));
		System.out.println(recursivegcd(3, 5));
		System.out.println(lcm(2, 4));
	}

}
