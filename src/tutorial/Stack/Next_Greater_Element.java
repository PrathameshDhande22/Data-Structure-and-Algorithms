package tutorial.Stack;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element {

	/**
	 * The next Greater Element of some element X in an array is the first greater
	 * element that is to the right of x in the some array.
	 * 
	 * @param arr of the number.
	 * @return array of the next greater element from the arr
	 */
	public static int[] nextGreater(int[] arr) {
		int nextGr[] = new int[arr.length];
		Stack<Integer> s = new Stack<Integer>();

		for (int i = arr.length - 1; i >= 0; i--) {
			// pop if element is smaller than current element
			while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
				s.pop();
			}

			// if stack is empty then -1 else if found the greater add the index in the
			// nextGr
			if (s.isEmpty()) {
				nextGr[i] = -1;
			} else {
				nextGr[i] = arr[s.peek()];
			}

			// push the index in the stack.
			s.push(i);
		}
		return nextGr;
	}

	public static void main(String[] args) {
		int arr[] = { 6, 8, 9, 1, 3 };
		System.out.println(Arrays.toString(nextGreater(arr)));
	}

}
