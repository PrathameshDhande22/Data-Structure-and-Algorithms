package tutorial.Backtracking;

import java.util.Arrays;

public class NQueens {
	public static void main(String[] args) {
		int n = 5;
		char board[][] = new char[n][n];
		for (char iBoard[] : board) {
			Arrays.fill(iBoard, 'x');
		}
//		printBoard(board);
//		placeQueens(board, 0);
		nQueens(board, 0);
		System.out.printf("Total Solution contains = %d\n", count);
		System.out.println("is Solution Possible " + checknQueens(board, 0));

	}

	/**
	 * These Functions simply prints the board to the console
	 * 
	 * @param board 2D Array of Character to be passed to print that array
	 */
	public static void printBoard(char board[][]) {
		System.out.println("\n---------- chess Board ------------");
		for (char iBoard[] : board) {
			for (char cell : iBoard) {
				System.out.printf("%c ", cell);
			}
			System.out.println();
		}
	}

	/**
	 * These Functions simply show that where the queens can be placed but don't
	 * consider the conditions that 2 queens are not attacking each other.
	 * 
	 * @param board 2D Array of character filled with x to be passed.
	 * @param row   Always initialized it to 0
	 */
	public static void placeQueens(char board[][], int row) {
		if (row == board.length) {
			printBoard(board);
			return;
		}
		for (int j = 0; j < board.length; j++) {
			board[row][j] = 'Q';
			placeQueens(board, row + 1);
			board[row][j] = 'x';
		}
	}

	/**
	 * These Variable counts the no of possible solution to solve the nQueens
	 * problem
	 */
	public static int count = 0;

	/**
	 * These is the actual function to place the queens and no 2 queens are
	 * attacking each other.
	 * 
	 * @param board 2D Array of character fill with character {@code 'x'}
	 * @param row   passed default as 0
	 */
	public static void nQueens(char board[][], int row) {
		if (row == board.length) {
			printBoard(board);
			count++;
			return;
		}
		for (int j = 0; j < board.length; j++) {
			if (isSafe(board, row, j)) {
				board[row][j] = 'Q';
				nQueens(board, row + 1);
				board[row][j] = 'x';
			}
		}
	}

	/**
	 * The functions checks for the current row and column if it's safe to place the
	 * queen to given row and col. Basically it checks whether the 2 queens are
	 * attacking each other or not.
	 * 
	 * @param board 2D Array of character to be passed filled with 'x'
	 * @param row   at which the Queen is to be placed
	 * @param col   at which the Queen is to be placed
	 * @return true if its safe to place the Queen otherwise false
	 */
	public static boolean isSafe(char board[][], int row, int col) {
		// checking for vertical up
		for (int i = row - 1; i >= 0; i--) {
			if (board[i][col] == 'Q') {
				return false;
			}
		}

		// checking for left diagonal up
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}

		// checking for right diagonal up
		for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}
		return true;
	}

	/**
	 * It checks if the solution is possible.
	 * 
	 * @param board 2D array of character filled with x
	 * @param row   Initialize it to 0
	 * @return true if it's possible to place otherwise false
	 */
	public static boolean checknQueens(char board[][], int row) {
		if (row == board.length) {
			return true;
		}
		for (int j = 0; j < board.length; j++) {
			if (isSafe(board, row, j)) {
				board[row][j] = 'Q';
				if (checknQueens(board, row + 1)) {
					return true;
				}
				board[row][j] = 'x';
			}
		}
		return false;
	}

}
