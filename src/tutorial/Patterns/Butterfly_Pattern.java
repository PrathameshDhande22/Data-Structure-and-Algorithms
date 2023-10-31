package tutorial.Patterns;

public class Butterfly_Pattern {

	/**
	 * Prints the butterfly pattern
	 * 
	 * @param rows Number of rows to print
	 */
	public static void pattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			// first asterisk
			for (int f = 0; f < i; f++) {
				System.out.print("*");
			}

			// space
			for (int sp = 1; sp <= ((rows + rows) - (i + i)); sp++) {
				System.out.print(" ");
			}

			// second asterisk
			for (int s = 0; s < i; s++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = rows; i >= 1; i--) {
			// first asterisk
			for (int f = 0; f < i; f++) {
				System.out.print("*");
			}

			// space
			for (int sp = 1; sp <= ((rows + rows) - (i + i)); sp++) {
				System.out.print(" ");
			}

			// second asterisk
			for (int s = 0; s < i; s++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		pattern(6);
	}
}
