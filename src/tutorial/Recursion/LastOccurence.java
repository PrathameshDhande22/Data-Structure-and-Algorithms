package tutorial.Recursion;

public class LastOccurence {
	/**
	 * This Function finds the last occurence of the key in array.
	 * 
	 * @param arr - Array to be passed should be of integer
	 * @param key - Key that to be searched in array
	 * @param i   - should be always passed as 0
	 * @return Index of the key that occur last in the element else returns -1 if
	 *         not found
	 */
	public static int lastOccur(int arr[], int key, int i) {
		if (i == arr.length) {
			return -1;
		}
		int isFound = lastOccur(arr, key, i + 1);
		if (isFound == -1 && arr[i] == key) {
			return i;
		}
		return isFound;
	}

	public static void main(String[] args) {
		int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
		System.out.println(lastOccur(arr, 5, 0));

	}

}
