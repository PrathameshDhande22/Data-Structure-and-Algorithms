package tutorial.Sorting;

import java.util.Arrays;

public class SelectionSort {

	/**
	 * Swap Function to Swap the values of the array in java.
	 * 
	 * @param arr    : Array to be passed to swap the value.
	 * @param index1 : Index of the array to passed to be swaped with.
	 * @param index2 : Index of the array to be passed to get Swaped with.
	 */
	public void swap(int arr[], int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	/**
	 * Selection Sort Algorithm implemented here. this Algorithm sort the array in
	 * increasing order
	 * 
	 * @param arr : Array to be passed to sort the arrays.
	 */
	public void Selection_Sort_Increasing(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			swap(arr, min, i);
		}
		System.out.println("Array After Sorting = " + Arrays.toString(arr));
	}

	/**
	 * Selection Sort Algorithm Implemented Here This Algorithm sorts the array in
	 * decreasing order.
	 * 
	 * @param arr : Array to be passed to sort the array in decreasing order.
	 */
	public void Selection_Sort_Decreasing(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] < arr[j]) {
					min = j;
				}
			}
			swap(arr, min, i);
		}
		System.out.println("Array After Sorting = " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 5, 1, 7 };
		new SelectionSort().Selection_Sort_Increasing(arr);
		new SelectionSort().Selection_Sort_Decreasing(arr);
	}

}
