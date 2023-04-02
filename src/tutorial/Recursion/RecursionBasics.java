package tutorial.Recursion;

public class RecursionBasics {

	/**
	 * This function prints the number in decreasing order but by using recursion
	 * 
	 * @param n - From n to 1
	 */
	public static void printDecreasing(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printDecreasing(n - 1);
	}

	/**
	 * This function prints the number in increasing order but using recursion
	 * 
	 * // * @param n - number till n
	 */
	public static void printIncreasing(int n) {
		if (n == 0) {
			return;
		}
		printIncreasing(n - 1);
		System.out.println(n);
	}

	/**
	 * This function returns the factorial of the number using recursion
	 * 
	 * @param n - The number which you want the factorial
	 * @return Factorial of the number n
	 */
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	/**
	 * This function returns the sum of first n Natural Numbers using recursion
	 * 
	 * @param n - till no you want the sum
	 * @return Sum of the numbers till n
	 */
	public static int sumNatural(int n) {
		if (n == 1) {
			return 1;
		}
		return n + sumNatural(n - 1);
	}

	/**
	 * This function returns the fibonnaci number at the nth index using 2 recursion
	 * it takes o(2^n) time complexity which is very worst
	 * 
	 * @param n - Nth number to print the fibonnaci number
	 * @return Fibonnaci number at the nth index
	 */
	public static int fibonnaci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fibonnaci(n - 1) + fibonnaci(n - 2);
	}

	public static void main(String[] args) {
		int n = 10;
		printDecreasing(n);
		System.out.println();
		printIncreasing(n);
		System.out.println();
		System.out.println(factorial(5));
		System.out.println(sumNatural(n));
		System.out.println(fibonnaci(6));
	}
}
