package tutorial.Recursion;

public class Powerxn {

	/**
	 * This function calculates the power of x<sup>n</sup> using recursion but it
	 * takes O(n) time complexity
	 * 
	 * @param n
	 * @param x
	 * @return x**n
	 */
	public static int power(int n, int x) {
		if (n == 0) {
			return 1;
		}
		return x * power(n - 1, x);
	}

	/**
	 * Optimized power code compared to above code because it takes O(logn) time
	 * complexity
	 * 
	 * @param n
	 * @param x
	 * @return x**n
	 */
	public static int opPower(int n, int x) {
		if (n == 0) {
			return 1;
		}
		int halfpow = opPower(n / 2, x);
		int halfsq = halfpow * halfpow;
		if (n % 2 != 0) {
			halfsq = x * halfsq;
		}
		return halfsq;
	}

	public static void main(String[] args) {
		int x = 2, n = 10;
		System.out.println(power(n, x));
		System.out.println(opPower(n, x));
	}

}
