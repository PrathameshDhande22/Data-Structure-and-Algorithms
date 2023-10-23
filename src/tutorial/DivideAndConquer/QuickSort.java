package tutorial.DivideAndConquer;

import java.util.Arrays;

public class QuickSort {

	/**
	 * Quick Sort algorithm which uses O(nlogn) time complexity to sort the arrays.
	 * 
	 * @param arr = {@code Integer} Arrays to be passed for sorting the arrays.
	 * @param si  = Array starting index.
	 * @param ei  = Arrays last index.
	 * 
	 */
	public static void quicksort(int arr[], int si, int ei) {
		if (si >= ei) {
			return;
		}
		int pidx = partition(arr, si, ei);
		quicksort(arr, si, pidx - 1);
		quicksort(arr, pidx + 1, ei);
	}

	/**
	 * Quick Sort partition function to return the partition for while comparing the
	 * pivot elements
	 * 
	 * @implNote Here the pivot element is taken as last element of the Array
	 * @param arr = Arrays to be passed
	 * @param si  = Arrays starting index to be passed
	 * @param ei  = Arrays last index to be passed
	 * @return the index where the pivot element is stored
	 */
	public static int partition(int arr[], int si, int ei) {
		int pivot = arr[ei];
		int i = si - 1;

		for (int j = si; j < ei; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		arr[ei] = arr[i];
		arr[i] = pivot;
		return i;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 1, 4, 3, 7, 9 };
		quicksort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}
