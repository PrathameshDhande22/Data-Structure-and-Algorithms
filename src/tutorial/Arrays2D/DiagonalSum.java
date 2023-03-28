package tutorial.Arrays2D;

public class DiagonalSum {

	/**
	 * This function calculates the diagonal Sum of primary and secondary diagonal
	 * 
	 * @param matrix 2D Array should be passed to calculate the sum of the diagonal
	 * @return sum of the diagonal of matrix
	 */
	public static int diagSum(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i]; // calculating primary diagonal
			if (i != matrix.length - 1 - i) {
				sum += matrix[i][matrix.length - 1 - i]; // calculating secondary diagonal
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println(diagSum(matrix));
	}

}
