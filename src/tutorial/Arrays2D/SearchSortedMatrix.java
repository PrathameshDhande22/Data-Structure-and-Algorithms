package tutorial.Arrays2D;

import java.util.Arrays;

public class SearchSortedMatrix {

	/**
	 * Staircase Search method if key is less than the current value then take the
	 * down element of the array else if key is greater than the current value then
	 * take the left element of the array.
	 * 
	 * by default the current element starts from the row 0 col last element
	 * 
	 * @param matrix - 2D array matrix for searching it should be sorted
	 * @param key    - for searching in the matrix
	 * @return [row,col] array if no found then returns [-1,-1]
	 */
	public static int[] searchInSortedMatrix(int matrix[][], int key) {
		int row = 0, col = matrix.length - 1;
		while (row < matrix.length && col >= 0) {
			if (matrix[row][col] == key) {
				return new int[] { row, col };
			} else if (matrix[row][col] < key) {
				row++;
			} else {
				col--;
			}

		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
		System.out.println(Arrays.toString(searchInSortedMatrix(matrix, 35)));
	}

}
