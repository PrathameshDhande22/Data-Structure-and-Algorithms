package tutorial;

public class Prime {

	public static void main(String[] args) {
		int no = 36;
		System.out.println(isPrime(no)?"Prime":"Not Prime");
		generatePrimes(no);
	}

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

	public static void generatePrimes(int no) {
		for (int i = 1; i <= no; i++) {
			System.out.printf("%d = %s\n", i, isPrime(i) ? "Prime" : "Not Prime");
		}
	}

}
