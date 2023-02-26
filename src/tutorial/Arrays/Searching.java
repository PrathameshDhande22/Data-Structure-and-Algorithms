package tutorial.Arrays;

/**
 * Searching algorithms are implemented here like Binary search and Linear
 * Search.
 * 
 * @author Prathamesh
 *
 */
public class Searching {

	/**
	 * Linear Search algorithm it simply traverses all the elements in the array and
	 * check if the key is present or not if present then returns the index else
	 * returns the -1 after traversing the array
	 * 
	 * @param no  : Array to be passed on which operation should be applied
	 * @param key : Key that to be searched in the passed array no.
	 *
	 * @return Index of the key in the no array else -1 if not present.
	 */
	public static int LinearSearch(int no[], int key) {
		for (int i = 0; i < no.length; i++) {
			if (no[i] == key) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * <b>Note:</b> To Use this algorithm the array must be in sorted. Binary Search
	 * algorithm finds the mid value using the start and end of the array and divide
	 * them by 2 then it compares the mid value with array if the mid value is the
	 * key then returns the mid, if <code>mid > key</code> then take the left side
	 * of the array else take the right side of the array if <code>mid < key</code>.
	 * 
	 * @param arr : Array that to be applied to search
	 * @param key : Key that to be searched in arr.
	 * @return index of the array if the key is present in the array otherwise -1.
	 */
	public static int BinarySearch(int arr[], int key) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int no[] = { 1, 2, 3, 4, 5, 6, 10, 20, 50 };
		int key = 50;
		System.out.println("Linear Search = " + LinearSearch(no, key));
		System.out.println("Binary search = " + BinarySearch(no, key));
	}

}
