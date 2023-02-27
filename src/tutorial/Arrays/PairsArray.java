package tutorial.Arrays;

public class PairsArray {

	/**
	 * Makes the Pairs from the array it also prints the total pairs that can be
	 * formed.
	 * 
	 * @param arr Array is given for printing pairs.
	 */
	public static void printPairs(int arr[]) {
		int tp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				System.out.print("(" + arr[i] + "," + arr[j] + ")");
				tp++;
			}
			System.out.println();
		}
		System.out.println("Total Pairs = " + tp);
	}

	/**
	 * It Simply Givess the total pairs that can be formed using the given arr
	 * 
	 * @param arr : Array is given to calculate the total pairs using the formula.
	 * 
	 * @return the total pairs that can be formed.
	 */
	public static int getTotalPairs(int arr[]) {
		return (arr.length * (arr.length - 1)) / 2;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		printPairs(arr);
		System.out.println("Pairs = " + getTotalPairs(arr));
	}

}
