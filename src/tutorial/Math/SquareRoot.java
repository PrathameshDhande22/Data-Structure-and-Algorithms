package tutorial.Math;

/**
 * Calculates the Square root of the Number.
 * 
 * 
 * @author Prathamesh
 *
 */
public class SquareRoot {

	public static void main(String[] args) {
		int no = 36;
		System.out.println(Math.sqrt(no));
		System.out.println(sqrt(no));
	}

	/**
	 * this function carry out the sqrt function just like
	 * <code>Math.sqrt(40);</code>
	 * 
	 * @param no : Number of which you want to find the square root
	 * @return {@link Double} square root of the no.
	 */
	public static double sqrt(int no) {
		double x = no;
		double root;
		while (true) {
			root = (x + no / x) / 2;
			if (Math.abs(root - x) < 0.0005) {
				break;
			}
			x = root;
		}
		return root;
	}

}
