package tutorial.Arrays;

import java.util.Arrays;

public class Subarray {
	/**
	 * This function simply prints all the subarray that can be obtained using arr
	 * 
	 * @param arr : Array of integer to be passed to print all subarray.
	 */
	public static void printSubarray(int arr[]) {
		int totalsubarray = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
				}
				totalsubarray++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total Subarray : " + totalsubarray);
	}

	/**
	 * This function prints the Sum of each Subarray and also prints the Minimum and
	 * maximum sum of each subarray.
	 * 
	 * @param arr : Array to be passed to calculate the sum of subarray.
	 */
	public static void SubArraySumMinMax(int arr[]) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}
				System.out.println(sum);
				if (min > sum) {
					min = sum;
				} else if (max < sum) {
					max = sum;
				}
			}
		}
		System.out.println("Minimum = " + min);
		System.out.println("Maximum = " + max);
	}

	/**
	 * Calculates the subarray sum using prefix array method to optimized the code.
	 * and also prints the maximum sum from all the subarray.
	 * 
	 * @param arr : Arrays of Integer to be passed to Calculates the subarray sum.
	 */
	public static void PrefixSubMax(int arr[]) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int prefix[] = new int[arr.length];
		// calculation of prefix array
		prefix[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}
		System.out.println("Prefix Array as : " + Arrays.toString(prefix));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
				System.out.println("Sum = " + sum);
				if (max < sum) {
					max = sum;
				}
			}
		}
		System.out.println("Maximum = " + max);
	}

	public static void main(String[] args) {
		int arr[] = { 1, -2, 6, -1, 3 };
		printSubarray(arr);
		SubArraySumMinMax(arr);
		PrefixSubMax(arr);
	}
}
