package excercise;

import java.util.Arrays;

public class SearchinSortedMatrix {

	/**
	 * Searching in the Sorted Matrix Same Question but the current element starts
	 * from the last row ka first col ka element
	 * 
	 * @param mat - 2D array to be passed for searching and must be sorted
	 * @param key - Key for searching in the matrix
	 * @return array of int [row,col] if not exists then return [-1,-1];
	 */
	public static int[] search(int mat[][], int key) {
		int row = mat.length - 1;
		int col = 0;
		while (row >= 0 && col < mat[0].length) {
			if (mat[row][col] == key) {
				return new int[] { row, col };
			} else if (mat[row][col] < key) {
				col++;
			} else {
				row--;
			}
		}
		return new int[] { -1, -1 };

	}

	public static void main(String[] args) {
		int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
		System.out.println(Arrays.toString(search(matrix, 50)));
	}

}
