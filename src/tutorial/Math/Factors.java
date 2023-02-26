package tutorial.Math;

/**
 * Used to find the factors of the number.
 * 
 * @author Prathamesh
 *
 */
public class Factors {

	public static void main(String[] args) {
		int no = 36;
		Fact1(no);
		Fact2(no);
	}

	/**
	 * The function generates all the factors of the number. <br>
	 * But This function takes O(n) time so {@code Fact2(int no)} is the optimised
	 * code.
	 * 
	 * @param no : Number
	 * 
	 */
	public static void Fact1(int no) {
		for (int i = 1; i <= no; i++) {
			if (no % i == 0) {
				System.out.println(i);
			}
		}
	}

	/**
	 * This function is the optimsed code for Factors of Number and it takes
	 * O(sqrt(no)) time.
	 * 
	 * @param no : Number
	 */
	public static void Fact2(int no) {
		for (int i = 1; i <= Math.sqrt(no); i++) {
			if (no % i == 0) {
				if (no / i == i) {
					System.out.print(i + ",");
				} else {
					System.out.print(i + "," + no / i + ",");
				}
			}
		}
	}

}
