package tutorial.Stack;

import java.util.Stack;

public class Max_Area_In_Histogram {

	/**
	 * Given an array of integer heights representing the histogram's bar height
	 * where the width of each bar is 1,return the area of the largest rectangle of
	 * the histogram.
	 * 
	 * @param arr of the heights
	 * @return largest area of the rectangle.
	 */
	public static int maxArea(int arr[]) {
		int maxArea = 0;
		int[] nsl = new int[arr.length];
		int[] nsr = new int[arr.length];

		Stack<Integer> s = new Stack<Integer>();

		// calculating next smaller right element
		for (int i = arr.length - 1; i >= 0; i--) {
			// poping the values greater than current element
			while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
				s.pop();
			}
			if (s.isEmpty()) {
				nsr[i] = arr.length;
			} else {
				nsr[i] = s.peek();
			}
			s.push(i);
		}

		s.clear();

		// calculating the next smaller left element
		for (int i = 0; i < arr.length; i++) {
			// popping the values that are greater than the current element
			while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
				s.pop();
			}
			if (s.isEmpty()) {
				nsl[i] = -1;
			} else {
				nsl[i] = s.peek();
			}
			s.push(i);
		}

		// calculating the maximum area
		for (int i = 0; i < arr.length; i++) {
			int height = arr[i];
			int width = nsr[i] - nsl[i] - 1;
			int currArea = height * width;
			maxArea = Math.max(maxArea, currArea);
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 5, 6, 2, 3 };
		System.out.println(maxArea(arr));
	}

}
