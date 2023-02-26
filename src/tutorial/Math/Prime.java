package tutorial.Math;

/**
 * Used to find the Prime Number.<br>
 * Several Methods are implemented here to find the Prime Number.
 * 
 * @author Prathamesh
 *
 */
public class Prime {

	public static void main(String[] args) {
		int no = 10;
		System.out.println(isPrime(no) ? "Prime" : "Not Prime");
		generatePrimes(no);
		Sieve(no);
	}

	/**
	 * This Function tells whether the given number is prime or not
	 * 
	 * @param no : To check the number is prime or not
	 * @return {@link Boolean} if the no is prime returns True else False
	 */
	public static boolean isPrime(int no) {
		if (no <= 1) {
			return false;
		}
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * This Function generate primes number till specified Number.
	 * 
	 * @param no : Till Number to generate the prime number
	 * 
	 */
	public static void generatePrimes(int no) {
		for (int i = 1; i <= no; i++) {
			System.out.printf("%d = %s\n", i, isPrime(i) ? "Prime" : "Not Prime");
		}
	}

	/**
	 * This function also generate the prime number but using the Sieve of
	 * Erathosthenes
	 * 
	 * @param no : Till number to generate the prime number.
	 */
	public static void Sieve(int no) {
		boolean numberstate[] = new boolean[no + 1];
//		System.out.println(Arrays.toString(numberstate));
		for (int i = 2; i * i <= no; i++) {
			for (int j = i + 1; j <= no; j++) {
				if (j % i == 0) {
					numberstate[j] = true;
				}
			}
		}
		for (int i = 2; i <= no; i++) {
			if (!numberstate[i]) {
				System.out.printf("%d, ", i);
			}
		}
	}

}
