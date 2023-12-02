package tutorial.Backtracking;

public class SudokuSolver {

	/**
	 * Solves the Sudoku
	 * 
	 * @param sudoku 2D Array representing the sudoku elements the size of the array
	 *               should be 9x9. Empty spaces should be initialized to 0 only.
	 * @param row    Default or pass 0
	 * @param col    Default or pass 0
	 * @return True if solution exists otherwise false
	 */
	public static boolean sudokuSolver(int sudoku[][], int row, int col) {
		// base case
		if (row == 9) {
			return true;
		}

		int nextRow = row, nextCol = col + 1;
		if (col + 1 == 9) {
			nextRow = row + 1;
			nextCol = 0;
		}

		if (sudoku[row][col] != 0) {
			return sudokuSolver(sudoku, nextRow, nextCol);
		}

		for (int digit = 1; digit <= 9; digit++) {
			if (isSafe(sudoku, row, col, digit)) {
				sudoku[row][col] = digit;
				if (sudokuSolver(sudoku, nextRow, nextCol)) {
					return true;
				}
				sudoku[row][col] = 0;
			}
		}
		return false;
	}

	/**
	 * These method checks if the given number or digit exists in row, column or in
	 * a 3x3 grid for the given place.
	 * 
	 * @param sudoku 2D Array of Sudoku
	 * @param row    for which it should be checked
	 * @param col    for which it should be checked
	 * @param digit  check if the given number exists in the row,column or 3x3 Grid.
	 * @return True if it's safe to place the given digit in a specified row or col
	 *         of a sudoku array.
	 */
	private static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
		// checking for row
		for (int i = 0; i < 9; i++) {
			if (sudoku[row][i] == digit) {
				return false;
			}
		}

		// checking for column
		for (int i = 0; i < 9; i++) {
			if (sudoku[i][col] == digit) {
				return false;
			}
		}

		int sr = (row / 3) * 3;
		int sc = (col / 3) * 3;
		// checking for 3 x 3 Grid
		for (int i = sr; i < sr + 3; i++) {
			for (int j = sc; j < sc + 3; j++) {
				if (sudoku[i][j] == digit) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Prints the sudoku
	 * 
	 * @param sudoku 2D array fo sudoku to print the board.
	 */
	public static void print(int[][] sudoku) {
		System.out.println("\n------------ Board -------------");
		for (int[] arr : sudoku) {
			for (int no : arr) {
				System.out.print(no + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int sudoku[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		if (sudokuSolver(sudoku, 0, 0)) {
			System.out.println("Solution Exist");
			print(sudoku);
		} else {
			System.out.println("Solution Doesn't Exist");
		}
		;
	}
}
