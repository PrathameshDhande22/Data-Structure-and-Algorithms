package tutorial.Recursion;

public class FirstOccurence {

	/**
	 * This function simply searches the key in the array if it occurs first then it
	 * returns it index
	 * 
	 * @param arr - Array of element
	 * @param key - Key that to be searched on the arr
	 * @param i   - index it always should be passed as 0
	 * @return Index of the key present in arr else -1 if not present in the arr.
	 */
	public static int firstOccur(int arr[], int key, int i) {
		if (i == arr.length) {
			return -1;
		} else if (arr[i] == key) {
			return i;
		}
		return firstOccur(arr, key, i + 1);
	}

	public static void main(String[] args) {
		int arr[] = { 8, 3, 5, 6, 8, 2 };
		System.out.println(firstOccur(arr, 2, 0));

	}

}
