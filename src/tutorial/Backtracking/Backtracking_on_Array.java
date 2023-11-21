package tutorial.Backtracking;

import java.util.Arrays;

public class Backtracking_on_Array {
	/**
	 * These is the simple Example of Backtracking to explain that how the Backtracking works
	 * @param arr Array to passed
	 * @param index Index should be passed as 1
	 * @param value Value can be anything at last it do the minus to all the elements in the array
	 */
	public static void changeArr(int arr[], int index, int value) {
		if (index == arr.length) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		arr[index] = value;
		// Calling the function
		changeArr(arr, index + 1, value + 1);
		// These is called the backtracking
		arr[index] -= 2;

	}

	public static void main(String[] args) {
		int arr[] = new int[5];
		changeArr(arr, 0, 1);
		System.out.println(Arrays.toString(arr));
	}
}
