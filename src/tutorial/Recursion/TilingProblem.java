package tutorial.Recursion;

public class TilingProblem {

	/**
	 * Tiling Problem to find the ways given that length is 2 and tile is 2x1 size.
	 * 
	 * @param n - breadth of the floor to be passed
	 * @return Ways of the tile can be placed on the floor.
	 */
	public static int tilingProblem(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return tilingProblem(n - 1) + tilingProblem(n - 2);
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(tilingProblem(n));
	}

}
