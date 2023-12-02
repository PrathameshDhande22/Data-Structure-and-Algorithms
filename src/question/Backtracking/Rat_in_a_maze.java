package question.Backtracking;

public class Rat_in_a_maze {

	/**
	 * Checks if the current x and y location is safe to visit in the particular
	 * cell
	 * 
	 * @param maze 2D Array of maze
	 * @param x    Value of row
	 * @param y    Value of Column
	 * @return True if it's safe to place otherwise False
	 */
	private static boolean isSafe(int[][] maze, int x, int y) {
		return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
	}

	/**
	 * Solves the maze About the Game : you have to reach from (0,0) to (n-1,n-1)
	 * you can only pass if maze has the value 1 otherwise you can t visit that
	 * cell.
	 * 
	 * @param maze 2D array in which 1 represents the path and 0 represents the
	 *             block
	 * @param x    Initialize it to 0
	 * @param y    Initialize it to 0
	 * @param sol  Pass an empty array of [n,n]
	 * @return True if Solution Exists otherwise false
	 */
	public static boolean solveMaze(int[][] maze, int x, int y, int sol[][]) {
		// base case
		if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
			sol[x][y] = 1;
			return true;
		}
		if (isSafe(maze, x, y)) {
			if (sol[x][y] == 1) {
				return false;
			}
			sol[x][y] = 1;
			if (solveMaze(maze, x + 1, y, sol)) {
				return true;
			} else if (solveMaze(maze, x, y + 1, sol)) {
				return true;
			}
			// backtracking ka step
			sol[x][y] = 0;
		}
		return false;

	}

	/**
	 * Prints the Board of the maze after solving the problem
	 * 
	 * @param maze 2D Array of matrix with maze init.
	 */
	public static void printBoard(int[][] maze) {
		for (int x[] : maze) {
			for (int no : x) {
				System.out.print(no + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
		int newarr[][] = new int[maze.length][maze.length];
		System.out.println(solveMaze(maze, 0, 0, newarr));
		printBoard(newarr);
	}

}
