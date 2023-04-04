package question.Recursion;

public class FindAllOccurences {

	/*
	 * Question 1 For a given integer array of size N. You have to find all the
	 * occurrences (indices) of a given element (Key) and print them. Use a
	 * recursive function to solve this problem.
	 */

	public static void printOccurences(int arr[], int key, int n) {
		if (n == arr.length) {
			return;
		}
		if (arr[n] == key) {
			System.out.print(n + " ");
		}
		printOccurences(arr, key, n + 1);
	}

	public static void main(String[] args) {
		/*
		 * Sample Input . arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2), key = 2 Sample Output: 1
		 * 5 7 8
		 */
		int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
		int key = 2;
		printOccurences(arr, key, 0);
	}

}
