package excercise;

import java.util.Arrays;

/**
 * <b>Question</b> : Apply merge sort to sort and array of String (Assume that
 * all the characters in the string are in lowercase).
 */
public class MergeSort_String {

	/**
	 * Sorting the String According to lexographically order.
	 * 
	 * @param arr Array of Strings to sort.
	 * @param si  Arrays Starting index
	 * @param ei  Arrays last index.
	 */
	public static void sort(String[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = (si + ei) / 2;
		sort(arr, si, mid);
		sort(arr, mid + 1, ei);
		merge(arr, si, mid, ei);
	}

	/**
	 * Merging and sorting the divided parts
	 * 
	 * @param arr Array of string
	 * @param si  Array Starting index
	 * @param mid Array mid value.
	 * @param ei  Array Last index
	 */
	private static void merge(String[] arr, int si, int mid, int ei) {
		String temp[] = new String[ei - si + 1];
		int i = si, j = mid + 1, k = 0;

		while (i <= mid && j <= ei) {
			if (compare_String(arr[i], arr[j])) {
				temp[k] = arr[i++];
			} else {
				temp[k] = arr[j++];
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

	/**
	 * Comparing the strings with another and returns if its lexographically fit.
	 * 
	 * @param first  First String to compare
	 * @param second Second String to compare
	 * @return True if first string is lexographically greater than second string
	 *         otherwise returns false.
	 */
	private static boolean compare_String(String first, String second) {
		if (first.compareTo(second) < 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String arr[] = { "sun", "earth", "mars", "mercury" };
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}
}
