package tutorial.Arrays;

import java.util.Arrays;

public class ReverseArray {

	/**
	 * Reverses the array
	 * 
	 * @param arr Array to be passed to Reverse.
	 */
	public static void reverse(int[] arr) {
		int first = 0, last = arr.length - 1;
		while (first < last) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 1, 24, 67, 15, 8, 52, 21 };
		reverse(arr);
		System.out.println("Array After Reversing " + Arrays.toString(arr));
	}

}
