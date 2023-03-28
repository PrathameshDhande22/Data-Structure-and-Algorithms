package question;

import java.util.Arrays;

public class TransposeofaMatrix {

	/**
	 * Finds the Transpose of a matrix
	 * 
	 * @param mat - matrix to be passed for finding the matrix
	 * @return 2D array matrix Transposed matrix of passed mat argument
	 */
	public static int[][] Transpose(int mat[][]) {
		int[][] Trans = new int[mat[0].length][mat.length];
		for (int i = 0; i < Trans.length; i++) {
			for (int j = 0; j < Trans[0].length; j++) {
				Trans[i][j] = mat[j][i];
			}
		}
		return Trans;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 13 } };
		int[][] t = Transpose(matrix);
		for (int i = 0; i < t.length; i++) {
			System.out.println(Arrays.toString(t[i]));
		}
	}

}
