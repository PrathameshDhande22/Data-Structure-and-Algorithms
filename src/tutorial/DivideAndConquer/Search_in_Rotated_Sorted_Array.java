package tutorial.DivideAndConquer;

public class Search_in_Rotated_Sorted_Array {

	/**
	 * Search in Rotated Sorted array using Modified Binary search using Recursion
	 * method
	 * 
	 * @param arr = Arrays to be passed
	 * @param si  = Array's Starting index
	 * @param ei  = Array's Ending index
	 * @param tar = Target element to search in the array.
	 * @return Index of the target element if found in the array else {@code -1}
	 */
	public static int search(int arr[], int si, int ei, int tar) {
		if (si > ei) {
			return -1;
		}
		int mid = (ei + si) / 2;
		if (arr[mid] == tar) {
			return mid;
		}
		// mid on line 1
		else if (arr[si] <= arr[mid]) {
			// search on left part
			if (arr[si] <= tar && tar <= arr[mid]) {
				return search(arr, si, mid - 1, tar);
			}
			// search on right part
			return search(arr, mid + 1, ei, tar);
		}
		// mid on line 2
		else {
			if (arr[mid] <= tar && tar <= arr[ei]) {
				// search on right part
				return search(arr, mid + 1, ei, tar);
			}
			// search on left part
			return search(arr, si, mid - 1, tar);
		}

	}

	/**
	 * Search in a Rotated array using Modified binary search using the iteration
	 * method.
	 * 
	 * @param arr = Array to be passed to search the key element
	 * @param key = Element to search in the array.
	 * @return Index of the key element from the array if found else returns
	 *         {@code -1}.
	 */
	public static int search_Iteration(int arr[], int key) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == key) {
				return mid;
			}

			// mid on line 1
			else if (arr[start] <= arr[mid]) {
				// search on left part
				if (arr[start] <= key && key <= arr[mid]) {
					end = mid - 1;
				}
				// search on right part
				else {
					start = mid + 1;
				}
			}
			// mid on line 2
			else {
				// search on right part
				if (arr[mid] <= key && key <= arr[end]) {
					start = mid + 1;
				}
				// search on left part
				else {
					end = mid - 1;
				}
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
		int index = search(arr, 0, arr.length - 1, 0);
		System.out.println("Found using Recursion element at index = %d".formatted(index));
		int idx = search_Iteration(arr, 2);
		System.out.println("Found using Iteration element at index = %d ".formatted(idx));
	}

}
