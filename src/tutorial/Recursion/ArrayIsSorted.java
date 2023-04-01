package tutorial.Recursion;

public class ArrayIsSorted {

	/**
	 * This function simply checks if the array is sorted or not using recursion
	 * 
	 * @param arr   - Array to be passed for checking if array is sorted or not
	 * @param index - Should be always set to zero
	 * @return true if sorted else false if not sorted.
	 */
	public static boolean isSorted(int arr[], int index) {
		if (index == arr.length - 1) {
			return true;
		}
		if (arr[index] > arr[index + 1]) {
			return false;
		}
		return isSorted(arr, index + 1);
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println(isSorted(a, 0));

	}

}
