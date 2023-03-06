package tutorial.Sorting;

import java.util.Arrays;

public class InsertionSort {
	/**
	 * Insertion Sort Algorithm Implemented Here
	 * 
	 * @param arr : Array to be passed to Sort
	 */
	public static void Insertion_Sort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int curr = arr[i];
			int prev = i - 1;
			while (prev >= 0 && arr[prev] > curr) {
				arr[prev + 1] = arr[prev];
				prev--;
			}
			arr[prev + 1] = curr;
		}
		System.out.println("Array After Sorting = " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Insertion_Sort(new int[] { 5, 4, 1, 3, 2 });
	}

}
