package tutorial.Backtracking;

public class Gridways {

	/**
	 * Grid way problem to find the total ways to reach from starting point (0,0) to
	 * (n,m) moves are allowed like down,right.
	 * 
	 * @param i Initialize it with the starting point
	 * @param j Initialize it with the starting point
	 * @param n Total Number of Rows in a grid
	 * @param m Total Number of Columns in a grid
	 * @return Total Ways to reach from (i,j) to (n,m)
	 */
	public static int gridWays(int i, int j, int n, int m) {
		if (i == n - 1 && j == m - 1) {
			return 1;
		} else if (i == n || j == n) {
			return 0;
		}
		int w1 = gridWays(i + 1, j, n, m);
		int w2 = gridWays(i, j + 1, n, m);
		return w1 + w2;
	}

	public static void main(String[] args) {
		int n = 4;
		int m = 2;
		System.out.println(gridWays(0, 0, n, m));
	}
}
