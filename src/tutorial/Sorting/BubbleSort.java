package tutorial.Sorting;

import java.util.Arrays;

public class BubbleSort {
	/**
	 * Optimized Bubble sort code algorithm
	 * 
	 * @param arr : Array to be passed to sort the algorithm.
	 */
	public static void bbSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int swaps = 0;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swaps++;
				}
			}
			if (swaps == 0) {
				break;
			}
		}
		System.out.println("Array After Sorting  : " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 5, 4, 1, 3, 2, 9, 0 };
		bbSort(arr);
		int arr2[] = { 1, 2, 3, 4, 5 };
		bbSort(arr2);
	}

}
