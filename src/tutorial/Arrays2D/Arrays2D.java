package tutorial.Arrays2D;

import java.util.Arrays;

public class Arrays2D {

	/**
	 * This function simply searches the target element in the 2D arrays.
	 * 
	 * @param nums   : 2D array for searching
	 * @param target : element to search in array
	 * @return [ith value,jth value] array
	 */
	public static int[] Search(int nums[][], int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				if (nums[i][j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

	/**
	 * Function simply returns the minimum element from the 2D array.
	 * 
	 * @param nums : 2D Array to be passed to get the minimum value.
	 * @return minimum value from the given 2D array.
	 */
	public static int getMin(int nums[][]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				min = Math.min(min, nums[i][j]);
			}
		}
		return min;
	}

	/**
	 * Function simply retunrs the maximum element from the 2D Arrays.
	 * 
	 * @param nums : 2D Array to be passed to get the Maximum value from the array.
	 * @return maximum value from the given 2D array.
	 */
	public static int getMax(int nums[][]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				max = Math.max(max, nums[i][j]);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int nums[][] = { { 1, 2, 3, 4 }, { 7, 8, 9, 10 }, { 12, -1, 0, 12 } };
		System.out.println(Arrays.toString(Search(nums, 0)));
		System.out.println(getMin(nums));
		System.out.println(getMax(nums));
	}

}
