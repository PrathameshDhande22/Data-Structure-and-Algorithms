package tutorial.Arrays;

/**
 * Use to find the Maximum and minimum value from the array.
 * @author Prathamesh
 *
 */
public class MinMax {

	/**
	 * This function finds the smallest value from the array.
	 * 
	 * @param arr : Array to be passed for geting the minimum value.
	 * @return smallest value from the array.
	 */
	public static int min(int arr[]) {
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		return smallest;
	}

	/**
	 * This function finds the largest value from the array
	 * 
	 * @param arr : Array to be passed for getting the maximum value.
	 * @return largest value from the array.
	 */
	public static int max(int arr[]) {
		int largest = Integer.MIN_VALUE;
		for (int no : arr) {
			if (largest < no) {
				largest = no;
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		int nums[] = { 34, 12, 56, 78, 12, 34, 9, 32, 19, 99, 0,-1  };
		System.out.println("Smallest in the Array is : " + min(nums));
		System.out.println("Largest in the Array is : " + max(nums));
	}

}
