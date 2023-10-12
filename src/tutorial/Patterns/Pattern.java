package tutorial.Patterns;

public class Pattern {

	public static void hollowsquarepattern(int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if ((i == 0 || i == row - 1) || (j == 0 || j == col - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void pyramidstarpattern(int row) {
		int total_col = (row + row) - 1;
		for (int i = 0; i < row; i++) {
			int space = row - (i + 1);
			for (int a = space; a >= 1; a--) {
				System.out.print(" ");
			}
			int starprints = total_col - (space + space);
			for (int j = 1; j <= starprints; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		hollowsquarepattern(2, 2);
		pyramidstarpattern(5);
	}

}
