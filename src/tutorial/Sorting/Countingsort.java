package tutorial.Sorting;

import java.util.Arrays;

public class Countingsort {
	/**
	 * Counting Sort Algorithm implemented here This Algorithm is valid only when
	 * the Number is not in the big range.
	 * 
	 * @param arr : Array to be passed to sort the numbers and numbers must be all
	 *            positive only.
	 */
	public static void Counting_Sort(int arr[]) {
		// finding the largest
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.println("Maximum in Array : " + max);

		// finding the frequency
		int count[] = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		System.out.println("Count : " + Arrays.toString(count));

		// sorting the array
		int j = 0;
		for (int i = 0; i < count.length; i++) {
			while (count[i] > 0) {
				arr[j] = i;
				j++;
				count[i]--;
			}
		}
		System.out.println("Arrays After Sorting : " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int nums[] = { 4, 5, 2, 6, 1, 2, 4, 1 };
		Counting_Sort(nums);
	}

}
