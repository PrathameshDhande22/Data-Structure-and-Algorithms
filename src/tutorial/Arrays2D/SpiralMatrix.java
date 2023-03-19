package tutorial.Arrays2D;

public class SpiralMatrix {

	/**
	 * This function prints the matrix in a spiral from just like jalebi in hindi
	 * 
	 * @param matrix : To be passed to print the spiral form can nxm
	 */
	public static void printSpiralMatrix(int[][] matrix) {
		int sRow = 0;
		int sCol = 0;
		int eRow = matrix.length - 1;
		int eCol = matrix[0].length - 1;
		while (sRow <= eRow && sCol <= eCol) {
			// top
			for (int i = sCol; i <= eCol; i++) {
				System.out.print(matrix[sRow][i] + " ");
			}

			// right
			for (int i = sRow + 1; i <= eRow; i++) {
				System.out.print(matrix[i][eCol] + " ");
			}

			// bottom
			for (int i = eCol - 1; i >= sCol; i--) {
				if (sRow == eRow) {
					break;
				}
				System.out.print(matrix[eRow][i] + " ");
			}

			// left
			for (int i = eRow - 1; i > sRow; i--) {
				if (sCol == eCol) {
					break;
				}
				System.out.print(matrix[i][sCol] + " ");
			}
			sRow++;
			sCol++;
			eCol--;
			eRow--;
		}
	}

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		printSpiralMatrix(matrix);

	}

}
