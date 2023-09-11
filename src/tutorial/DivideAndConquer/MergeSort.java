package tutorial.DivideAndConquer;

import java.util.Arrays;

public class MergeSort {

	/**
	 * Sorting the Arrays using the merge sort whose time complexity is o(nlogn) it
	 * is a divide & conquer Approach
	 * 
	 * @param arr = Array to be passed
	 * @param si  = Starting index of the array
	 * @param ei  = Ending Index of the array
	 */
	public static void mergeSort(int arr[], int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = si + (ei - si) / 2;
		mergeSort(arr, si, mid);
		mergeSort(arr, mid + 1, ei);
		merge(arr, si, mid, ei);
	}

	/**
	 * This Function is used to sort and merge the array it is a conquer approach
	 * 
	 * @param arr = Array to be passed
	 * @param si  = Starting index of the array
	 * @param mid = middle index of the array from which it is divided
	 * @param ei  = Ending index of the array.
	 */
	public static void merge(int arr[], int si, int mid, int ei) {
		int i = si, j = mid + 1, k = 0;
		int temp[] = new int[ei - si + 1];

		while (i <= mid && j <= ei) {
			if (arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++;
			} else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}

		while (i <= mid) {
			temp[k++] = arr[i++];
		}

		while (j <= ei) {
			temp[k++] = arr[j++];
		}

		for (k = 0, i = si; k < temp.length; k++, i++) {
			arr[i] = temp[k];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 6, 3, 9, 5, 2, 8 };
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}
