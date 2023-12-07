package tutorial.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Find if any pair in a sorted & Rotated ArrayList has a target sum.
 */
public class PairSum2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 11, 15, 6, 8, 9, 10);
		int target = 16;
		System.out.println(pairSum2(list, target));

	}

	/**
	 * Finds out the pivot point or breaking point of the sorted and rotated
	 * arraylist.
	 * 
	 * @param list Elements to find the pivot point
	 * @return pivot point
	 */
	private static int pivotPoint(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > list.get(i + 1)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Optimal Solution, Brute Force of Pair sum 1 can also work here. Time
	 * Complexity of these function is O(n).
	 * 
	 * @param list   of Elements
	 * @param target to find the pair of sum from the list of elements
	 * @return True if it's possible to find the pair of sum of given target sum
	 *         otherwise false.
	 */
	public static boolean pairSum2(ArrayList<Integer> list, int target) {
		// calculating the breaking point or pivot point
		int pivot = pivotPoint(list);
		int n = list.size();

		int lp = pivot + 1, rp = pivot;
		while (lp != rp) {
			if (list.get(lp) + list.get(rp) == target) {
				return true;
			} else if (list.get(lp) + list.get(rp) < target) {
				lp = (lp + 1) % n;
			} else {
				rp = (n + rp - 1) % n;
			}
		}

		return false;
	}

}
