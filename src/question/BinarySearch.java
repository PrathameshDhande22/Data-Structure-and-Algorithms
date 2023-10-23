package question;

public class BinarySearch {

	/**
	 * Binary search using recursion
	 * 
	 * @param arr    = Array to be passed to search
	 * @param si     = Arrays starting index
	 * @param ei=    Arrays last index
	 * @param target = Target element to search in the array.
	 * @return Index at which the element is found else return's {@code -1}
	 */
	public static int binarySearch(int arr[], int si, int ei, int target) {
		if (si > ei) {
			return -1;
		}
		int mid = (ei + si) / 2;
		if (arr[mid] == target) {
			return mid;
		}
		// search on right part
		else if (arr[mid] < target) {
			return binarySearch(arr, mid + 1, ei, target);

		}
		// search on left part
		else {
			return binarySearch(arr, si, mid - 1, target);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7, 8, 9, 11 };
		int index = binarySearch(arr, 0, arr.length, 10);
		System.out.println("Found element at index = %d ".formatted(index));
	}
}
